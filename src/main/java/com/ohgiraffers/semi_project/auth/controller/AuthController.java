package com.ohgiraffers.semi_project.auth.controller;

import com.ohgiraffers.semi_project.auth.model.service.Userdata;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class AuthController {

    @GetMapping("/login/login")
    public void main() {}


    @GetMapping("/fail")
    public ModelAndView loginFail(ModelAndView mv, @RequestParam String message) {

        mv.addObject("message", message);
        mv.setViewName("/auth/fail");

        return mv;
    }
    //

}
