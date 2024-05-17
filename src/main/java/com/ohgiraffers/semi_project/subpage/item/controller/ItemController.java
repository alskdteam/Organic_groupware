package com.ohgiraffers.semi_project.subpage.item.controller;

import com.ohgiraffers.semi_project.subpage.car.controller.CarController;
import com.ohgiraffers.semi_project.subpage.car.model.dto.VehicleDTO;
import com.ohgiraffers.semi_project.subpage.item.model.dto.ItemDTO;
import com.ohgiraffers.semi_project.subpage.item.model.dto.ItemJoinDTO;
import com.ohgiraffers.semi_project.subpage.item.model.dto.registRentalDTO;
import com.ohgiraffers.semi_project.subpage.item.model.dto.rentalDTO;
import com.ohgiraffers.semi_project.subpage.item.model.service.ItemService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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


    @GetMapping(value = "item/find", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public List<ItemDTO> finditemList() {


        return itemService.finditemList();
    }
    @PostMapping("item")
    public String registitem(registRentalDTO rentalDTO, RedirectAttributes rttr) {


        System.out.println("rerentalDTO = " + rentalDTO);
        itemService.registitem(rentalDTO);
        rttr.addFlashAttribute("successMessage","차량예약에 성공하셨습니다.");

        System.out.println("carJoinDTO = " + rentalDTO);
        return "redirect:/subpage/item";
    }
}
