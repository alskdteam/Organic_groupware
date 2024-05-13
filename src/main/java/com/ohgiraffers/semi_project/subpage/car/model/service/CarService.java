package com.ohgiraffers.semi_project.subpage.car.model.service;

import com.ohgiraffers.semi_project.subpage.car.model.dao.carMapper;
import com.ohgiraffers.semi_project.subpage.car.model.dto.CarDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarService {

    private final carMapper userMapper;

    @Autowired
    public CarService(carMapper userMapper) {this.userMapper = userMapper;}

    public List<CarDTO> findAllCars() {

        return userMapper.findAllCars();

    }

    @Transactional
    public void registCarMang(CarDTO newCar) {
        userMapper.registCar(newCar); // 데이터베이스에 새 차량 정보 추가
    }


    public List<CarDTO> findAllCarss() {
        return userMapper.findAllCarss();
    }

    public void addCar(CarDTO newCar) {
        userMapper.registCar(newCar);   // 데이터베이스에 새 차량 정보 추가
    }
}
