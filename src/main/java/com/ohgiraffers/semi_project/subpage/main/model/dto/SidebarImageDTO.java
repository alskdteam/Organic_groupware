package com.ohgiraffers.semi_project.subpage.main.model.dto;

import java.util.Arrays;

public class SidebarImageDTO {

    private String korea_name;
    private byte[] profile_image;
    private int user_no;

    public SidebarImageDTO() {
    }

    public SidebarImageDTO(String korea_name, byte[] profile_image, int user_no) {
        this.korea_name = korea_name;
        this.profile_image = profile_image;
        this.user_no = user_no;
    }

    public String getKorea_name() {
        return korea_name;
    }

    public void setKorea_name(String korea_name) {
        this.korea_name = korea_name;
    }

    public byte[] getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(byte[] profile_image) {
        this.profile_image = profile_image;
    }

    public int getUser_no() {
        return user_no;
    }

    public void setUser_no(int user_no) {
        this.user_no = user_no;
    }

    @Override
    public String toString() {
        return "SidebarImageDTO{" +
                "korea_name='" + korea_name + '\'' +
                ", profile_image=" + Arrays.toString(profile_image) +
                ", user_no=" + user_no +
                '}';
    }
}
