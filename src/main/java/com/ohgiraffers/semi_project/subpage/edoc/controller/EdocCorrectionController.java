package com.ohgiraffers.semi_project.subpage.edoc.controller;

import com.ohgiraffers.semi_project.subpage.edoc.model.dto.EdocFormDTO;
import com.ohgiraffers.semi_project.subpage.edoc.model.service.EdocService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/subpage")
public class EdocCorrectionController {


    private final EdocService edocService;


    @Autowired
    public EdocCorrectionController(EdocService edocService, MessageSource messageSource) {
        this.edocService = edocService;
    }


//    문서처리 양식

    @GetMapping("/edoc_correction")
    public String edoc(Model model) {
        List<EdocFormDTO> edocFormList = edocService.selectEdocForm();

        model.addAttribute("edocFormList", edocFormList);

        System.out.println(edocFormList);
        return "subpage/edoc_correction";
    }





}
