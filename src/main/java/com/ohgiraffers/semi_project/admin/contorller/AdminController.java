package com.ohgiraffers.semi_project.admin.contorller;

import com.ohgiraffers.semi_project.admin.model.dto.NoticeDTO;
import com.ohgiraffers.semi_project.admin.model.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/admin")
    public String notice(Model model){
        List<NoticeDTO> noticeList = adminService.findnotice();
        model.addAttribute("noticeList", noticeList);
        System.out.println("noticeList = " + noticeList);
        return "admin/admin";
    }

    @GetMapping("/admin/notice")
    public String noticecode(@RequestParam int code ,Model model){
        System.out.println("code = " + code);

        NoticeDTO noticeDTO = adminService.findByCodePage(code);
        model.addAttribute(noticeDTO);
        System.out.println("noticeDTO = " + noticeDTO);
        return "admin/notice";
    }
}
