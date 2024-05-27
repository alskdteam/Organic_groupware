package com.ohgiraffers.semi_project.admin.model.dto;

import java.sql.Date;

public class NoticeDTO {

    private int noticeId;
    private String noticeTitle;
    private String noticeContent;
    private Date noticeCreationDate;
    private int userNo;

    public NoticeDTO(){}

    public NoticeDTO(int noticeId, String noticeTitle, String noticeContent, Date noticeCreationDate, int userNo) {
        this.noticeId = noticeId;
        this.noticeTitle = noticeTitle;
        this.noticeContent = noticeContent;
        this.noticeCreationDate = noticeCreationDate;
        this.userNo = userNo;
    }

    public int getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(int noticeId) {
        this.noticeId = noticeId;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    public Date getNoticeCreationDate() {
        return noticeCreationDate;
    }

    public void setNoticeCreationDate(Date noticeCreationDate) {
        this.noticeCreationDate = noticeCreationDate;
    }

    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    @Override
    public String toString() {
        return "NoticeDTO{" +
                "noticeId=" + noticeId +
                ", noticeTitle='" + noticeTitle + '\'' +
                ", noticeContent='" + noticeContent + '\'' +
                ", noticeCreationDate=" + noticeCreationDate +
                ", userNo=" + userNo +
                '}';
    }
}
