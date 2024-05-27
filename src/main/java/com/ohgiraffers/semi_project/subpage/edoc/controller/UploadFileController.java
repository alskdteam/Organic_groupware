package com.ohgiraffers.semi_project.subpage.edoc.controller;

import com.ohgiraffers.semi_project.auth.model.service.Userdata;
import com.ohgiraffers.semi_project.subpage.edoc.model.dto.EdocFromEdocCtDTO;
import com.ohgiraffers.semi_project.subpage.edoc.model.dto.UploadFileDTO;
import com.ohgiraffers.semi_project.subpage.edoc.model.service.EdocService;
import com.ohgiraffers.semi_project.subpage.main.controller.SidebarController;
import com.ohgiraffers.semi_project.user.model.dto.LoginUserDTO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.*;


@Controller
@RequestMapping("/subpage")
public class UploadFileController {

    private static final Logger logger = LogManager.getLogger(EdocFormCtFunctionController.class);

    private final EdocService edocService;
    private final MessageSource messageSource;
    private final SidebarController sidebarController;


    public UploadFileController(EdocService edocService, MessageSource messageSource, SidebarController sidebarController) {
        this.edocService = edocService;
        this.messageSource = messageSource;
        this.sidebarController = sidebarController;
    }

    @Autowired
    private ResourceLoader resourceLoader;


    public Resource convertByteArrayToImage(byte[] bytes) throws IOException {
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        BufferedImage image = ImageIO.read(bis);
        bis.close();
        return new ByteArrayResource(bytes);
    }
    

    @PostMapping("/uploadFile2")
    public String uploadFile2(
            @RequestParam("employee_sign") MultipartFile employee_sign,
            @RequestParam("employee_name") String employee_name,
            @RequestParam("edoc_form_ct_no") String edoc_form_ct_no,

            RedirectAttributes rttr, Locale locale,
            Model model) throws IOException {

        sidebarController.getSidebar(model);
        sidebarController.getHeader(model);

        Userdata userDate = new Userdata();
        LoginUserDTO userDTO = userDate.getloginUserDTO();
        int user_id = Integer.parseInt(userDTO.getUserId());

        // 파일 데이터를 byte 배열로 변환하여 DTO 객체에 설정
        byte[] employeeSignBytes = employee_sign.getBytes();
        UploadFileDTO newFile = new UploadFileDTO();
        newFile.setEmployee_sign(employeeSignBytes);
        newFile.setEmployee_name(employee_name);
        newFile.setEdoc_form_ct_no(Integer.parseInt(edoc_form_ct_no));
        newFile.setUser_id(user_id);

//        사원 사인 업로드 기능 + DB 에서 자동으로 생성된 edoc_form_ct_no 값 갖고 오는 코드
        edocService.uploadFile(newFile);

//          가지고온 edoc_form_ct_no 를 기반으로 사진파일 갖고오기
        EdocFromEdocCtDTO insertedEdoc = edocService.selectEdocList(Integer.parseInt(edoc_form_ct_no));
        model.addAttribute("insertedEdoc", insertedEdoc);


        rttr.addFlashAttribute("successMessage", messageSource.getMessage("registMenu", null, locale));

        byte[] imageData = employeeSignBytes;

        // 바이트 배열을 Base64로 인코딩
        String base64ImageDate = Base64.getEncoder().encodeToString(imageData);
        model.addAttribute("employeeSign", base64ImageDate);



        return "subpage/edocFrom/selectEdocList2";
    }




}
