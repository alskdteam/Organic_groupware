package com.ohgiraffers.semi_project.m_subpage.m_edoc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/m_subpage")
public class M_EdocController {

    @GetMapping("/m_edoc")
    public void m_edoc() {
    }

}
