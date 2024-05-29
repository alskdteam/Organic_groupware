package com.ohgiraffers.semi_project.subpage.main.controller;

import com.ohgiraffers.semi_project.subpage.main.model.dto.NoticeDTO;
import com.ohgiraffers.semi_project.subpage.main.model.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/login")
public class NoticeController {

    private final MainService mainService;
    private final SidebarController sidebarController;

    @Autowired
    public NoticeController(MainService mainService, SidebarController sidebarController) {
        this.mainService = mainService;
        this.sidebarController = sidebarController;
    }



    //    메인 뷰
    @GetMapping("/main")
    public String main(Model model) {



        sidebarController.getSidebar(model);
        sidebarController.getHeader(model);


//      공지사항
        List<NoticeDTO> selectNotice = mainService.selectNotice();

        model.addAttribute("selectNotice", selectNotice);

        System.out.println("안녕");


//        System.out.println(selectNotice);
        return "login/main";
    }

}
