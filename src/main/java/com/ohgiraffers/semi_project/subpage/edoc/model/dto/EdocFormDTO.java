package com.ohgiraffers.semi_project.subpage.edoc.model.dto;

// 문서 처리 양식
public class EdocFormDTO {

    private int edoc_form_no;
    private String form_name;
    private String form_explanation;

    public EdocFormDTO() {
    }

    public EdocFormDTO(int edoc_form_no, String form_name, String form_explanation) {
        this.edoc_form_no = edoc_form_no;
        this.form_name = form_name;
        this.form_explanation = form_explanation;
    }

    public int getEdoc_form_no() {
        return edoc_form_no;
    }

    public void setEdoc_form_no(int edoc_form_no) {
        this.edoc_form_no = edoc_form_no;
    }

    public String getForm_name() {
        return form_name;
    }

    public void setForm_name(String form_name) {
        this.form_name = form_name;
    }

    public String getForm_explanation() {
        return form_explanation;
    }

    public void setForm_explanation(String form_explanation) {
        this.form_explanation = form_explanation;
    }

    @Override
    public String toString() {
        return "EdocFormDTO{" +
                "edoc_form_no=" + edoc_form_no +
                ", form_name='" + form_name + '\'' +
                ", form_explanation='" + form_explanation + '\'' +
                '}';
    }
}
