package com.ohgiraffers.semi_project.subpage.car.model.dao;


import com.ohgiraffers.semi_project.subpage.car.model.dto.CarJoinDTO;
import com.ohgiraffers.semi_project.subpage.car.model.dto.RegistDTO;
import com.ohgiraffers.semi_project.subpage.car.model.dto.VehicleDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface carMapper {


    List<CarJoinDTO> findAllCar();

    List<CarJoinDTO> findAllSiCar();

    List<VehicleDTO> findAllVehicle();

    void registCar(RegistDTO regist);

    List<CarJoinDTO> findAllSiMyCar(int userCode);
}
