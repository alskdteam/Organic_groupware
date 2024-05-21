package com.ohgiraffers.semi_project.subpage.account.model.dto;

import java.sql.Date;

public class AccountDTO {
    private String account_name;            // 거래처명
    private String account_category;        // 거래처구분
    private String representative_name;     // 대표자명
    private String representative_number;   // 대표번호
    private String business_address;        // 사업장주소
    private String business_number;         // 사업자 번호
    private Date registration_date;         // 거래처등록일
    private String bank_name;               // 은행이름
    private String account_holder;          // 예금주명
    private String account_number;          // 계좌번호

    public AccountDTO() {
    }

    public AccountDTO(String account_name, String account_category, String representative_name, String representative_number, String business_address, String business_number, Date registration_date, String bank_name, String account_holder, String account_number) {
        this.account_name = account_name;
        this.account_category = account_category;
        this.representative_name = representative_name;
        this.representative_number = representative_number;
        this.business_address = business_address;
        this.business_number = business_number;
        this.registration_date = registration_date;
        this.bank_name = bank_name;
        this.account_holder = account_holder;
        this.account_number = account_number;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public String getAccount_category() {
        return account_category;
    }

    public void setAccount_category(String account_category) {
        this.account_category = account_category;
    }

    public String getRepresentative_name() {
        return representative_name;
    }

    public void setRepresentative_name(String representative_name) {
        this.representative_name = representative_name;
    }

    public String getRepresentative_number() {
        return representative_number;
    }

    public void setRepresentative_number(String representative_number) {
        this.representative_number = representative_number;
    }

    public String getBusiness_address() {
        return business_address;
    }

    public void setBusiness_address(String business_address) {
        this.business_address = business_address;
    }

    public String getBusiness_number() {
        return business_number;
    }

    public void setBusiness_number(String business_number) {
        this.business_number = business_number;
    }

    public Date getRegistration_date() {
        return registration_date;
    }

    public void setRegistration_date(Date registration_date) {
        this.registration_date = registration_date;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getAccount_holder() {
        return account_holder;
    }

    public void setAccount_holder(String account_holder) {
        this.account_holder = account_holder;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    @Override
    public String toString() {
        return "AccountDTO{" +
                "account_name='" + account_name + '\'' +
                ", account_category='" + account_category + '\'' +
                ", representative_name='" + representative_name + '\'' +
                ", representative_number='" + representative_number + '\'' +
                ", business_address='" + business_address + '\'' +
                ", business_number='" + business_number + '\'' +
                ", registration_date=" + registration_date +
                ", bank_name='" + bank_name + '\'' +
                ", account_holder='" + account_holder + '\'' +
                ", account_number='" + account_number + '\'' +
                '}';
    }
}
