package com.ohgiraffers.semi_project.subpage.profile.model.service;

import com.ohgiraffers.semi_project.subpage.edoc.model.dao.EdocMapper;
import com.ohgiraffers.semi_project.subpage.edoc.model.dto.UploadFileDTO;
import com.ohgiraffers.semi_project.subpage.profile.model.dao.ProfileMapper;
import com.ohgiraffers.semi_project.subpage.profile.model.dto.ProfileDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProfileService {

    private final ProfileMapper profileMapper;

    @Autowired
    public ProfileService(ProfileMapper profileMapper) {
        this.profileMapper = profileMapper;
    }



    @Transactional
    public void registNewProfile(ProfileDTO newFile) {

        profileMapper.registNewProfile(newFile);
    }


}
