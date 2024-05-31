package com.ohgiraffers.semi_project.admin.contorller;

import com.ohgiraffers.semi_project.admin.model.dto.AdminEmployeeDTO;
import com.ohgiraffers.semi_project.admin.model.dto.NoticeDTO;
import com.ohgiraffers.semi_project.admin.model.service.AdminService;
import com.ohgiraffers.semi_project.auth.model.service.Userdata;
import com.ohgiraffers.semi_project.subpage.edoc.model.dto.EdocFormCtDTO;
import com.ohgiraffers.semi_project.subpage.edoc.model.dto.EdocFromEdocCtDTO;
import com.ohgiraffers.semi_project.subpage.edoc.model.dto.SelectEdocListDTO;
import com.ohgiraffers.semi_project.subpage.edoc.model.dto.UploadFileDTO;
import com.ohgiraffers.semi_project.subpage.edoc.model.service.EdocService;
import com.ohgiraffers.semi_project.subpage.main.controller.SidebarController;
import com.ohgiraffers.semi_project.subpage.main.model.service.MainService;

import com.ohgiraffers.semi_project.user.model.dto.SignupDTO;

import com.ohgiraffers.semi_project.user.model.dto.LoginUserDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import java.io.IOException;
import java.sql.Date;
import java.util.*;

@Controller
@RequestMapping("/admin")
public class AdminController {


    private AdminService adminService;
    private final SidebarController sidebarController;
    private final EdocService edocService;

    @Autowired
    public AdminController(SidebarController sidebarController, EdocService edocService, AdminService adminService) {
        this.sidebarController = sidebarController;
        this.edocService = edocService;
        this.adminService = adminService;
    }

    @GetMapping("/admin")
    public String notice(Model model){
        sidebarController.getSidebar(model);
        sidebarController.getHeader(model);

//        List<EdocFromEdocCtDTO> edocList = edocService.selectEdoc();
//        model.addAttribute("edocList", edocList);

        List<NoticeDTO> noticeList = adminService.findnotice();
        model.addAttribute("noticeList", noticeList);



        // 도아 전체 사원조회
        List<AdminEmployeeDTO> employeeList = adminService.findEmployee();
        model.addAttribute("employeeList", employeeList);

        System.out.println("noticeList = " + noticeList);


        return "admin/admin";
    }

    @GetMapping("/admin/notice")
    public String noticecode(@RequestParam int code ,Model model){
        System.out.println("code = " + code);
        sidebarController.getSidebar(model);
        sidebarController.getHeader(model);

        NoticeDTO noticeDTO = adminService.findByCodePage(code);
        model.addAttribute("noticeDTO",noticeDTO);
//        System.out.println("noticeDTO = " + noticeDTO);
        return "admin/notice";
    }

    @PostMapping("/updateNotice")
    public String updateNotice(@RequestParam Map<String, String> params) {
        NoticeDTO noticeDTO = new NoticeDTO();
        noticeDTO.setNoticeId(Integer.parseInt(params.get("noticeId")));
        noticeDTO.setNoticeTitle(params.get("noticeTitle"));
        noticeDTO.setNoticeContent(params.get("noticeContent"));
        noticeDTO.setNoticeCreationDate(Date.valueOf(params.get("noticeCreationDate")));
//        System.out.println("noticeDTO = " + noticeDTO);
        int Notice = adminService.updateNotice(noticeDTO);
        return "redirect:/admin/admin"; // 업데이트 후 이동할 페이지
    }


    // 도아 개별 사원조회
    @GetMapping("search")
    public String selectEmployee(@RequestParam Map<String, Object> search, Model model){

        sidebarController.getSidebar(model);
        sidebarController.getHeader(model);

        List<AdminEmployeeDTO> employeeDTO = adminService.findSelectEmployee(search);
        model.addAttribute("employeeList", employeeDTO);

        List<EdocFromEdocCtDTO> edocList = edocService.selectEdoc();
        model.addAttribute("edocList", edocList);

        List<NoticeDTO> noticeList = adminService.findnotice();
        model.addAttribute("noticeList", noticeList);

        return "admin/admin";
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
        System.out.println("map = " + map);
        adminService.updateEmployee(map);


        return "redirect:admin";

    }


    @PostMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam int user_id){

        System.out.println("user_id = " + user_id);
        adminService.deleteEmployee(user_id);

        return "redirect:admin";
    }




//    @GetMapping("/edoc")
//    public String getEdocList(@RequestParam(value = "filter", required = false) String filter, Model model) {
//        sidebarController.getSidebar(model);
//        sidebarController.getHeader(model);
//
//        List<EdocFromEdocCtDTO> edocList;
//        if (filter == null || filter.equals("all")) {
//            edocList = edocService.selectEdoc();
//        } else {
//            edocList = edocService.getFilteredEdocs(filter);
//        }
//        model.addAttribute("edocList", edocList);
//
//        return "admin/admin";
//    }


    @GetMapping("/your-backend-endpoint")
    @ResponseBody
    public List<EdocFromEdocCtDTO>  getFilteredEdocList(@RequestParam String filter) {
        List<EdocFromEdocCtDTO>  edocList = edocService.generateEdocListHtml(filter);


        System.out.println(edocList);

        return edocList;
    }



    @GetMapping("/edocFrom/selectEdocList/{edocFormCtNo}")
    public String selectEdoc(@PathVariable("edocFormCtNo") String edocFormCtNo, Model model) {
        sidebarController.getSidebar(model);
        sidebarController.getHeader(model);
        // Ajax 요청으로부터 edoc_form_ct_no 값을 가져옵니다.


        // 해당 문서 번호에 해당하는 정보를 조회합니다.
        SelectEdocListDTO insertedEdoc = edocService.selectEdocList2(edocFormCtNo);

        byte[] imageData = insertedEdoc.getEmployee_sign();
        byte[] imageData2 = insertedEdoc.getAdmin_sign();

        String base64ImageDate = "";
        String base64ImageDate2 = "";

        if (imageData != null) {
            base64ImageDate = Base64.getEncoder().encodeToString(imageData);
        }

        if (imageData2 != null) {
            base64ImageDate2 = Base64.getEncoder().encodeToString(imageData2);
        }

        model.addAttribute("employeeSign", base64ImageDate);
        model.addAttribute("adminSign", base64ImageDate2);

//         모델에 조회된 정보를 추가합니다.
        model.addAttribute("insertedEdoc", insertedEdoc);


        return "admin/selectEdocList2";
    }

    @PostMapping("/uploadFile")
    public String uploadFile(
            @RequestParam("admin_sign") MultipartFile admin_sign,
            @RequestParam("edoc_form_ct_no") String edoc_form_ct_no,

            RedirectAttributes rttr, Locale locale,
            Model model) throws IOException {

        sidebarController.getSidebar(model);
        sidebarController.getHeader(model);

        SelectEdocListDTO insertedEdoc = edocService.selectEdocList2(edoc_form_ct_no);
        int user_id = insertedEdoc.getUser_id();

        // 파일 데이터를 byte 배열로 변환하여 DTO 객체에 설정
        byte[] adminSignBytes = admin_sign.getBytes();
        UploadFileDTO newFile = new UploadFileDTO();
        newFile.setAdmin_sign(adminSignBytes);
        newFile.setEdoc_form_ct_no(Integer.parseInt(edoc_form_ct_no));
        newFile.setUser_id(user_id);

//        사원 사인 업로드 기능 + DB 에서 자동으로 생성된 edoc_form_ct_no 값 갖고 오는 코드
        edocService.uploadAdminFile(newFile);

        String edocFormCtNo = edoc_form_ct_no;

        return "redirect:/admin/edocFrom/selectEdocList/" + edocFormCtNo;
    }

    @PostMapping("/updateStatus")
    public String registEdoc(@RequestParam("reason_return") String reason_return,
                             @RequestParam("edoc_form_ct_no") String edoc_form_ct_no,
                             @RequestParam("action") String action,
                             Model model) {

        EdocFormCtDTO edocFormCtDTO = new EdocFormCtDTO();
        edocFormCtDTO.setEdoc_form_ct_no(Integer.parseInt(edoc_form_ct_no));
        edocFormCtDTO.setReason_return(reason_return);
        edocFormCtDTO.setEdoc_status(action);


        edocService.updateSatus(edocFormCtDTO);


        // 변경된 문서 번호로 리다이렉트
        return "redirect:/admin/edocFrom/selectEdocList/" + edoc_form_ct_no;
    }

}
