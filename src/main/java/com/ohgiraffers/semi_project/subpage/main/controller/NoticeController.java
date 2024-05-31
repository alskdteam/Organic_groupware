package com.ohgiraffers.semi_project.subpage.main.controller;

import com.ohgiraffers.semi_project.subpage.main.model.dto.NoticeDTO;
import com.ohgiraffers.semi_project.subpage.main.model.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;
import java.util.Map;

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

        return "login/main";
    }


    @GetMapping("/main/NoticeMain/{notice_id}")
    public String notice(Model model, @PathVariable int notice_id){

        sidebarController.getSidebar(model);
        sidebarController.getHeader(model);

        System.out.println("notice_id = " + notice_id);
        NoticeDTO noticeDTO = mainService.findNotice(notice_id);
        model.addAttribute("noticeDTO",noticeDTO);

        return "login/NoticeMain";
    }

//    @PostMapping("/NoticeMain")
//    public String noticeMain(Model model) {
//
//        System.out.println("model = " + model);
//        List<NoticeDTO> noticeDTO = mainService.findAllNotice();
//        model.addAttribute("noticeDTO", noticeDTO);
//
//
//
//        return "redirect:/login/main"; // 업데이트 후 이동할 페이지
//    }


}
