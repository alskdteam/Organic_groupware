package com.ohgiraffers.semi_project.auth.model.service;

import com.ohgiraffers.semi_project.auth.model.AuthDetails;
import com.ohgiraffers.semi_project.user.model.dto.LoginUserDTO;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class Userdata {
    public static LoginUserDTO getloginUserDTO(){

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        AuthDetails authDetails = (AuthDetails) authentication.getPrincipal();
        return authDetails.getLoginUserDTO();
    }



}
