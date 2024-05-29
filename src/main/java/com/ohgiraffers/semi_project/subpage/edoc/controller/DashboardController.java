package com.ohgiraffers.semi_project.subpage.edoc.controller;

import com.ohgiraffers.semi_project.subpage.main.model.dto.CarDTO;
import com.ohgiraffers.semi_project.subpage.main.model.dto.RentalDTO;
import com.ohgiraffers.semi_project.subpage.main.model.service.MainService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/login")
public class DashboardController {


    private final MainService mainService;

    public DashboardController(MainService mainService) {
        this.mainService = mainService;
    }

    @PostMapping("/dashboard")
    @ResponseBody
    public Map<String, Object> receiveDate(@RequestBody Map<String, String> requestData) {
        Date vehicle_reservation_date = Date.valueOf(requestData.get("date"));
        Date rental_date = Date.valueOf(requestData.get("date"));

        CarDTO carDTO = new CarDTO();
        carDTO.setVehicle_reservation_date(vehicle_reservation_date);

        RentalDTO rentalDTO = new RentalDTO();
        rentalDTO.setRental_date(rental_date);

        List<CarDTO> car = mainService.selectDashboard(carDTO);

        List<RentalDTO> rental = mainService.selectRental(rentalDTO);

        // 모델에 데이터 추가하지 않고 직접 데이터를 반환
        Map<String, Object> response = new HashMap<>();
        response.put("carList", car);
        response.put("rentalList", rental);

        System.out.println(rental);

        return response;
    }

}
