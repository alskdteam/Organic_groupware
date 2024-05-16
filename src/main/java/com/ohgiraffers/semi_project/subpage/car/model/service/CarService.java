package com.ohgiraffers.semi_project.subpage.car.model.service;


import com.ohgiraffers.semi_project.subpage.car.model.dao.carMapper;
import com.ohgiraffers.semi_project.subpage.car.model.dto.CarDTO;
import com.ohgiraffers.semi_project.subpage.car.model.dto.CarJoinDTO;
import com.ohgiraffers.semi_project.subpage.car.model.dto.VehicleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private final carMapper carMapper;

    @Autowired
    public CarService(carMapper carMapper) {this.carMapper = carMapper;}

    public List<CarJoinDTO> findAllCar() {

        return carMapper.findAllCar();
    }

    public List<CarJoinDTO> findAllSiCar() {

        return carMapper.findAllSiCar();
    }


    public List<VehicleDTO> findAllVehicle() {

        return carMapper.findAllVehicle();
    }

     public void registCar(CarDTO carDTO){}
}
