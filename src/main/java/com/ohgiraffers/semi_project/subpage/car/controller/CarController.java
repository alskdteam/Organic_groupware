package com.ohgiraffers.semi_project.subpage.car.controller;

import com.ohgiraffers.semi_project.subpage.car.model.dto.CarDTO;
import com.ohgiraffers.semi_project.subpage.car.model.service.CarService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Locale;

@Controller
@RequestMapping("/subpage")
public class CarController {


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

    @GetMapping(value = "registcarMan", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public List<CarDTO> findCarList(){

        return carService.findAllCars();

    }

    @PostMapping("/car")
    public String addCar(@ModelAttribute CarDTO newCar, RedirectAttributes rttr, Locale locale){

        carService.registCarMang(newCar);

        /* locale : 지역(나라) 에 대한 정보 다국어 처리와 관련 된 정보 */
        logger.info("Locale : {}", locale);
        rttr.addFlashAttribute("successMessage", messageSource.getMessage("registCarMang", new Object[]{newCar.getUSER_NO(), newCar.getVehicle_name()}, locale));

        System.out.println("newCar = " + newCar);

        return "redirect:/subpage/car_situation";
    }







}

