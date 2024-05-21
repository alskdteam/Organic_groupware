package com.ohgiraffers.semi_project.admin.model.service;

import com.ohgiraffers.semi_project.admin.model.dao.AdminMapper;
import com.ohgiraffers.semi_project.admin.model.dto.NoticeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    private final AdminMapper adminMapper;

    @Autowired
    public AdminService(AdminMapper adminMapper){this.adminMapper = adminMapper;}

    public List<NoticeDTO> findnotice() {

        return adminMapper.findnotice();
    }

    public NoticeDTO findByCodePage(int code) {

        return adminMapper.findByCodePage(code);
    }
}
