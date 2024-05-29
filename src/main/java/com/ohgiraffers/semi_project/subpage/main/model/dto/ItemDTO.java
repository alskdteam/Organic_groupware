package com.ohgiraffers.semi_project.subpage.main.model.dto;

public class ItemDTO {

    private String item_name;

    public ItemDTO() {
    }

    public ItemDTO(String item_name) {
        this.item_name = item_name;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    @Override
    public String toString() {
        return "ItemDTO{" +
                "item_name='" + item_name + '\'' +
                '}';
    }
}
