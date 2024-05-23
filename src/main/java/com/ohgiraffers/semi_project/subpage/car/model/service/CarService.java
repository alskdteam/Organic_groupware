package com.ohgiraffers.semi_project.subpage.car.model.service;


import com.ohgiraffers.semi_project.subpage.car.model.dao.carMapper;
import com.ohgiraffers.semi_project.subpage.car.model.dto.CarDTO;
import com.ohgiraffers.semi_project.subpage.car.model.dto.CarJoinDTO;
import com.ohgiraffers.semi_project.subpage.car.model.dto.RegistDTO;
import com.ohgiraffers.semi_project.subpage.car.model.dto.VehicleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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

//    public List<CarJoinDTO> findMySiCar(String id) {
//
//        return carMapper.findMySiCar(id);
//        /*
//        * select * from sicar where user_id = {id};
//        * */
//    }


    public List<VehicleDTO> findAllVehicle() {


        return carMapper.findAllVehicle();
    }

     public void registCar(RegistDTO regist){
        carMapper.registCar(regist);
     }

    public List<CarJoinDTO> findAllSiMyCar(int userCode) {

        return carMapper.findAllSiMyCar(userCode);
    }


    public int registCarDTO(Map<String, Object> regist) {
        return carMapper.registCarDTO(regist);

    }

    public int registCarDTOUpdate(Map<String, Object> regist) {
        return carMapper.registCarDTOUpdate(regist);
    }

    public int upmycarlist(Map<String, Object> params) {

        return carMapper.upmycarlist(params);
    }

    public int CarListUpdate(Map<String, Object> params) {

        return carMapper.CarListUpdate(params);
    }
}
