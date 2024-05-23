package com.ohgiraffers.semi_project.subpage.main.model.service;

import com.ohgiraffers.semi_project.subpage.edoc.model.dao.EdocMapper;
import com.ohgiraffers.semi_project.subpage.main.model.dao.MainMapper;
import com.ohgiraffers.semi_project.subpage.main.model.dto.NoticeDTO;
import com.ohgiraffers.semi_project.subpage.main.model.dto.SidebarImageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
