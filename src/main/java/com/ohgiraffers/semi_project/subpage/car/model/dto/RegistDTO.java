package com.ohgiraffers.semi_project.subpage.car.model.dto;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class RegistDTO {




    private Date vehicle_reservation_date;      // 차량예약날
    private Date vehicle_return_due_date;       // 차량반납예정일

    private String vehicle_purpose;             // 차량용도
    private String vehicle_address;             // 차량주소

    private String vehicle_name;

    private int user_id;

    public RegistDTO() {
    }

    public RegistDTO(Date vehicle_reservation_date, Date vehicle_return_due_date, String vehicle_purpose, String vehicle_address, String vehicle_name, int user_id) {
        this.vehicle_reservation_date = vehicle_reservation_date;
        this.vehicle_return_due_date = vehicle_return_due_date;
        this.vehicle_purpose = vehicle_purpose;
        this.vehicle_address = vehicle_address;
        this.vehicle_name = vehicle_name;
        this.user_id = user_id;
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

    public String getVehicle_name() {
        return vehicle_name;
    }

    public void setVehicle_name(String vehicle_name) {
        this.vehicle_name = vehicle_name;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "RegistDTO{" +
                "vehicle_reservation_date=" + vehicle_reservation_date +
                ", vehicle_return_due_date=" + vehicle_return_due_date +
                ", vehicle_purpose='" + vehicle_purpose + '\'' +
                ", vehicle_address='" + vehicle_address + '\'' +
                ", vehicle_name='" + vehicle_name + '\'' +
                ", user_id=" + user_id +
                '}';
    }
}
