package com.ohgiraffers.semi_project.admin.contorller;

import com.ohgiraffers.semi_project.admin.model.dto.AdminEmployeeDTO;
import com.ohgiraffers.semi_project.admin.model.dto.NoticeDTO;
import com.ohgiraffers.semi_project.admin.model.service.AdminService;
import com.ohgiraffers.semi_project.subpage.main.controller.SidebarController;
import com.ohgiraffers.semi_project.subpage.main.model.service.MainService;
import com.ohgiraffers.semi_project.user.model.dto.SignupDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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



        @GetMapping("/updateEmployee")
    public String updateEmployee(@RequestParam int user_no, Model model){

        AdminEmployeeDTO employee = adminService.findByEmployee(user_no);
        model.addAttribute("employee",employee);

            System.out.println("employee = " + employee);

            return "admin/updateEmployee";

    }


    @PostMapping("/updateEmployee")
    public String update(@RequestParam Map<String,Object> map){
//        AdminEmployeeDTO adminEmployeeDTO = new AdminEmployeeDTO();
////        adminEmployeeDTO.setUser_no(Integer.parseInt(map.get("user_no")));
//        adminEmployeeDTO.setUser_id(Integer.parseInt(map.get("user_id")));
//        adminEmployeeDTO.setPassword(map.get("password"));
//        adminEmployeeDTO.setUser_name(map.get("user_name"));
//        adminEmployeeDTO.setUser_birth(Date.valueOf(map.get("user_birth")));
//        adminEmployeeDTO.setUser_phone_number(map.get("user_phone_number"));
//        adminEmployeeDTO.setUser_department(map.get("user_department"));
//        adminEmployeeDTO.setUser_email(map.get("user_email"));
//        adminEmployeeDTO.setUser_gender(map.get("user_gender"));
//        adminEmployeeDTO.setUser_role(map.get("user_role"));
//        adminEmployeeDTO.setJoin_date(Date.valueOf(map.get("join_date")));


        System.out.println("map = " + map);
       adminService.updateEmployee(map);


        return "redirect:/admin/admin";




    }




}

