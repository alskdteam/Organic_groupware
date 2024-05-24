package com.ohgiraffers.semi_project.subpage.profile.model.dao;

import com.ohgiraffers.semi_project.subpage.edoc.model.dto.UploadFileDTO;
import com.ohgiraffers.semi_project.subpage.profile.model.dto.MemoDTO;
import com.ohgiraffers.semi_project.subpage.profile.model.dto.ProfileDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ProfileMapper {


    void registNewProfile(ProfileDTO newFile);



    List<MemoDTO> findMemoTitle(int userCode);

    void registMem(MemoDTO memoDTO);

    void updateMemo(MemoDTO memoDTO);

    MemoDTO findMemoPage(int memo_id);

    int updateMemoo(MemoDTO memoDTO);
}

