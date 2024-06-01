package com.ohgiraffers.semi_project.user.model.dao;

import com.ohgiraffers.semi_project.user.model.dto.LoginUserDTO;
import com.ohgiraffers.semi_project.user.model.dto.SignupDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {


    int regist(SignupDTO signupDTO);


    LoginUserDTO findByUsername(String username);

    void cpass(int userNo, String cpass);
}
