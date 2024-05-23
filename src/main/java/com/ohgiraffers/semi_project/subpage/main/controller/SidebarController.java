package com.ohgiraffers.semi_project.subpage.main.controller;

import com.ohgiraffers.semi_project.auth.model.service.Userdata;
import com.ohgiraffers.semi_project.subpage.edoc.model.dto.EdocFormDTO;
import com.ohgiraffers.semi_project.subpage.main.model.dto.SidebarImageDTO;
import com.ohgiraffers.semi_project.subpage.main.model.service.MainService;
import com.ohgiraffers.semi_project.user.model.dto.LoginUserDTO;
import com.ohgiraffers.semi_project.user.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
public class SidebarController {

    private final MainService mainService;

    @Autowired
    public SidebarController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping("/sidebar")
    public String getSidebar(Model model) {

        Userdata userDate = new Userdata();
        LoginUserDTO userDTO = userDate.getloginUserDTO();
        int user_no = userDTO.getUserCode();
        System.out.println(user_no);

        Map<String, Object> selectSidebar = mainService.sidebarImage(user_no);


        model.addAttribute("koreaName", selectSidebar.get("koreaName"));
        model.addAttribute("base64ImageData", selectSidebar.get("base64ImageData"));

        return "common/sidebar";
    }

    @GetMapping("/header")
    public String getHeader(Model model) {

        Userdata userDate = new Userdata();
        LoginUserDTO userDTO = userDate.getloginUserDTO();
        int user_no = userDTO.getUserCode();
        System.out.println(user_no);

        Map<String, Object> selectSidebar = mainService.sidebarImage(user_no);

        model.addAttribute("base64ImageData", selectSidebar.get("base64ImageData"));

        return "common/header";
    }
}
