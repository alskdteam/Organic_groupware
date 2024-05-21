package com.ohgiraffers.semi_project.admin.model.dao;

import com.ohgiraffers.semi_project.admin.model.dto.NoticeDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMapper {
    List<NoticeDTO> findnotice();

    NoticeDTO findByCodePage(int code);
}
