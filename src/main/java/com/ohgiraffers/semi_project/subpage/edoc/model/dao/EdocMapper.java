package com.ohgiraffers.semi_project.subpage.edoc.model.dao;

import com.ohgiraffers.semi_project.subpage.edoc.model.dto.EdocFormDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EdocMapper {



    List<EdocFormDTO> selectEdocForm();
}


