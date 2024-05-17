package com.ohgiraffers.semi_project.subpage.car.model.dto;


import java.sql.Date;

public class CarDTO {

    private int car_management_id;              // 차량관리ID
    private String car_rental_status;           // 차량대여여부
    private Date vehicle_reservation_date;      // 차량예약날짜
    private Date vehicle_return_due_date;       // 차량반납예정일
    private String vehicle_return_status;       // 차량반납
    private String vehicle_purpose;             // 차량용도
    private String vehicle_address;             // 차량주소


    public CarDTO() {
    }

    public CarDTO(int car_management_id, String car_rental_status, Date vehicle_reservation_date, Date vehicle_return_due_date, String vehicle_return_status, String vehicle_purpose, String vehicle_address) {
        this.car_management_id = car_management_id;
        this.car_rental_status = car_rental_status;
        this.vehicle_reservation_date = vehicle_reservation_date;
        this.vehicle_return_due_date = vehicle_return_due_date;
        this.vehicle_return_status = vehicle_return_status;
        this.vehicle_purpose = vehicle_purpose;
        this.vehicle_address = vehicle_address;
    }

    public int getCar_management_id() {
        return car_management_id;
    }

    public void setCar_management_id(int car_management_id) {
        this.car_management_id = car_management_id;
    }

    public String getCar_rental_status() {
        return car_rental_status;
    }

    public void setCar_rental_status(String car_rental_status) {
        this.car_rental_status = car_rental_status;
    }

    public Date getVehicle_reservation_date() {
        return vehicle_reservation_date;
    }

    public void setVehicle_reservation_date(Date vehicle_reservation_date) {
        this.vehicle_reservation_date = vehicle_reservation_date;
    }

    public Date getVehicle_return_due_date() {
        return vehicle_return_due_date;
    }

    public void setVehicle_return_due_date(Date vehicle_return_due_date) {
        this.vehicle_return_due_date = vehicle_return_due_date;
    }

    public String getVehicle_return_status() {
        return vehicle_return_status;
    }

    public void setVehicle_return_status(String vehicle_return_status) {
        this.vehicle_return_status = vehicle_return_status;
    }

    public String getVehicle_purpose() {
        return vehicle_purpose;
    }

    public void setVehicle_purpose(String vehicle_purpose) {
        this.vehicle_purpose = vehicle_purpose;
    }

    public String getVehicle_address() {
        return vehicle_address;
    }

    public void setVehicle_address(String vehicle_address) {
        this.vehicle_address = vehicle_address;
    }

    @Override
    public String toString() {
        return "CarDTO{" +
                "car_management_id=" + car_management_id +
                ", car_rental_status='" + car_rental_status + '\'' +
                ", vehicle_reservation_date=" + vehicle_reservation_date +
                ", vehicle_return_due_date=" + vehicle_return_due_date +
                ", vehicle_return_status='" + vehicle_return_status + '\'' +
                ", vehicle_purpose='" + vehicle_purpose + '\'' +
                ", vehicle_address='" + vehicle_address + '\'' +
                '}';
    }
}
