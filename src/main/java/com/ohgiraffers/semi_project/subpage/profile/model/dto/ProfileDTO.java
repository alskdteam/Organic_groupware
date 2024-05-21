package com.ohgiraffers.semi_project.subpage.profile.model.dto;

import java.util.Arrays;

public class ProfileDTO {

    private String korea_name;
    private String english_name;
    private String phone_number;
    private String email;
    private byte[] profile_image;
    private int user_no;

    public ProfileDTO() {
    }

    public ProfileDTO(String korea_name, String english_name, String phone_number, String email, byte[] profile_image, int user_no) {
        this.korea_name = korea_name;
        this.english_name = english_name;
        this.phone_number = phone_number;
        this.email = email;
        this.profile_image = profile_image;
        this.user_no = user_no;
    }

    public String getKorea_name() {
        return korea_name;
    }

    public void setKorea_name(String korea_name) {
        this.korea_name = korea_name;
    }

    public String getEnglish_name() {
        return english_name;
    }

    public void setEnglish_name(String english_name) {
        this.english_name = english_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        return "ProfileDTO{" +
                "korea_name='" + korea_name + '\'' +
                ", english_name='" + english_name + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", email='" + email + '\'' +
                ", profile_image=" + Arrays.toString(profile_image) +
                ", user_no=" + user_no +
                '}';
    }
}
