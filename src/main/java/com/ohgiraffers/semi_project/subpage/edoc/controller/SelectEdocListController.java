package com.ohgiraffers.semi_project.subpage.edoc.controller;

import com.ohgiraffers.semi_project.subpage.edoc.model.dto.EdocFormCtDTO;
import com.ohgiraffers.semi_project.subpage.edoc.model.dto.SelectEdocListDTO;
import com.ohgiraffers.semi_project.subpage.edoc.model.service.EdocService;
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
import java.util.Locale;
import java.util.Map;

@Controller
@RequestMapping("/subpage")
public class SelectEdocListController {


    private static final Logger logger = LogManager.getLogger(EdocFormCtFunctionController.class);

    private final EdocService edocService;
    private final MessageSource messageSource;

    @Autowired
    private HttpServletRequest request;

    public SelectEdocListController(EdocService edocService, MessageSource messageSource) {
        this.edocService = edocService;
        this.messageSource = messageSource;
    }


    @PostMapping("/edocFrom/SelectEdocList")
    @ResponseBody
    public String selectEdoc(@RequestBody Map<String, String> requestData, Model model) {
        // Ajax 요청으로부터 edoc_form_ct_no 값을 가져옵니다.
        String edocFormCtNo = requestData.get("edoc_form_ct_no");

        // 해당 문서 번호에 해당하는 정보를 조회합니다.
        SelectEdocListDTO selectedEdoc = edocService.selectEdocList2(edocFormCtNo);


        System.out.println("여기");
        System.out.println(selectedEdoc.getEdoc_form_ct_no());
        System.out.println(Arrays.toString(selectedEdoc.getAdmin_sign()));

        // 모델에 조회된 정보를 추가합니다.
        model.addAttribute("selectedEdoc", selectedEdoc);

        return "subpage/edocFrom/SelectEdocList";
    }




}
