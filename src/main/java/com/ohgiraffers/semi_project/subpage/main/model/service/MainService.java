package com.ohgiraffers.semi_project.subpage.main.model.service;

import com.ohgiraffers.semi_project.subpage.edoc.model.dao.EdocMapper;
import com.ohgiraffers.semi_project.subpage.main.model.dao.MainMapper;
import com.ohgiraffers.semi_project.subpage.main.model.dto.NoticeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
