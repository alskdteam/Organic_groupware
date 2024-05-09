package com.ohgiraffers.semi_project.subpage.car.controller;

import com.ohgiraffers.semi_project.subpage.car.model.dto.CarDTO;
import com.ohgiraffers.semi_project.subpage.car.model.service.CarService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/subpage")
public class CarController {

//    @GetMapping("/car")
//    public String car(){
//
//    }

    //  logger :  어떤 오류가 나는지 메세지를 알려준다.
    private static final Logger logger = LogManager.getLogger(CarController.class);

    private final CarService carService;
    private final MessageSource messageSource;

    @Autowired
    public CarController(CarService carService, MessageSource messageSource) {
        this.carService = carService;
        this.messageSource = messageSource;
    }

    @GetMapping("/car")
    public String car(Model model){
        List<CarDTO>carList = carService.findAllCars();
        model.addAttribute("carList", carList);

        return "/subpage/car";
    }


    
    
}

