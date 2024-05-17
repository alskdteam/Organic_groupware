package com.ohgiraffers.semi_project.subpage.car.model.dto;

public class VehicleDTO {

    private String vehicle_name;
    private String vehicle_number;

    public VehicleDTO() {
    }

    public VehicleDTO(String vehicle_name, String vehicle_number) {
        this.vehicle_name = vehicle_name;
        this.vehicle_number = vehicle_number;
    }

    public String getVehicle_name() {
        return vehicle_name;
    }

    public void setVehicle_name(String vehicle_name) {
        this.vehicle_name = vehicle_name;
    }

    public String getVehicle_number() {
        return vehicle_number;
    }

    public void setVehicle_number(String vehicle_number) {
        this.vehicle_number = vehicle_number;
    }

    @Override
    public String toString() {
        return "VehicleDTO{" +
                "vehicle_name='" + vehicle_name + '\'' +
                ", vehicle_number='" + vehicle_number + '\'' +
                '}';
    }
}
