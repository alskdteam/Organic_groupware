package com.ohgiraffers.semi_project.admin.model.dao;

import com.ohgiraffers.semi_project.admin.model.dto.AdminEmployeeDTO;
import com.ohgiraffers.semi_project.admin.model.dto.NoticeDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface AdminMapper {
    List<NoticeDTO> findnotice();

    NoticeDTO findByCodePage(int code);

    int updateNotice(NoticeDTO noticeDTO);


    // 도아 - 전체 사원 조회
    List<AdminEmployeeDTO> findEmployee();

    // 사원 개별 조회
    List<AdminEmployeeDTO> findSelectEmployee(Map<String, String> search);
}
