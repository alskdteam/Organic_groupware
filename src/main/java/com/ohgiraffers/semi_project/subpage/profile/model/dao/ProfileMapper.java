package com.ohgiraffers.semi_project.subpage.profile.model.dao;

import com.ohgiraffers.semi_project.subpage.edoc.model.dto.UploadFileDTO;
import com.ohgiraffers.semi_project.subpage.profile.model.dto.ProfileDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProfileMapper {


    void registNewProfile(ProfileDTO newFile);

}

