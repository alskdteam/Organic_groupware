package com.ohgiraffers.semi_project.subpage.car.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/subpage")
public class CarController {

    @GetMapping("/car")
    public void car(){}
    
    
}

