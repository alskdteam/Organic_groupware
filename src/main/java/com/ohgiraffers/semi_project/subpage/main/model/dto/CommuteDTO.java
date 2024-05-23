package com.ohgiraffers.semi_project.subpage.main.model.dto;

import java.sql.Timestamp;
import java.time.LocalDate;

public class CommuteDTO {
    private Timestamp go_work;
    private Timestamp leave_work;
    private int user_no;
    private LocalDate commute_date;

    public CommuteDTO() {
    }

    public CommuteDTO(Timestamp go_work, Timestamp leave_work, int user_no, LocalDate commute_date) {
        this.go_work = go_work;
        this.leave_work = leave_work;
        this.user_no = user_no;
        this.commute_date = commute_date;
    }

    public Timestamp getGo_work() {
        return go_work;
    }

    public void setGo_work(Timestamp go_work) {
        this.go_work = go_work;
    }

    public Timestamp getLeave_work() {
        return leave_work;
    }

    public void setLeave_work(Timestamp leave_work) {
        this.leave_work = leave_work;
    }

    public int getUser_no() {
        return user_no;
    }

    public void setUser_no(int user_no) {
        this.user_no = user_no;
    }

    public LocalDate getCommute_date() {
        return commute_date;
    }

    public void setCommute_date(LocalDate commute_date) {
        this.commute_date = commute_date;
    }

    @Override
    public String toString() {
        return "CommuteDTO{" +
                "go_work=" + go_work +
                ", leave_work=" + leave_work +
                ", user_no=" + user_no +
                ", commute_date=" + commute_date +
                '}';
    }
}
