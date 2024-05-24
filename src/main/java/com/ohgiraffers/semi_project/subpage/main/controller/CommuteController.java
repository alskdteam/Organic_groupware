package com.ohgiraffers.semi_project.subpage.main.controller;

import com.ohgiraffers.semi_project.auth.model.service.Userdata;
import com.ohgiraffers.semi_project.subpage.main.model.dto.CommuteDTO;
import com.ohgiraffers.semi_project.subpage.main.model.dto.NoticeDTO;
import com.ohgiraffers.semi_project.subpage.main.model.service.MainService;
import com.ohgiraffers.semi_project.user.model.dto.LoginUserDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;

@Controller
@RequestMapping("/subpage")
public class CommuteController {

    private final MainService mainService;

    public CommuteController(MainService mainService) {
        this.mainService = mainService;
    }

    @PostMapping("/startDate")
    public void startDate(Model model,
                          @RequestParam("current_time") String currentTime,
                          HttpServletRequest request,
                          HttpServletResponse response,
                          CommuteDTO commuteDTO) throws IOException {
        Userdata userDate = new Userdata();
        LoginUserDTO userDTO = userDate.getloginUserDTO();
        int user_no = userDTO.getUserCode();

        String formattedTime = currentTime.replace("T", " ").replace("Z", "");
        Timestamp go_work = Timestamp.valueOf(formattedTime);

        commuteDTO.setUser_no(user_no);
        commuteDTO.setGo_work(go_work);

        mainService.uploadStartTime(commuteDTO);

        String referrer = request.getHeader("referer");
        response.sendRedirect(referrer);
    }

    @PostMapping("/endDate")
    public void endDate(Model model,
                          @RequestParam("current_time") String currentTime,
                          HttpServletRequest request,
                          HttpServletResponse response,
                          CommuteDTO commuteDTO) throws IOException {
        Userdata userDate = new Userdata();
        LoginUserDTO userDTO = userDate.getloginUserDTO();
        int user_no = userDTO.getUserCode();

        String formattedTime = currentTime.replace("T", " ").replace("Z", "");
        Timestamp leave_work= Timestamp.valueOf(formattedTime);

        commuteDTO.setUser_no(user_no);
        commuteDTO.setLeave_work(leave_work);

        mainService.uploadEndTime(commuteDTO);

        String referrer = request.getHeader("referer");
        response.sendRedirect(referrer);
    }







}
