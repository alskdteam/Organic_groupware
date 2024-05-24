package com.ohgiraffers.semi_project.subpage.main.model.service;

import com.ohgiraffers.semi_project.subpage.edoc.model.dao.EdocMapper;
import com.ohgiraffers.semi_project.subpage.main.model.dao.MainMapper;
import com.ohgiraffers.semi_project.subpage.main.model.dto.CommuteDTO;
import com.ohgiraffers.semi_project.subpage.main.model.dto.NoticeDTO;
import com.ohgiraffers.semi_project.subpage.main.model.dto.SidebarImageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MainService {

    private final MainMapper mainMapper;

    @Autowired
    public MainService(MainMapper mainMapper) {
        this.mainMapper = mainMapper;
    }

    public List<NoticeDTO> selectNotice() {

        return mainMapper.selectNoticeList();

    }

//    사이드바 이미지 갖고오기
    public Map<String, Object> sidebarImage(int user_no) {

        List<SidebarImageDTO> selectProfile = mainMapper.selectSidebar(user_no);

        String koreaName = "";
        String base64ImageData = null;

        for (SidebarImageDTO sidebarImageDTO : selectProfile) {
            koreaName = sidebarImageDTO.getKorea_name();
            byte[] imageData = sidebarImageDTO.getProfile_image();

            base64ImageData = Base64.getEncoder().encodeToString(imageData);
        }


        Map<String, Object> result = new HashMap<>();

        result.put("koreaName", koreaName);
        result.put("base64ImageData", base64ImageData);

        return result;
    }


    public void uploadStartTime(CommuteDTO commuteDTO) {
        // 현재 출근 시간을 조회

        LocalDateTime currentTime = LocalDateTime.now();
        LocalDate commute_date = currentTime.toLocalDate();

        commuteDTO.setCommute_date(commute_date);
        CommuteDTO result = mainMapper.selectCommuteTime(commuteDTO);

        if (result == null) {
            // 출근 기록이 없으면 출근 시간을 추가
            mainMapper.uploadStartTime(commuteDTO);
            System.out.println("출근 시간이 성공적으로 업로드되었습니다.");
        } else {
            // 출근 기록이 이미 존재하면 메시지를 출력
            System.out.println("이미 출근했습니다.");
        }
    }


    public void uploadEndTime(CommuteDTO commuteDTO) {
        // 현재 퇴근 시간을 조회
        CommuteDTO result = mainMapper.selectCommuteTime(commuteDTO);

        if (result == null) {
            System.out.println("출근을 먼저 해주세요");
        } else {
            System.out.println("퇴근 되었습니다.");
            mainMapper.updateEndTime(commuteDTO);
        }

    }
}
