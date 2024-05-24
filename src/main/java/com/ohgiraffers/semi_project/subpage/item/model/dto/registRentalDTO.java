package com.ohgiraffers.semi_project.subpage.item.model.dto;

import java.sql.Date;

public class registRentalDTO {
    private Date rental_date;
    private Date rental_return_date;
    private String rental_category;
    private String rental_purpose;
    private String rental_status;
    private String item_name;
    private int item_number;
    private int user_id;

    public registRentalDTO(){}

    public registRentalDTO(Date rental_date, Date rental_return_date, String rental_category, String rental_purpose, String rental_status, String item_name, int item_number, int user_id) {
        this.rental_date = rental_date;
        this.rental_return_date = rental_return_date;
        this.rental_category = rental_category;
        this.rental_purpose = rental_purpose;
        this.rental_status = rental_status;
        this.item_name = item_name;
        this.item_number = item_number;
        this.user_id = user_id;
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

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public int getItem_number() {
        return item_number;
    }

    public void setItem_number(int item_number) {
        this.item_number = item_number;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "registRentalDTO{" +
                "rental_date=" + rental_date +
                ", rental_return_date=" + rental_return_date +
                ", rental_category='" + rental_category + '\'' +
                ", rental_purpose='" + rental_purpose + '\'' +
                ", rental_status='" + rental_status + '\'' +
                ", item_name='" + item_name + '\'' +
                ", item_number=" + item_number +
                ", user_id=" + user_id +
                '}';
    }
}
