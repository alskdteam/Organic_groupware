package com.ohgiraffers.semi_project.subpage.edoc.model.dto;

import java.util.Date;

public class EdocDTO {

    private int edoc_id;
    private int edoc_form_no;
    private String edoc_status;
    private int user_no;

    public EdocDTO() {
    }

    public EdocDTO(int edoc_id, int edoc_form_no, String edoc_status, int user_no) {
        this.edoc_id = edoc_id;
        this.edoc_form_no = edoc_form_no;
        this.edoc_status = edoc_status;
        this.user_no = user_no;
    }

    public int getEdoc_id() {
        return edoc_id;
    }

    public void setEdoc_id(int edoc_id) {
        this.edoc_id = edoc_id;
    }

    public int getEdoc_form_no() {
        return edoc_form_no;
    }

    public void setEdoc_form_no(int edoc_form_no) {
        this.edoc_form_no = edoc_form_no;
    }

    public String getEdoc_status() {
        return edoc_status;
    }

    public void setEdoc_status(String edoc_status) {
        this.edoc_status = edoc_status;
    }

    public int getUser_no() {
        return user_no;
    }

    public void setUser_no(int user_no) {
        this.user_no = user_no;
    }

    @Override
    public String toString() {
        return "EdocDTO{" +
                "edoc_id=" + edoc_id +
                ", edoc_form_no=" + edoc_form_no +
                ", edoc_status='" + edoc_status + '\'' +
                ", user_no=" + user_no +
                '}';
    }
}
