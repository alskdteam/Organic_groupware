package com.ohgiraffers.semi_project.subpage.item.model.dto;


import java.sql.Date;

public class ItemDTO {
    private int rental_id;              // 물품 대여 id
    private Date rental_date;           // 물품 대여일
    private Date rental_return_date;    // 물품 대여 반납일
    private String rental_category;     // 물품항목
    private String rental_purpose;      // 물품 대여 용도(구분)
    private String postal_code;         // 반납 여부



    public ItemDTO(){}

    public ItemDTO(int rental_id, Date rental_date, Date rental_return_date, String rental_category, String rental_purpose, String postal_code) {
        this.rental_id = rental_id;
        this.rental_date = rental_date;
        this.rental_return_date = rental_return_date;
        this.rental_category = rental_category;
        this.rental_purpose = rental_purpose;
        this.postal_code = postal_code;
    }

    public int getRental_id() {
        return rental_id;
    }

    public void setRental_id(int rental_id) {
        this.rental_id = rental_id;
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

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    @Override
    public String toString() {
        return "ItemDTO{" +
                "rental_id=" + rental_id +
                ", rental_date=" + rental_date +
                ", rental_return_date=" + rental_return_date +
                ", rental_category='" + rental_category + '\'' +
                ", rental_purpose='" + rental_purpose + '\'' +
                ", postal_code='" + postal_code + '\'' +
                '}';
    }
}
