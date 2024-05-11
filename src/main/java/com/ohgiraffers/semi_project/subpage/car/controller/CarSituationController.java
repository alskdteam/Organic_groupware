package com.ohgiraffers.semi_project.subpage.car.controller;

import com.ohgiraffers.semi_project.subpage.car.model.dto.CarDTO;
import com.ohgiraffers.semi_project.subpage.car.model.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/subpage")
public class CarSituationController {

    private final CarService carService;

    @Autowired
    public CarSituationController(CarService carService) {
        this.carService = carService;

    }

    @GetMapping("/car_situation")
    public String carSituation(Model model){
        List<CarDTO> carsList = carService.findAllCarss();
        model.addAttribute("carsList", carsList);
        return "/subpage/car_situation";
    }

}
