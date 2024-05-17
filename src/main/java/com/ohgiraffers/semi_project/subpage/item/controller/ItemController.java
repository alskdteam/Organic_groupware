package com.ohgiraffers.semi_project.subpage.item.controller;

import com.ohgiraffers.semi_project.subpage.car.controller.CarController;
import com.ohgiraffers.semi_project.subpage.item.model.dto.ItemDTO;
import com.ohgiraffers.semi_project.subpage.item.model.dto.ItemJoinDTO;
import com.ohgiraffers.semi_project.subpage.item.model.dto.rentalDTO;
import com.ohgiraffers.semi_project.subpage.item.model.service.ItemService;
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
public class ItemController {

    private static final Logger logger = LogManager.getLogger(CarController.class);
    private final ItemService itemService;
    private final MessageSource messageSource;

    @Autowired
    public ItemController(ItemService itemService, MessageSource messageSource){
        this.itemService = itemService;
        this.messageSource = messageSource;
    }
    @GetMapping("/item")
    public String item(Model model){
        List<ItemJoinDTO> rentalList = itemService.findAllItem();
        model.addAttribute("rentalList" ,rentalList);

        System.out.println("rentalList = " + rentalList);

        return "subpage/item";
    }


}
