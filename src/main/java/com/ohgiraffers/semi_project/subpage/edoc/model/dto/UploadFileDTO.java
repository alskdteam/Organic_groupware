package com.ohgiraffers.semi_project.subpage.edoc.model.dto;

import java.util.Arrays;

public class UploadFileDTO {

    private byte[] employee_sign;
    private byte[] admin_sign;
    private String employee_name;
    private int edoc_form_no;
    private int user_id;
    private int edoc_form_ct_no;

    public UploadFileDTO() {
    }

    public UploadFileDTO(byte[] employee_sign, byte[] admin_sign, String employee_name, int edoc_form_no, int user_id, int edoc_form_ct_no) {
        this.employee_sign = employee_sign;
        this.admin_sign = admin_sign;
        this.employee_name = employee_name;
        this.edoc_form_no = edoc_form_no;
        this.user_id = user_id;
        this.edoc_form_ct_no = edoc_form_ct_no;
    }

    public byte[] getEmployee_sign() {
        return employee_sign;
    }

    public void setEmployee_sign(byte[] employee_sign) {
        this.employee_sign = employee_sign;
    }

    public byte[] getAdmin_sign() {
        return admin_sign;
    }

    public void setAdmin_sign(byte[] admin_sign) {
        this.admin_sign = admin_sign;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public int getEdoc_form_no() {
        return edoc_form_no;
    }

    public void setEdoc_form_no(int edoc_form_no) {
        this.edoc_form_no = edoc_form_no;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getEdoc_form_ct_no() {
        return edoc_form_ct_no;
    }

    public void setEdoc_form_ct_no(int edoc_form_ct_no) {
        this.edoc_form_ct_no = edoc_form_ct_no;
    }

    @Override
    public String toString() {
        return "UploadFileDTO{" +
                "employee_sign=" + Arrays.toString(employee_sign) +
                ", admin_sign=" + Arrays.toString(admin_sign) +
                ", employee_name='" + employee_name + '\'' +
                ", edoc_form_no=" + edoc_form_no +
                ", user_id=" + user_id +
                ", edoc_form_ct_no=" + edoc_form_ct_no +
                '}';
    }
}
