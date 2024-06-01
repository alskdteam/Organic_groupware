package com.ohgiraffers.semi_project.subpage.main.model.service;

import com.ohgiraffers.semi_project.subpage.main.model.dao.MainMapper;
import com.ohgiraffers.semi_project.subpage.main.model.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

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
//         오늘 날짜 기반으로 조히
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


//    업데이트
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

    public Map<String, Object> selectCommute(CommuteDTO commuteDTO) {

        LocalDateTime currentTime = LocalDateTime.now();
        LocalDate commute_date = currentTime.toLocalDate();

        commuteDTO.setCommute_date(commute_date);
        // 오늘 날짜 기반으로 조회
        CommuteDTO selectCommute = mainMapper.selectCommuteTime(commuteDTO);

        Map<String, Object> result = new HashMap<>();

        if (selectCommute == null) {
            System.out.println("출퇴근 기록이 없습니다..");
        } else {
            result.put("commute1", selectCommute.getGo_work());
            result.put("commute2", selectCommute.getLeave_work());
        }

        return result;
    }


    public List<CarDTO> selectDashboard(CarDTO carDTO) {

        List<CarDTO> result = mainMapper.selectDashboard(carDTO);

//        // null 값과 빈 값을 가진 객체를 제외하고 필터링
//        List<CarDTO> nonEmptyResult = result.stream()
//                .filter(car -> car != null && car.getVehicle_name() != null && !car.getVehicle_name().isEmpty())
//                .collect(Collectors.toList());

        return result;
    }

    public List<RentalDTO> selectRental(RentalDTO rentalDTO) {

        List<RentalDTO> result = mainMapper.selectRental(rentalDTO);
//        System.out.println("result" + result);

//        for (RentalDTO rental : result) {
//            ItemDTO itemDTO = rental.getItemDTO();
//            String itemName = itemDTO.getItem_name();
//            System.out.println("Item Name: " + itemName);
//        }

        return result;
    }


    public int noticeMain(NoticeDTO noticeDTO) {

        return mainMapper.noticeMain(noticeDTO);
    }

    public NoticeDTO findNotice(int noticeId) {

        return mainMapper.findNotice(noticeId);
    }


    public List<NoticeDTO> findAllNotice() {

        return mainMapper.findAllNotice();
    }
}
