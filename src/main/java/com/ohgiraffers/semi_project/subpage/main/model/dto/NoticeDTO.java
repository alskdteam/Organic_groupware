package com.ohgiraffers.semi_project.subpage.main.model.dto;

public class NoticeDTO {

    private int notice_id;
    private String notice_title;
    private String notice_content;
    private String notice_creationDate;
    private String user_no;

    public NoticeDTO() {
    }

    public NoticeDTO(int notice_id, String notice_title, String notice_content, String notice_creationDate, String user_no) {
        this.notice_id = notice_id;
        this.notice_title = notice_title;
        this.notice_content = notice_content;
        this.notice_creationDate = notice_creationDate;
        this.user_no = user_no;
    }

    public int getNotice_id() {
        return notice_id;
    }

    public void setNotice_id(int notice_id) {
        this.notice_id = notice_id;
    }

    public String getNotice_title() {
        return notice_title;
    }

    public void setNotice_title(String notice_title) {
        this.notice_title = notice_title;
    }

    public String getNotice_content() {
        return notice_content;
    }

    public void setNotice_content(String notice_content) {
        this.notice_content = notice_content;
    }

    public String getNotice_creationDate() {
        return notice_creationDate;
    }

    public void setNotice_creationDate(String notice_creationDate) {
        this.notice_creationDate = notice_creationDate;
    }

    public String getUser_no() {
        return user_no;
    }

    public void setUser_no(String user_no) {
        this.user_no = user_no;
    }

    @Override
    public String toString() {
        return "NoticeDTO{" +
                "notice_id=" + notice_id +
                ", notice_title='" + notice_title + '\'' +
                ", notice_content='" + notice_content + '\'' +
                ", notice_creationDate='" + notice_creationDate + '\'' +
                ", user_no='" + user_no + '\'' +
                '}';
    }
}
