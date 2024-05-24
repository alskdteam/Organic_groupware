package com.ohgiraffers.semi_project.subpage.profile.controller;

import com.ohgiraffers.semi_project.auth.model.service.Userdata;
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


    // 나의 프로필 메모
    @GetMapping("/profile")
    public String memo(Model model){

        Userdata userdata = new Userdata();
        LoginUserDTO userDTO = userdata.getloginUserDTO();
        int userCode = userDTO.getUserCode();

        List<MemoDTO> memoDTOList = profileService.findMemoTitle(userCode);
        model.addAttribute("memoDTOList", memoDTOList);

        System.out.println("memoDTOList = " + memoDTOList);

        return "subpage/profile";
    }

    @GetMapping("/profile/{memo_id}")
    public String memoInse(Model model,@PathVariable int memo_id ){
        System.out.println("memo_id = " + memo_id);
        MemoDTO memoooDTO = profileService.findMemoPage(memo_id);
        model.addAttribute("memoooDTO", memoooDTO);
        System.out.println("memoooDTO = " + memoooDTO);
        return "subpage/profileMemoInse";

    }



    @PostMapping("/profile")
    public String registMemo(@RequestParam("memo_title") String memo_title,
                             @RequestParam("memo_content") String memo_content
                             ){

        Userdata userdata = new Userdata();
        LoginUserDTO userDTO = userdata.getloginUserDTO();
        int userCode = userDTO.getUserCode();


        MemoDTO memouupDTO = new MemoDTO();
        memouupDTO.setMemo_title(memo_title);
        memouupDTO.setMemo_content(memo_content);
        memouupDTO.setUser_no(userCode);

        profileService.registMem(memouupDTO);

        System.out.println("memouupDTO = " + memouupDTO);

        return "redirect:/subpage/profile";

    }

    @PostMapping("/profileMemoInse")
    public String updateMemo (@RequestParam Map<String,String> upmemo){
        MemoDTO memoupDTO = new MemoDTO();
        memoupDTO.setMemo_title(upmemo.get("memo_title"));
        memoupDTO.setMemo_content(upmemo.get("memo_content"));
        memoupDTO.setMemo_id(Integer.parseInt(upmemo.get("memo_id")));
        System.out.println("memoupDTO = " + memoupDTO);
        int Memo = profileService.updateMemoo(memoupDTO);

        return "redirect:/subpage/profile";

    }







}
