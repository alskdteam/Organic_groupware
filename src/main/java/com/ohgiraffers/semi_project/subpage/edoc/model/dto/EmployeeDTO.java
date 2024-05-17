package com.ohgiraffers.semi_project.subpage.edoc.model.dto;

public class EmployeeDTO {

    private int user_no;
    private String user_id;
    private String user_name;
    private String user_role;
    private String user_birth;
    private String user_phoneNumber;
    private String user_gender;
    private String user_department;

    public EmployeeDTO() {
    }

    public EmployeeDTO(int user_no, String user_id, String user_name, String user_role, String user_birth, String user_phoneNumber, String user_gender, String user_department) {
        this.user_no = user_no;
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_role = user_role;
        this.user_birth = user_birth;
        this.user_phoneNumber = user_phoneNumber;
        this.user_gender = user_gender;
        this.user_department = user_department;
    }

    public int getUser_no() {
        return user_no;
    }

    public void setUser_no(int user_no) {
        this.user_no = user_no;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_role() {
        return user_role;
    }

    public void setUser_role(String user_role) {
        this.user_role = user_role;
    }

    public String getUser_birth() {
        return user_birth;
    }

    public void setUser_birth(String user_birth) {
        this.user_birth = user_birth;
    }

    public String getUser_phoneNumber() {
        return user_phoneNumber;
    }

    public void setUser_phoneNumber(String user_phoneNumber) {
        this.user_phoneNumber = user_phoneNumber;
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

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "user_no=" + user_no +
                ", user_id='" + user_id + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_role='" + user_role + '\'' +
                ", user_birth='" + user_birth + '\'' +
                ", user_phoneNumber='" + user_phoneNumber + '\'' +
                ", user_gender='" + user_gender + '\'' +
                ", user_department='" + user_department + '\'' +
                '}';
    }
}
