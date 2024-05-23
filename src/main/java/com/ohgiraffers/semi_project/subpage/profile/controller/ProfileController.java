package com.ohgiraffers.semi_project.subpage.profile.controller;

import com.ohgiraffers.semi_project.auth.model.service.Userdata;
import com.ohgiraffers.semi_project.subpage.edoc.model.dto.EdocFromEdocCtDTO;
import com.ohgiraffers.semi_project.subpage.main.controller.SidebarController;
import com.ohgiraffers.semi_project.subpage.profile.model.dto.ProfileDTO;
import com.ohgiraffers.semi_project.subpage.profile.model.service.ProfileService;
import com.ohgiraffers.semi_project.user.model.dto.LoginUserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/subpage")
public class ProfileController {

    private final ProfileService profileService;
    private final SidebarController sidebarController;

    public ProfileController(ProfileService profileService, SidebarController sidebarController) {
        this.profileService = profileService;
        this.sidebarController = sidebarController;
    }

    //    페이지 전체 조회
    @GetMapping("/profile")
    public String edoc(Model model) {
        sidebarController.getSidebar(model);
        sidebarController.getHeader(model);

        Userdata userDate = new Userdata();
        LoginUserDTO userDTO = userDate.getloginUserDTO();
        int user_no = userDTO.getUserCode();

        // 서비스에서 데이터를 받아옴
        Map<String, Object> profileData = profileService.selectProfile(user_no);

        System.out.println(profileData.get("profilesWithoutImage"));

        // Add the data to the model as attributes
        model.addAttribute("profilesWithoutImage", profileData.get("profilesWithoutImage"));
        model.addAttribute("base64ImageData", profileData.get("base64ImageData"));

        return "subpage/profile";
    }


}
