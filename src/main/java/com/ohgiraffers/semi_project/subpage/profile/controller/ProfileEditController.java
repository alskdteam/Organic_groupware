package com.ohgiraffers.semi_project.subpage.profile.controller;

import com.ohgiraffers.semi_project.auth.model.service.Userdata;
import com.ohgiraffers.semi_project.subpage.profile.model.dto.ProfileDTO;
import com.ohgiraffers.semi_project.subpage.profile.model.service.ProfileService;
import com.ohgiraffers.semi_project.user.model.dto.LoginUserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequestMapping("/subpage")
public class ProfileEditController {

    private final ProfileService profileService;

    @Autowired
    public ProfileEditController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @PostMapping("/profileEdit")
    public String profileEdit(
            @RequestParam("profile_image") MultipartFile profile_image,
            @RequestParam("korea_name") String korea_name,
            @RequestParam("english_name") String english_name,
            @RequestParam("phone_number") String phone_number,
            @RequestParam("email") String email,
            Model model) throws IOException {

        Userdata userDate = new Userdata();
        LoginUserDTO userDTO = userDate.getloginUserDTO();
        int user_no = userDTO.getUserCode();

        // ProfileDTO 객체 생성 및 데이터 설정
        ProfileDTO profileDTO = new ProfileDTO();
        profileDTO.setUser_no(user_no);
        profileDTO.setKorea_name(korea_name);
        profileDTO.setEnglish_name(english_name);
        profileDTO.setPhone_number(phone_number);
        profileDTO.setEmail(email);

        // 프로필 이미지 데이터 설정
        byte[] profileImageBytes = profile_image.getBytes();
        profileDTO.setProfile_image(profileImageBytes);

        // 프로필 등록 서비스 호출
        profileService.registNewProfile(profileDTO);

        // 결과 페이지 반환
        return "redirect:subpage/profile";
    }
}
