package com.ohgiraffers.semi_project.subpage.edoc.controller;

import com.ohgiraffers.semi_project.subpage.edoc.model.dto.EdocFormCtDTO;
import com.ohgiraffers.semi_project.subpage.edoc.model.dto.EdocFromEdocCtDTO;
import com.ohgiraffers.semi_project.subpage.edoc.model.dto.SelectEdocListDTO;
import com.ohgiraffers.semi_project.subpage.edoc.model.service.EdocService;
import com.ohgiraffers.semi_project.subpage.main.controller.SidebarController;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import java.util.Map;

@Controller
@RequestMapping("/subpage")
public class SelectEdocListController {


    private static final Logger logger = LogManager.getLogger(EdocFormCtFunctionController.class);

    private final EdocService edocService;
    private final MessageSource messageSource;
    private final SidebarController sidebarController;



    @Autowired
    private HttpServletRequest request;

    @Autowired
    public SelectEdocListController(EdocService edocService, MessageSource messageSource, SidebarController sidebarController) {
        this.edocService = edocService;
        this.messageSource = messageSource;
        this.sidebarController = sidebarController;
    }

    //    전자결재 서류 조회 컨트롤러
    @GetMapping("/edocFrom/selectEdocList/{edocFormCtNo}")
    public String selectEdoc(@PathVariable("edocFormCtNo") String edocFormCtNo, Model model) {
        sidebarController.getSidebar(model);
        sidebarController.getHeader(model);
        // Ajax 요청으로부터 edoc_form_ct_no 값을 가져옵니다.


        // 해당 문서 번호에 해당하는 정보를 조회합니다.
        SelectEdocListDTO insertedEdoc = edocService.selectEdocList2(edocFormCtNo);


        System.out.println("여기");
        System.out.println(insertedEdoc.getEdoc_form_ct_no());

        byte[] imageData = insertedEdoc.getEmployee_sign();
        byte[] imageData2 = insertedEdoc.getAdmin_sign();

        String base64ImageDate = "";
        String base64ImageDate2 = "";

        if (imageData != null) {
            base64ImageDate = Base64.getEncoder().encodeToString(imageData);
        }

        if (imageData2 != null) {
            base64ImageDate2 = Base64.getEncoder().encodeToString(imageData2);
        }

        model.addAttribute("employeeSign", base64ImageDate);
        model.addAttribute("adminSign", base64ImageDate2);

//         모델에 조회된 정보를 추가합니다.
        model.addAttribute("insertedEdoc", insertedEdoc);


        return "subpage/edocFrom/selectEdocList2";
    }







}
