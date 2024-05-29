package com.ohgiraffers.semi_project.user.model.dto;

import jakarta.validation.constraints.Pattern;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

public class SignupDTO {

    private String userId;
    private String userName;
    private String userPass;
    private String role;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String  user_birth;

    @Pattern(regexp = "^\\d{3}-\\d{3,4}-\\d{4}$", message = "전화번호 형식이 올바르지 않습니다.")
    private String  user_phone_number;
    private String  user_gender;
    private String  user_department;
    private String  user_rank;

    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")
    private String  user_email;

    private Date    join_date;

    public SignupDTO() {
    }

    public SignupDTO(String userId, String userName, String userPass, String role, String user_birth, String user_phone_number, String user_gender, String user_department, String user_rank, String user_email, Date join_date) {
        this.userId = userId;
        this.userName = userName;
        this.userPass = userPass;
        this.role = role;
        this.user_birth = user_birth;
        this.user_phone_number = user_phone_number;
        this.user_gender = user_gender;
        this.user_department = user_department;
        this.user_rank = user_rank;
        this.user_email = user_email;
        this.join_date = join_date;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUser_birth() {
        return user_birth;
    }

    public void setUser_birth(String user_birth) {
        this.user_birth = user_birth;
    }

    public String getUser_phone_number() {
        return user_phone_number;
    }

    public void setUser_phone_number(String user_phone_number) {
        this.user_phone_number = user_phone_number;
    }

    public String getUser_gender() {
        return user_gender;
    }

    public void setUser_gender(String user_gender) {
        this.user_gender = user_gender;
    }

    public String getUser_department() {
        return user_department;
    }

    public void setUser_department(String user_department) {
        this.user_department = user_department;
    }

    public String getUser_rank() {
        return user_rank;
    }

    public void setUser_rank(String user_rank) {
        this.user_rank = user_rank;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public Date getJoin_date() {
        return join_date;
    }

    public void setJoin_date(Date join_date) {
        this.join_date = join_date;
    }

    @Override
    public String toString() {
        return "SignupDTO{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userPass='" + userPass + '\'' +
                ", role='" + role + '\'' +
                ", user_birth='" + user_birth + '\'' +
                ", user_phone_number='" + user_phone_number + '\'' +
                ", user_gender='" + user_gender + '\'' +
                ", user_department='" + user_department + '\'' +
                ", user_rank='" + user_rank + '\'' +
                ", user_email='" + user_email + '\'' +
                ", join_date=" + join_date +
                '}';
    }
}
