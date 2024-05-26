package com.ohgiraffers.semi_project.admin.contorller;

import com.ohgiraffers.semi_project.admin.model.dto.AdminEmployeeDTO;
import com.ohgiraffers.semi_project.admin.model.dto.NoticeDTO;
import com.ohgiraffers.semi_project.admin.model.service.AdminService;
import com.ohgiraffers.semi_project.subpage.main.controller.SidebarController;
import com.ohgiraffers.semi_project.subpage.main.model.service.MainService;
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


    private AdminService adminService;
    private final SidebarController sidebarController;

    @Autowired
    public AdminController(SidebarController sidebarController, AdminService adminService) {
        this.sidebarController = sidebarController;
        this.adminService = adminService;
    }

    @GetMapping("/admin")
    public String notice(Model model){
        sidebarController.getSidebar(model);
        sidebarController.getHeader(model);

        
        List<NoticeDTO> noticeList = adminService.findnotice();
        model.addAttribute("noticeList", noticeList);
        System.out.println("noticeList = " + noticeList);

        // 도아 전체 사원조회
        List<AdminEmployeeDTO> employeeList = adminService.findEmployee();
        model.addAttribute("employeeList", employeeList);

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

    // 도아 개별 사원조회
    @GetMapping("search")
    public String selectEmployee(@RequestParam Map<String, String> search, Model model){

        List<AdminEmployeeDTO> employeeDTO = adminService.findSelectEmployee(search);
        model.addAttribute("employeeList", employeeDTO);

        return "/admin/admin";
    }

}
