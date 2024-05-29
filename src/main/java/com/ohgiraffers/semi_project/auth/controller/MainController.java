package com.ohgiraffers.semi_project.auth.controller;

import com.ohgiraffers.semi_project.auth.model.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    private AuthService authService;

    @GetMapping(value = {"/", "/login", "/main"})
    public String main() {
        return "login/login";
    }


    @GetMapping("/admin/page")
    public String adminPage() {
        return "admin/admin";
    }

    @GetMapping("/user/page")
    public String userPage() {
        return "user/user";
    }

}
