package com.ohgiraffers.semi_project.subpage.profile.controller;


import com.ohgiraffers.semi_project.subpage.edoc.model.dto.EdocFormCtDTO;
import com.ohgiraffers.semi_project.subpage.edoc.model.dto.EdocFormDTO;
import com.ohgiraffers.semi_project.subpage.edoc.model.dto.UploadFileDTO;
import com.ohgiraffers.semi_project.subpage.edoc.model.service.EdocService;
import com.ohgiraffers.semi_project.subpage.profile.model.dto.ProfileDTO;
import com.ohgiraffers.semi_project.subpage.profile.model.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

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
            @RequestParam("user_name") String user_name,
            @RequestParam("english_name") String english_name,
            @RequestParam("phone_number") String phone_number,
            @RequestParam("email") String email,
            Model model) throws IOException {

        byte[] profileImageBytes = profile_image.getBytes();
        ProfileDTO newFile = new ProfileDTO();
        newFile.setProfile_image(profileImageBytes);
        newFile.setUser_name(user_name);
        newFile.setEnglish_name(english_name);
        newFile.setPhone_number(phone_number);
        newFile.setEmail(email);

        System.out.println(newFile.getEmail());

        profileService.registNewProfile(newFile);






        return "subpage/profile";
    }


    
}
