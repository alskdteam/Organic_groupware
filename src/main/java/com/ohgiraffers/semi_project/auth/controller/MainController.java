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
        return "main";
    }

//    @PostMapping("main")
//    public String login(@RequestParam String user, @RequestParam String pass){
//        authService.loadUserByUsername(user);
//
//        return "login";
//    }

    @GetMapping("/admin/page")
    public String adminPage() {
        return "/admin/admin";
    }

    @GetMapping("/user/page")
    public String userPage() {
        return "/user/user";
    }

    //
    //
}
