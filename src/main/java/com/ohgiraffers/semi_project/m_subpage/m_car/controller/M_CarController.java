package com.ohgiraffers.semi_project.m_subpage.m_car.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/m_subpage")
public class M_CarController {

    @GetMapping("/m_car")
    public void m_car(){}
    
    
}

