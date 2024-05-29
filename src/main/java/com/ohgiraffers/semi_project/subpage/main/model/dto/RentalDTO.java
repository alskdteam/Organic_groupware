package com.ohgiraffers.semi_project.subpage.main.model.dto;

import java.sql.Date;

public class RentalDTO {
    private Date rental_date;
    private Date rental_return_date;
    private String rental_purpose;
    private ItemDTO itemDTO;

    public RentalDTO() {
    }

    public RentalDTO(Date rental_date, Date rental_return_date, String rental_purpose, ItemDTO itemDTO) {
        this.rental_date = rental_date;
        this.rental_return_date = rental_return_date;
        this.rental_purpose = rental_purpose;
        this.itemDTO = itemDTO;
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

    public String getRental_purpose() {
        return rental_purpose;
    }

    public void setRental_purpose(String rental_purpose) {
        this.rental_purpose = rental_purpose;
    }

    public ItemDTO getItemDTO() {
        return itemDTO;
    }

    public void setItemDTO(ItemDTO itemDTO) {
        this.itemDTO = itemDTO;
    }

    @Override
    public String toString() {
        return "RentalDTO{" +
                "rental_date=" + rental_date +
                ", rental_return_date=" + rental_return_date +
                ", rental_purpose='" + rental_purpose + '\'' +
                ", itemDTO=" + itemDTO +
                '}';
    }
}
