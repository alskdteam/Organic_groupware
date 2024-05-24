package com.ohgiraffers.semi_project.subpage.profile.controller;

import com.ohgiraffers.semi_project.auth.model.service.Userdata;
import com.ohgiraffers.semi_project.subpage.edoc.model.dto.EdocFromEdocCtDTO;
import com.ohgiraffers.semi_project.subpage.profile.model.dto.ProfileDTO;
import com.ohgiraffers.semi_project.subpage.profile.model.dto.MemoDTO;

import com.ohgiraffers.semi_project.subpage.profile.model.service.ProfileService;
import com.ohgiraffers.semi_project.user.model.dto.LoginUserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/subpage")
public class ProfileController {

    private final ProfileService profileService;

    @Autowired
    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping("/profile")
    public String memo(Model model){

        Userdata userDate = new Userdata();
        LoginUserDTO userDTO = userDate.getloginUserDTO();
        int user_no = userDTO.getUserCode();
        int userCode = userDTO.getUserCode();
  
//         도아
        List<MemoDTO> memoDTOList = profileService.findMemoTitle(userCode);
        model.addAttribute("memoDTOList", memoDTOList);

        System.out.println("memoDTOList = " + memoDTOList);
  
  

  
        //  규혁 서비스에서 데이터를 받아옴
        Map<String, Object> profileData = profileService.selectProfile(user_no);
        System.out.println(profileData.get("profilesWithoutImage"));

        // Add the data to the model as attributes
        model.addAttribute("profilesWithoutImage", profileData.get("profilesWithoutImage"));


        return "subpage/profile";
    }

//   도아
    @GetMapping("/profile/memo/{memo_id}")
    public String memoInse(Model model,@PathVariable int memo_id ){
        System.out.println("memo_id = " + memo_id);

        Userdata userdata = new Userdata();
        LoginUserDTO userDTO = userdata.getloginUserDTO();
        int userCode = userDTO.getUserCode();

        MemoDTO memoDTO = profileService.findMemoPage(memo_id);
        model.addAttribute("memoDTO", memoDTO);

        System.out.println("memoDTO = " + memoDTO);
        return "subpage/profileMemoInse";

    }

//아도아
    @PostMapping("/profile")
    public String registMemo(@RequestParam("memo_title") String memo_title,
                             @RequestParam("memo_content") String memo_content
                             ){

        Userdata userdata = new Userdata();
        LoginUserDTO userDTO = userdata.getloginUserDTO();
        int userCode = userDTO.getUserCode();


        MemoDTO memoDTO = new MemoDTO();
        memoDTO.setMemo_title(memo_title);
        memoDTO.setMemo_content(memo_content);
        memoDTO.setUser_no(userCode);

        profileService.registMem(memoDTO);

        System.out.println("memouupDTO = " + memoDTO);

        return "redirect:/subpage/profile";

    }

// 
    @PostMapping("/profileMemoInse")
    public String updateMemo(@ModelAttribute MemoDTO memoDTO) {
        // memoDTO에 값이 제대로 들어오는지 확인
        System.out.println(memoDTO);
        // 서비스 호출하여 데이터베이스 업데이트
        profileService.updateMemo(memoDTO);
        return "redirect:/subpage/profile";
    }





}
