package com.ohgiraffers.semi_project.subpage.edoc.controller;

import com.ohgiraffers.semi_project.subpage.edoc.model.dto.EdocFormDTO;
import com.ohgiraffers.semi_project.subpage.edoc.model.dto.EdocFromEdocCtDTO;
import com.ohgiraffers.semi_project.subpage.edoc.model.service.EdocService;

import com.ohgiraffers.semi_project.subpage.main.controller.SidebarController;
import com.ohgiraffers.semi_project.subpage.main.model.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


//문서처리 리스트 조회 컨트롤러
@Controller
@RequestMapping("/subpage")
public class EdocController {

    private final EdocService edocService;

    private final MainService mainService;
    private final SidebarController sidebarController;

    @Autowired
    public EdocController(EdocService edocService, MainService mainService, SidebarController sidebarController) {
        this.edocService = edocService;
        this.mainService = mainService;
        this.sidebarController = sidebarController;
    }

    @GetMapping("/edoc")
    public String edoc(Model model) {
//        List<EdocDTO> edocList = edocService.selectEdoc();
        List<EdocFromEdocCtDTO> edocList = edocService.selectEdoc();


        sidebarController.getSidebar(model);
        sidebarController.getHeader(model);
        model.addAttribute("edocList", edocList);

        return "subpage/edoc";
    }





}
