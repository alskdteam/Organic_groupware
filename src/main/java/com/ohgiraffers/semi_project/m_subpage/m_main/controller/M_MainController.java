package com.ohgiraffers.semi_project.m_subpage.m_main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/m_subpage")
public class M_MainController {

    @GetMapping("/m_main")
    public void m_main() {
    }
}