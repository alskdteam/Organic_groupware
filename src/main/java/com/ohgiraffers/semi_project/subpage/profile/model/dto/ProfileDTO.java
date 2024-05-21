package com.ohgiraffers.semi_project.subpage.profile.model.dto;

import java.util.Arrays;

public class ProfileDTO {

    private String user_name;
    private String english_name;
    private String phone_number;
    private String email;
    private byte[] profile_image;

    public ProfileDTO() {
    }

    public ProfileDTO(String user_name, String english_name, String phone_number, String email, byte[] profile_image) {
        this.user_name = user_name;
        this.english_name = english_name;
        this.phone_number = phone_number;
        this.email = email;
        this.profile_image = profile_image;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
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

    @Override
    public String toString() {
        return "ProfileDTO{" +
                "user_name='" + user_name + '\'' +
                ", english_name='" + english_name + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", email='" + email + '\'' +
                ", profile_image=" + Arrays.toString(profile_image) +
                '}';
    }
}
