package com.ohgiraffers.semi_project.admin.model.service;

import com.ohgiraffers.semi_project.admin.model.dao.AdminMapper;
import com.ohgiraffers.semi_project.admin.model.dto.AdminEmployeeDTO;
import com.ohgiraffers.semi_project.admin.model.dto.NoticeDTO;
import com.ohgiraffers.semi_project.user.model.dto.SignupDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AdminService {

    private final AdminMapper adminMapper;

    @Autowired
    public AdminService(AdminMapper adminMapper) {
        this.adminMapper = adminMapper;
    }

    public List<NoticeDTO> findnotice() {

        return adminMapper.findnotice();
    }

    public NoticeDTO findByCodePage(int code) {

        return adminMapper.findByCodePage(code);
    }

    public int updateNotice(NoticeDTO noticeDTO) {

        return adminMapper.updateNotice(noticeDTO);
    }


    // 도아 전체사원조회
    public List<AdminEmployeeDTO> findEmployee() {

        return adminMapper.findEmployee();
    }

    // 사원 개별 조회
    public List<AdminEmployeeDTO> findSelectEmployee(Map<String, String> search) {

        return adminMapper.findSelectEmployee(search);
    }

    public AdminEmployeeDTO findByEmployee(int userNo) {

        return adminMapper.findByEmployee(userNo);
    }


    public void updateEmployee(Map<String,Object> map) {

        adminMapper.adminEmployeeDTO(map);

    }
}


