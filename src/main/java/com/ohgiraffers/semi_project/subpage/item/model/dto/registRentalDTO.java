package com.ohgiraffers.semi_project.subpage.item.model.dto;

import java.sql.Date;

public class registRentalDTO {
    private Date rental_date;
    private Date rental_return_date;
    private String rental_category;
    private String rental_purpose;
    private String rental_status;
    private int item_number;
    private int user_no;

    public registRentalDTO(){}

    public registRentalDTO(Date rental_date, Date rental_return_date, String rental_category, String rental_purpose, String rental_status, int item_number, int user_no) {
        this.rental_date = rental_date;
        this.rental_return_date = rental_return_date;
        this.rental_category = rental_category;
        this.rental_purpose = rental_purpose;
        this.rental_status = rental_status;
        this.item_number = item_number;
        this.user_no = user_no;
    }

    public Date getRental_date() {
        return rental_date;
    }

    public void setRental_date(Date rental_date) {
        this.rental_date = rental_date;
    }

    public Date getRental_return_date() {
        return rental_return_date;
    }

    public void setRental_return_date(Date rental_return_date) {
        this.rental_return_date = rental_return_date;
    }

    public String getRental_category() {
        return rental_category;
    }

    public void setRental_category(String rental_category) {
        this.rental_category = rental_category;
    }

    public String getRental_purpose() {
        return rental_purpose;
    }

    public void setRental_purpose(String rental_purpose) {
        this.rental_purpose = rental_purpose;
    }

    public String getRental_status() {
        return rental_status;
    }

    public void setRental_status(String rental_status) {
        this.rental_status = rental_status;
    }

    public int getItem_number() {
        return item_number;
    }

    public void setItem_number(int item_number) {
        this.item_number = item_number;
    }

    public int getUser_no() {
        return user_no;
    }

    public void setUser_no(int user_no) {
        this.user_no = user_no;
    }

    @Override
    public String toString() {
        return "registRentalDTO{" +
                "rental_date=" + rental_date +
                ", rental_return_date=" + rental_return_date +
                ", rental_category='" + rental_category + '\'' +
                ", rental_purpose='" + rental_purpose + '\'' +
                ", rental_status='" + rental_status + '\'' +
                ", item_number=" + item_number +
                ", user_no=" + user_no +
                '}';
    }
}
