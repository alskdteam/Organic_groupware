package com.ohgiraffers.semi_project.subpage.profile.model.dto;

public class MemoDTO {

    private int memo_id;
    private String memo_title;
    private String memo_content;
    public int user_no;
    private EmployeeDTO employeeDTO;

    public MemoDTO() {
    }

    public MemoDTO(int memo_id, String memo_title, String memo_content, int user_no, EmployeeDTO employeeDTO) {
        this.memo_id = memo_id;
        this.memo_title = memo_title;
        this.memo_content = memo_content;
        this.user_no = user_no;
        this.employeeDTO = employeeDTO;
    }

    public int getMemo_id() {
        return memo_id;
    }

    public void setMemo_id(int memo_id) {
        this.memo_id = memo_id;
    }

    public String getMemo_title() {
        return memo_title;
    }

    public void setMemo_title(String memo_title) {
        this.memo_title = memo_title;
    }

    public String getMemo_content() {
        return memo_content;
    }

    public void setMemo_content(String memo_content) {
        this.memo_content = memo_content;
    }

    public int getUser_no() {
        return user_no;
    }

    public void setUser_no(int user_no) {
        this.user_no = user_no;
    }

    public EmployeeDTO getEmployeeDTO() {
        return employeeDTO;
    }

    public void setEmployeeDTO(EmployeeDTO employeeDTO) {
        this.employeeDTO = employeeDTO;
    }

    @Override
    public String toString() {
        return "MemoDTO{" +
                "memo_id=" + memo_id +
                ", memo_title='" + memo_title + '\'' +
                ", memo_content='" + memo_content + '\'' +
                ", user_no=" + user_no +
                ", employeeDTO=" + employeeDTO +
                '}';
    }
}
