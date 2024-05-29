package com.ohgiraffers.semi_project.subpage.main.model.dto;

import java.sql.Date;

public class CarDTO {

    private Date vehicle_reservation_date;
    private Date vehicle_return_due_date;
    private String vehicle_name;
    private String vehicle_purpose;

    public CarDTO() {
    }

    public CarDTO(Date vehicle_reservation_date, Date vehicle_return_due_date, String vehicle_name, String vehicle_purpose) {
        this.vehicle_reservation_date = vehicle_reservation_date;
        this.vehicle_return_due_date = vehicle_return_due_date;
        this.vehicle_name = vehicle_name;
        this.vehicle_purpose = vehicle_purpose;
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

    public String getVehicle_name() {
        return vehicle_name;
    }

    public void setVehicle_name(String vehicle_name) {
        this.vehicle_name = vehicle_name;
    }

    public String getVehicle_purpose() {
        return vehicle_purpose;
    }

    public void setVehicle_purpose(String vehicle_purpose) {
        this.vehicle_purpose = vehicle_purpose;
    }

    @Override
    public String toString() {
        return "CarDTO{" +
                "vehicle_reservation_date=" + vehicle_reservation_date +
                ", vehicle_return_due_date=" + vehicle_return_due_date +
                ", vehicle_name='" + vehicle_name + '\'' +
                ", vehicle_purpose='" + vehicle_purpose + '\'' +
                '}';
    }
}
