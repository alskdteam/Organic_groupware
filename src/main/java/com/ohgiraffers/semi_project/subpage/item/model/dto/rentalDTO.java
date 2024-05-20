package com.ohgiraffers.semi_project.subpage.item.model.dto;

public class rentalDTO {
    private int item_number;
    private int item_category;
    private String item_name;
    private int item_inventory;

    public rentalDTO(){}

    public rentalDTO(int item_number, int item_category, String item_name, int item_inventory) {
        this.item_number = item_number;
        this.item_category = item_category;
        this.item_name = item_name;
        this.item_inventory = item_inventory;
    }

    public int getItem_number() {
        return item_number;
    }

    public void setItem_number(int item_number) {
        this.item_number = item_number;
    }

    public int getItem_category() {
        return item_category;
    }

    public void setItem_category(int item_category) {
        this.item_category = item_category;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public int getItem_inventory() {
        return item_inventory;
    }

    public void setItem_inventory(int item_inventory) {
        this.item_inventory = item_inventory;
    }

    @Override
    public String toString() {
        return "rentalDTO{" +
                "item_number=" + item_number +
                ", item_category=" + item_category +
                ", item_name='" + item_name + '\'' +
                ", item_inventory=" + item_inventory +
                '}';
    }
}
