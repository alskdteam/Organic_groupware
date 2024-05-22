package com.ohgiraffers.semi_project.subpage.car.model.dto;

public class VehicleDTO {

    private String vehicle_name;
    private String vehicle_number;
    private int vehicle_code;
    private CarDTO carDTO;

    public VehicleDTO() {
    }

    public VehicleDTO(String vehicle_name, String vehicle_number, int vehicle_code, CarDTO carDTO) {
        this.vehicle_name = vehicle_name;
        this.vehicle_number = vehicle_number;
        this.vehicle_code = vehicle_code;
        this.carDTO = carDTO;
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

    public int getVehicle_code() {
        return vehicle_code;
    }

    public void setVehicle_code(int vehicle_code) {
        this.vehicle_code = vehicle_code;
    }

    public CarDTO getCarDTO() {
        return carDTO;
    }

    public void setCarDTO(CarDTO carDTO) {
        this.carDTO = carDTO;
    }

    @Override
    public String toString() {
        return "VehicleDTO{" +
                "vehicle_name='" + vehicle_name + '\'' +
                ", vehicle_number='" + vehicle_number + '\'' +
                ", vehicle_code=" + vehicle_code +
                ", carDTO=" + carDTO +
                '}';
    }
}
