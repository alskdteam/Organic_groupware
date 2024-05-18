package com.ohgiraffers.semi_project.subpage.edoc.controller;

import com.ohgiraffers.semi_project.subpage.edoc.model.dto.EdocFormDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/subpage")
public class EdocFormCt {


    @GetMapping("/edoc_form_ct_vacation")
    public String vacation() {
        return "subpage/edocFrom/vacation";
    }

    @GetMapping("/edoc_form_ct_draft")
    public String draft() {
        return "subpage/edocFrom/draft";
    }

    @GetMapping("/edoc_form_ct_closing")
    public String closing() {
        return "subpage/edocFrom/closing";
    }

    @GetMapping("/edoc_form_ct_meeting")
    public String meeting() {
        return "subpage/edocFrom/meeting";
    }
}
