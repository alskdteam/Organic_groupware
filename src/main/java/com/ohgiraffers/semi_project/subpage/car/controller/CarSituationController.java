package com.ohgiraffers.semi_project.subpage.car.controller;


import com.ohgiraffers.semi_project.auth.model.service.Userdata;
import com.ohgiraffers.semi_project.subpage.car.model.dto.CarJoinDTO;
import com.ohgiraffers.semi_project.subpage.car.model.service.CarService;
import com.ohgiraffers.semi_project.subpage.main.controller.SidebarController;
import com.ohgiraffers.semi_project.subpage.main.model.service.MainService;
import com.ohgiraffers.semi_project.user.model.dto.LoginUserDTO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/subpage")
public class CarSituationController {



    private static final Logger logger = LogManager.getLogger(CarController.class);

    private final CarService carService;
    private final MessageSource messageSource;
    private final MainService mainService;
    private final SidebarController sidebarController;

    public CarSituationController(CarService carService, MessageSource messageSource, MainService mainService, SidebarController sidebarController) {
        this.carService = carService;
        this.messageSource = messageSource;
        this.mainService = mainService;
        this.sidebarController = sidebarController;
    }

    @GetMapping("car_situation")
    public String siCarList(Model model, @RequestParam(required = false) String type) {
        sidebarController.getSidebar(model);
        sidebarController.getHeader(model);

        System.out.println(type);
        List<CarJoinDTO> siCarList = carService.findAllSiCar();
        model.addAttribute("siCarList", siCarList);

        System.out.println("siCarList = " + siCarList);


        return "subpage/car_situation";
    }

    @GetMapping("car_situation_mypage")
    public String siCarMyList(Model model) {

        Userdata userdata = new Userdata();
        LoginUserDTO userDTO = userdata.getloginUserDTO();
        int userCode = userDTO.getUserCode();


        List<CarJoinDTO> siCarMyList = carService.findAllSiMyCar(userCode);
        model.addAttribute("siCarMyList", siCarMyList);

        System.out.println("siCarMyList = " + siCarMyList);
        

        return "subpage/car_situation_mypage";
    }
    @PostMapping("/car_situation_mypage")
    public String returnCar(@RequestParam Map<String, Object> params, Model model) {
        System.out.println("params = " + params);
        
        Userdata userdata = new Userdata();
        LoginUserDTO userDTO = userdata.getloginUserDTO();
        int userCode = userDTO.getUserCode();
        
        List<CarJoinDTO> siCarMyList = carService.findAllSiMyCar(userCode);
        System.out.println("siCarMyList = " + siCarMyList);
        model.addAttribute("siCarMyList", siCarMyList);

        int upmycarlist = carService.upmycarlist(params);
        int CarListUpdate = carService.CarListUpdate(params);
    return "subpage/car_situation_mypage";
    } 
}
