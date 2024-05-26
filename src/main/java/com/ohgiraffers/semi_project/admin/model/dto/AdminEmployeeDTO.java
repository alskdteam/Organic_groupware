package com.ohgiraffers.semi_project.admin.model.dto;

import java.sql.Date;

public class AdminEmployeeDTO {

    private int user_no;
    private String user_name;
    private int user_id;
    private Date user_birth;
    private String user_phone_number;
    private String user_gender;
    private String user_department;
    private String user_role;
    private String user_rank;
    private String user_email;
    private Date join_date;

    public AdminEmployeeDTO() {
    }

    public AdminEmployeeDTO(int user_no, String user_name, int user_id, Date user_birth, String user_phone_number, String user_gender, String user_department, String user_role, String user_rank, String user_email, Date join_date) {
        this.user_no = user_no;
        this.user_name = user_name;
        this.user_id = user_id;
        this.user_birth = user_birth;
        this.user_phone_number = user_phone_number;
        this.user_gender = user_gender;
        this.user_department = user_department;
        this.user_role = user_role;
        this.user_rank = user_rank;
        this.user_email = user_email;
        this.join_date = join_date;
    }

    public int getUser_no() {
        return user_no;
    }

    public void setUser_no(int user_no) {
        this.user_no = user_no;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public Date getUser_birth() {
        return user_birth;
    }

    public void setUser_birth(Date user_birth) {
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

    public String getUser_role() {
        return user_role;
    }

    public void setUser_role(String user_role) {
        this.user_role = user_role;
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
        return "AdminEmployeeDTO{" +
                "user_no=" + user_no +
                ", user_name='" + user_name + '\'' +
                ", user_id=" + user_id +
                ", user_birth=" + user_birth +
                ", user_phone_number='" + user_phone_number + '\'' +
                ", user_gender='" + user_gender + '\'' +
                ", user_department='" + user_department + '\'' +
                ", user_role='" + user_role + '\'' +
                ", user_rank='" + user_rank + '\'' +
                ", user_email='" + user_email + '\'' +
                ", join_date=" + join_date +
                '}';
    }
}
