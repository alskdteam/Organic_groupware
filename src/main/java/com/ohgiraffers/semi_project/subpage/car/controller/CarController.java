package com.ohgiraffers.semi_project.subpage.car.controller;


import com.ohgiraffers.semi_project.subpage.car.model.dto.CarDTO;
import com.ohgiraffers.semi_project.subpage.car.model.dto.CarJoinDTO;
import com.ohgiraffers.semi_project.subpage.car.model.dto.RegistDTO;
import com.ohgiraffers.semi_project.subpage.car.model.dto.VehicleDTO;
import com.ohgiraffers.semi_project.subpage.car.model.service.CarService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@Controller
@RequestMapping("/subpage")
public class CarController {
    private static final Logger logger = LogManager.getLogger(CarController.class);

    private final CarService carService;
    private final MessageSource messageSource;

    @Autowired
    public CarController(CarService carService, MessageSource messageSource) {
        this.carService = carService;
        this.messageSource = messageSource;
    }

    @GetMapping("car")
    public String carJoinList(Model model) {
        List<CarJoinDTO> carJoinList = carService.findAllCar();
        model.addAttribute("carJoinList", carJoinList);


        return "subpage/car";
    }


    @GetMapping(value = "car/vehicle", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public List<VehicleDTO> findVehicleList() {


        return carService.findAllVehicle();
    }


    @PostMapping("car")
    public String registCar(RegistDTO regist, RedirectAttributes rttr) {


        System.out.println("carJoinDTO = " + regist);
    carService.registCar(regist);
    rttr.addFlashAttribute("successMessage","차량예약에 성공하셨습니다.");

        System.out.println("carJoinDTO = " + regist);
        return "redirect:/subpage/car_situation";
    }




}

