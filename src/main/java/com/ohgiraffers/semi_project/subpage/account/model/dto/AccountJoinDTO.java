package com.ohgiraffers.semi_project.subpage.account.model.dto;

import java.sql.Date;

public class AccountJoinDTO {

    private String account_name;            // 거래처명
    private String representative_name;     // 대표자명
    private String representative_number;   // 대표번호
    private String account_category;        // 거래처구분
    private String business_address;        // 사업장주소
    private Date registration_date;         // 거래처등록일

    private EmployeeDTO employeeDTO;

    public AccountJoinDTO() {
    }

    public AccountJoinDTO(String account_name, String representative_name, String representative_number, String account_category, String business_address, Date registration_date, EmployeeDTO employeeDTO) {
        this.account_name = account_name;
        this.representative_name = representative_name;
        this.representative_number = representative_number;
        this.account_category = account_category;
        this.business_address = business_address;
        this.registration_date = registration_date;
        this.employeeDTO = employeeDTO;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
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

    public String getAccount_category() {
        return account_category;
    }

    public void setAccount_category(String account_category) {
        this.account_category = account_category;
    }

    public String getBusiness_address() {
        return business_address;
    }

    public void setBusiness_address(String business_address) {
        this.business_address = business_address;
    }

    public Date getRegistration_date() {
        return registration_date;
    }

    public void setRegistration_date(Date registration_date) {
        this.registration_date = registration_date;
    }

    public EmployeeDTO getEmployeeDTO() {
        return employeeDTO;
    }

    public void setEmployeeDTO(EmployeeDTO employeeDTO) {
        this.employeeDTO = employeeDTO;
    }

    @Override
    public String toString() {
        return "AccountJoinDTO{" +
                "account_name='" + account_name + '\'' +
                ", representative_name='" + representative_name + '\'' +
                ", representative_number='" + representative_number + '\'' +
                ", account_category='" + account_category + '\'' +
                ", business_address='" + business_address + '\'' +
                ", registration_date=" + registration_date +
                ", employeeDTO=" + employeeDTO +
                '}';
    }
}
