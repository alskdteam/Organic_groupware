    package com.ohgiraffers.semi_project.subpage.profile.model.dto;

    import java.sql.Date;

    public class CalendarDTO {

        private int userNo;
        private String comment_content;
        private Date comment_creation_time;
        private int comment_id;

        public CalendarDTO(){}

        public CalendarDTO(int userNo, String comment_content, Date comment_creation_time, int comment_id) {
            this.userNo = userNo;
            this.comment_content = comment_content;
            this.comment_creation_time = comment_creation_time;
            this.comment_id = comment_id;
        }

        public int getUserNo() {
            return userNo;
        }

        public void setUserNo(int userNo) {
            this.userNo = userNo;
        }

        public String getComment_content() {
            return comment_content;
        }

        public void setComment_content(String comment_content) {
            this.comment_content = comment_content;
        }

        public Date getComment_creation_time() {
            return comment_creation_time;
        }

        public void setComment_creation_time(Date comment_creation_time) {
            this.comment_creation_time = comment_creation_time;
        }

        public int getComment_id() {
            return comment_id;
        }

        public void setComment_id(int comment_id) {
            this.comment_id = comment_id;
        }

        @Override
        public String toString() {
            return "CalendarDTO{" +
                    "userNo=" + userNo +
                    ", comment_content='" + comment_content + '\'' +
                    ", comment_creation_time=" + comment_creation_time +
                    ", comment_id=" + comment_id +
                    '}';
        }
    }
