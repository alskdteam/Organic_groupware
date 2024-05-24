package com.ohgiraffers.semi_project.subpage.profile.model.dao;

import com.ohgiraffers.semi_project.subpage.edoc.model.dto.UploadFileDTO;
import com.ohgiraffers.semi_project.subpage.profile.model.dto.MemoDTO;
import com.ohgiraffers.semi_project.subpage.profile.model.dto.ProfileDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;


@Mapper
public interface ProfileMapper {

//    전체조회
    List<ProfileDTO> selectProfile(int user_no);

//    프로필 추가
    void registNewProfile(ProfileDTO newFile);



    List<MemoDTO> findMemoTitle(int userCode);

    void registMem(MemoDTO memoDTO);

//    void updateMemo(MemoDTO memoDTO);

    MemoDTO findMemoPage(int memo_id);

    int updateMemo(MemoDTO memoDTO);
//    있는지 확인
    ProfileDTO getProfileByUserNo(int userNo);


//    없으면 update 구문 실행
    void updateProfile(ProfileDTO newFile);

}

