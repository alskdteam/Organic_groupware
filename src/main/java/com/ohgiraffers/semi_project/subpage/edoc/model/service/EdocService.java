package com.ohgiraffers.semi_project.subpage.edoc.model.service;

import com.ohgiraffers.semi_project.subpage.edoc.model.dao.EdocMapper;
import com.ohgiraffers.semi_project.subpage.edoc.model.dto.EdocFormCtDTO;
import com.ohgiraffers.semi_project.subpage.edoc.model.dto.EdocFormDTO;
import com.ohgiraffers.semi_project.subpage.edoc.model.dto.EdocFromEdocCtDTO;
import com.ohgiraffers.semi_project.subpage.edoc.model.dto.UploadFileDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

@Service
public class EdocService {

    private final EdocMapper edocMapper;

    @Autowired
    public EdocService(EdocMapper edocMapper) {
        this.edocMapper = edocMapper;
    }

    //    문서 처리
    @Transactional
    public int registNewEdoc(EdocFormCtDTO newEdoc) {

        return edocMapper.registNewEdoc(newEdoc);
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


    public List<EdocFromEdocCtDTO> selectEdoc() {

        return edocMapper.selectAllEdoc();
    }
}


