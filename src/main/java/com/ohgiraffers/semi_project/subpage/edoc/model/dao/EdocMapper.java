package com.ohgiraffers.semi_project.subpage.edoc.model.dao;

import com.ohgiraffers.semi_project.subpage.edoc.model.dto.EdocFormCtDTO;
import com.ohgiraffers.semi_project.subpage.edoc.model.dto.EdocFormDTO;
import com.ohgiraffers.semi_project.subpage.edoc.model.dto.EdocFromEdocCtDTO;
import com.ohgiraffers.semi_project.subpage.edoc.model.dto.UploadFileDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EdocMapper {


    int registNewEdoc(EdocFormCtDTO newMenu);


    List<EdocFormDTO> selectEdocForm();

    void uploadFile(UploadFileDTO newFile);

    UploadFileDTO selectFile(String employeeName);

    List<EdocFormDTO> selectEdoc();

    List<EdocFromEdocCtDTO> selectAllEdoc();

}


