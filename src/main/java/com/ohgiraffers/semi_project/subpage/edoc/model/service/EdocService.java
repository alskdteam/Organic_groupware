package com.ohgiraffers.semi_project.subpage.edoc.model.service;

import com.ohgiraffers.semi_project.auth.model.service.Userdata;
import com.ohgiraffers.semi_project.subpage.edoc.model.dao.EdocMapper;
import com.ohgiraffers.semi_project.subpage.edoc.model.dto.*;
import com.ohgiraffers.semi_project.user.model.dto.LoginUserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EdocService {

    private final EdocMapper edocMapper;

    @Autowired
    public EdocService(EdocMapper edocMapper) {
        this.edocMapper = edocMapper;
    }

    //    문서 처리
//    @Transactional
//    public int registNewEdoc(EdocFormCtDTO newEdoc) {
//
//        return edocMapper.registNewEdoc(newEdoc);
//    }

    @Transactional
    public EdocFormCtDTO registNewEdoc(EdocFormCtDTO newEdoc) {
        edocMapper.registNewEdoc(newEdoc);
        return newEdoc; // 데이베이스에 insert 한 값 들고가기
    }

//    문서처리 양식 조회

    public List<EdocFormDTO> selectEdocForm() {
        return edocMapper.selectEdocForm();
    }

    // 문서처리 이미지 업로드
    @Transactional
    public void uploadFile(UploadFileDTO newFile) {

        edocMapper.uploadFile(newFile);
    }

    //    이미지 조회
    public UploadFileDTO getUploadedFile(String employeeName) {

        return edocMapper.selectFile(employeeName);
    }

    // 결재리스트 조회
    public List<EdocFromEdocCtDTO> selectEdoc() {

        return edocMapper.selectAllEdoc();
    }


//    EdocList 조회 ( 서류 작성시)
    public EdocFromEdocCtDTO selectEdocList(int i) {
        return edocMapper.selectEdocList(i);
    }


// EdocList 조회( 결재리스트에서)
    public SelectEdocListDTO selectEdocList2(String edocFormCtNo) {

        return edocMapper.selectEdocList2(edocFormCtNo);
    }

    public List<EdocFromEdocCtDTO> getFilteredEdocs(String filter) {
        Userdata userDate = new Userdata();
        LoginUserDTO userDTO = userDate.getloginUserDTO();
        int user_id = Integer.parseInt(userDTO.getUserId());

        switch (filter) {
            case "progress":
                return edocMapper.findByStatus("진행중");
            case "rejected":
                return edocMapper.findByStatus("반려");
            case "my":
                return edocMapper.findByUserId(user_id);
            default:
                return selectEdoc();
        }
    }

    public void uploadAdminFile(UploadFileDTO newFile) {
        edocMapper.uploadAdminFile(newFile);
    }

    public void updateSatus(EdocFormCtDTO edocFormCtDTO) {


        edocMapper.updateStatus(edocFormCtDTO);
    }
}


