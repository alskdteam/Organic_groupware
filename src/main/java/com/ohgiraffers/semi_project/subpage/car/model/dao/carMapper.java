package com.ohgiraffers.semi_project.subpage.car.model.dao;

import com.ohgiraffers.semi_project.subpage.car.model.dto.CarDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface carMapper {

    List<CarDTO> findAllCars();
}
