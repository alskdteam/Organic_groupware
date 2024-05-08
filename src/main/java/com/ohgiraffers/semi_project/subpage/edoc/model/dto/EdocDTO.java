package com.ohgiraffers.semi_project.subpage.edoc.model.dto;

import java.util.Date;

public class EdocDTO {

    private int edoc_id;
    private String edoc_templete;
    private String edoc_description;
    private Date Drafting_date;
    private String edoc_title;
    private String edoc_category;
    private String edoc_status;
    private int user_no;

    public EdocDTO() {
    }

    public EdocDTO(int edoc_id, String edoc_templete, String edoc_description, Date drafting_date, String edoc_title, String edoc_category, String edoc_status, int user_no) {
        this.edoc_id = edoc_id;
        this.edoc_templete = edoc_templete;
        this.edoc_description = edoc_description;
        Drafting_date = drafting_date;
        this.edoc_title = edoc_title;
        this.edoc_category = edoc_category;
        this.edoc_status = edoc_status;
        this.user_no = user_no;
    }

    public int getEdoc_id() {
        return edoc_id;
    }

    public void setEdoc_id(int edoc_id) {
        this.edoc_id = edoc_id;
    }

    public String getEdoc_templete() {
        return edoc_templete;
    }

    public void setEdoc_templete(String edoc_templete) {
        this.edoc_templete = edoc_templete;
    }

    public String getEdoc_description() {
        return edoc_description;
    }

    public void setEdoc_description(String edoc_description) {
        this.edoc_description = edoc_description;
    }

    public Date getDrafting_date() {
        return Drafting_date;
    }

    public void setDrafting_date(Date drafting_date) {
        Drafting_date = drafting_date;
    }

    public String getEdoc_title() {
        return edoc_title;
    }

    public void setEdoc_title(String edoc_title) {
        this.edoc_title = edoc_title;
    }

    public String getEdoc_category() {
        return edoc_category;
    }

    public void setEdoc_category(String edoc_category) {
        this.edoc_category = edoc_category;
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
                ", edoc_templete='" + edoc_templete + '\'' +
                ", edoc_description='" + edoc_description + '\'' +
                ", Drafting_date=" + Drafting_date +
                ", edoc_title='" + edoc_title + '\'' +
                ", edoc_category='" + edoc_category + '\'' +
                ", edoc_status='" + edoc_status + '\'' +
                ", user_no=" + user_no +
                '}';
    }
}
