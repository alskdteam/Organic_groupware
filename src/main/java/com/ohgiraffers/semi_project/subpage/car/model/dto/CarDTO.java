package com.ohgiraffers.semi_project.subpage.car.model.dto;

import java.util.Date;

public class CarDTO {

    // 차량예약 차량 조회 에 관한 DTO 생성 (car)
    private int USER_NO;                    // 사원번호
    private int car_managementId;           //  차량관리ID
    private String car_number;              // 차량번호
    private String car_rentalStatus;        // 차량대여여부
    private String Vehicle_returnStatus;    // 차량반납
    private String Vehicle_purpose;         // 차량용도
    private String Vehicle_address;         // 주소
    private Date Vehicle_reservationDate;   //차량예약날짜
    private Date Vehicle_returnDueDate;     //차량반납예정일
    //차량 조회 에 관한 DTO 생성 (Vehicle)
    private String Vehicle_number;          // 차량번호
    private String Vehicle_name;            // 차량이름


    public CarDTO() {
    }

    public CarDTO(int USER_NO, int car_managementId, String car_number, String car_rentalStatus, String vehicle_returnStatus, String vehicle_purpose, String vehicle_address, Date vehicle_reservationDate, Date vehicle_returnDueDate, String vehicle_number, String vehicle_name) {
        this.USER_NO = USER_NO;
        this.car_managementId = car_managementId;
        this.car_number = car_number;
        this.car_rentalStatus = car_rentalStatus;
        Vehicle_returnStatus = vehicle_returnStatus;
        Vehicle_purpose = vehicle_purpose;
        Vehicle_address = vehicle_address;
        Vehicle_reservationDate = vehicle_reservationDate;
        Vehicle_returnDueDate = vehicle_returnDueDate;
        Vehicle_number = vehicle_number;
        Vehicle_name = vehicle_name;
    }

    public int getUSER_NO() {
        return USER_NO;
    }

    public void setUSER_NO(int USER_NO) {
        this.USER_NO = USER_NO;
    }

    public int getCar_managementId() {
        return car_managementId;
    }

    public void setCar_managementId(int car_managementId) {
        this.car_managementId = car_managementId;
    }

    public String getCar_number() {
        return car_number;
    }

    public void setCar_number(String car_number) {
        this.car_number = car_number;
    }

    public String getCar_rentalStatus() {
        return car_rentalStatus;
    }

    public void setCar_rentalStatus(String car_rentalStatus) {
        this.car_rentalStatus = car_rentalStatus;
    }

    public String getVehicle_returnStatus() {
        return Vehicle_returnStatus;
    }

    public void setVehicle_returnStatus(String vehicle_returnStatus) {
        Vehicle_returnStatus = vehicle_returnStatus;
    }

    public String getVehicle_purpose() {
        return Vehicle_purpose;
    }

    public void setVehicle_purpose(String vehicle_purpose) {
        Vehicle_purpose = vehicle_purpose;
    }

    public String getVehicle_address() {
        return Vehicle_address;
    }

    public void setVehicle_address(String vehicle_address) {
        Vehicle_address = vehicle_address;
    }

    public Date getVehicle_reservationDate() {
        return Vehicle_reservationDate;
    }

    public void setVehicle_reservationDate(Date vehicle_reservationDate) {
        Vehicle_reservationDate = vehicle_reservationDate;
    }

    public Date getVehicle_returnDueDate() {
        return Vehicle_returnDueDate;
    }

    public void setVehicle_returnDueDate(Date vehicle_returnDueDate) {
        Vehicle_returnDueDate = vehicle_returnDueDate;
    }

    public String getVehicle_number() {
        return Vehicle_number;
    }

    public void setVehicle_number(String vehicle_number) {
        Vehicle_number = vehicle_number;
    }

    public String getVehicle_name() {
        return Vehicle_name;
    }

    public void setVehicle_name(String vehicle_name) {
        Vehicle_name = vehicle_name;
    }

    @Override
    public String toString() {
        return "CarDTO{" +
                "USER_NO=" + USER_NO +
                ", car_managementId=" + car_managementId +
                ", car_number='" + car_number + '\'' +
                ", car_rentalStatus='" + car_rentalStatus + '\'' +
                ", Vehicle_returnStatus='" + Vehicle_returnStatus + '\'' +
                ", Vehicle_purpose='" + Vehicle_purpose + '\'' +
                ", Vehicle_address='" + Vehicle_address + '\'' +
                ", Vehicle_reservationDate=" + Vehicle_reservationDate +
                ", Vehicle_returnDueDate=" + Vehicle_returnDueDate +
                ", Vehicle_number='" + Vehicle_number + '\'' +
                ", Vehicle_name='" + Vehicle_name + '\'' +
                '}';
    }
}
