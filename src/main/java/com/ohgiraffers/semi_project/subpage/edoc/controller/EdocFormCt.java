package com.ohgiraffers.semi_project.subpage.edoc.controller;

import com.ohgiraffers.semi_project.subpage.edoc.model.dto.EdocFormDTO;
import com.ohgiraffers.semi_project.subpage.main.controller.SidebarController;
import com.ohgiraffers.semi_project.subpage.main.model.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/subpage")
public class EdocFormCt {

    private final MainService mainService;
    private final SidebarController sidebarController;

    @Autowired
    public EdocFormCt(MainService mainService, SidebarController sidebarController) {
        this.mainService = mainService;
        this.sidebarController = sidebarController;
    }

    @GetMapping("/edoc_form_ct_vacation")
    public String vacation(Model model) {
        sidebarController.getSidebar(model);
        sidebarController.getHeader(model);
        return "subpage/edocFrom/vacation";
    }

    @GetMapping("/edoc_form_ct_draft")
    public String draft(Model model) {
        sidebarController.getSidebar(model);
        sidebarController.getHeader(model);
        return "subpage/edocFrom/draft";
    }

    @GetMapping("/edoc_form_ct_closing")
    public String closing(Model model) {
        sidebarController.getSidebar(model);
        sidebarController.getHeader(model);
        return "subpage/edocFrom/closing";
    }

    @GetMapping("/edoc_form_ct_meeting")
    public String meeting(Model model) {
        sidebarController.getSidebar(model);
        sidebarController.getHeader(model);
        return "subpage/edocFrom/meeting";
    }
}
