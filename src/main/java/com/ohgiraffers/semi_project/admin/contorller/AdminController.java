package com.ohgiraffers.semi_project.admin.contorller;

import com.ohgiraffers.semi_project.admin.model.dto.NoticeDTO;
import com.ohgiraffers.semi_project.admin.model.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Date;
import java.util.List;
import java.util.Map;

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
        model.addAttribute("noticeDTO",noticeDTO);
        System.out.println("noticeDTO = " + noticeDTO);
        return "admin/notice";
    }
    @PostMapping("/subpage/updateNotice")
    public String updateNotice(@RequestParam Map<String, String> params) {
        NoticeDTO noticeDTO = new NoticeDTO();
        noticeDTO.setNoticeId(Integer.parseInt(params.get("noticeId")));
        noticeDTO.setNoticeTitle(params.get("noticeTitle"));
        noticeDTO.setNoticeContent(params.get("noticeContent"));
        noticeDTO.setNoticeCreationDate(Date.valueOf(params.get("noticeCreationDate")));
        System.out.println("noticeDTO = " + noticeDTO);
        int Notice = adminService.updateNotice(noticeDTO);
        return "redirect:/admin/admin"; // 업데이트 후 이동할 페이지
    }
}
