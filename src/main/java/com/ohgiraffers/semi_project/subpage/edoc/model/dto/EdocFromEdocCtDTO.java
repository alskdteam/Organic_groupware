package com.ohgiraffers.semi_project.subpage.edoc.model.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class EdocFromEdocCtDTO {


    private int edoc_form_ct_no;
    private int edoc_form_no;
    private String employee_name;
    private int user_id;
    private String edoc_status;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date start_date;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date end_date;
    private String employee_di;
    private String employee_de;
    private String reason_return;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date drafting_date;

    private String title;
    private String content;
    private String purpose;

    private EdocFormDTO edocFormDTO;

    public EdocFromEdocCtDTO() {
    }

    public EdocFromEdocCtDTO(int edoc_form_ct_no, int edoc_form_no, String employee_name, int user_id, String edoc_status, Date start_date, Date end_date, String employee_di, String employee_de, String reason_return, Date drafting_date, String title, String content, String purpose, EdocFormDTO edocFormDTO) {
        this.edoc_form_ct_no = edoc_form_ct_no;
        this.edoc_form_no = edoc_form_no;
        this.employee_name = employee_name;
        this.user_id = user_id;
        this.edoc_status = edoc_status;
        this.start_date = start_date;
        this.end_date = end_date;
        this.employee_di = employee_di;
        this.employee_de = employee_de;
        this.reason_return = reason_return;
        this.drafting_date = drafting_date;
        this.title = title;
        this.content = content;
        this.purpose = purpose;
        this.edocFormDTO = edocFormDTO;
    }

    public int getEdoc_form_ct_no() {
        return edoc_form_ct_no;
    }

    public void setEdoc_form_ct_no(int edoc_form_ct_no) {
        this.edoc_form_ct_no = edoc_form_ct_no;
    }

    public int getEdoc_form_no() {
        return edoc_form_no;
    }

    public void setEdoc_form_no(int edoc_form_no) {
        this.edoc_form_no = edoc_form_no;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getEdoc_status() {
        return edoc_status;
    }

    public void setEdoc_status(String edoc_status) {
        this.edoc_status = edoc_status;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public String getEmployee_di() {
        return employee_di;
    }

    public void setEmployee_di(String employee_di) {
        this.employee_di = employee_di;
    }

    public String getEmployee_de() {
        return employee_de;
    }

    public void setEmployee_de(String employee_de) {
        this.employee_de = employee_de;
    }

    public String getReason_return() {
        return reason_return;
    }

    public void setReason_return(String reason_return) {
        this.reason_return = reason_return;
    }

    public Date getDrafting_date() {
        return drafting_date;
    }

    public void setDrafting_date(Date drafting_date) {
        this.drafting_date = drafting_date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public EdocFormDTO getEdocFormDTO() {
        return edocFormDTO;
    }

    public void setEdocFormDTO(EdocFormDTO edocFormDTO) {
        this.edocFormDTO = edocFormDTO;
    }

    @Override
    public String toString() {
        return "EdocFromEdocCtDTO{" +
                "edoc_form_ct_no=" + edoc_form_ct_no +
                ", edoc_form_no=" + edoc_form_no +
                ", employee_name='" + employee_name + '\'' +
                ", user_id=" + user_id +
                ", edoc_status='" + edoc_status + '\'' +
                ", start_date=" + start_date +
                ", end_date=" + end_date +
                ", employee_di='" + employee_di + '\'' +
                ", employee_de='" + employee_de + '\'' +
                ", reason_return='" + reason_return + '\'' +
                ", drafting_date=" + drafting_date +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", purpose='" + purpose + '\'' +
                ", edocFormDTO=" + edocFormDTO +
                '}';
    }
}
