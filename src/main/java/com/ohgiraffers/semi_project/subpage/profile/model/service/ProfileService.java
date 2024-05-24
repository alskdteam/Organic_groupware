package com.ohgiraffers.semi_project.subpage.profile.model.service;

import com.ohgiraffers.semi_project.subpage.edoc.model.dao.EdocMapper;
import com.ohgiraffers.semi_project.subpage.edoc.model.dto.UploadFileDTO;
import com.ohgiraffers.semi_project.subpage.profile.model.dao.ProfileMapper;
import com.ohgiraffers.semi_project.subpage.profile.model.dto.MemoDTO;
import com.ohgiraffers.semi_project.subpage.profile.model.dto.ProfileDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

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


    public List<MemoDTO> findMemoTitle(int userCode) {

        return profileMapper.findMemoTitle(userCode);
    }

    public void registMem(MemoDTO memoDTO) {

         profileMapper.registMem(memoDTO);
    }

//    public void updateMemo(MemoDTO memoDTO) {
//        profileMapper.updateMemo(memoDTO);
//    }

    public MemoDTO findMemoPage(int memo_id) {

        return profileMapper.findMemoPage(memo_id);
    }

    public int updateMemo(MemoDTO memoDTO) {
        System.out.println("memoDTO = " + memoDTO);
        return profileMapper.updateMemo(memoDTO);
    }
}
