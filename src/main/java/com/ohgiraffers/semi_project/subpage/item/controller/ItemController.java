package com.ohgiraffers.semi_project.subpage.item.controller;

import com.ohgiraffers.semi_project.auth.model.service.Userdata;
import com.ohgiraffers.semi_project.subpage.car.controller.CarController;
import com.ohgiraffers.semi_project.subpage.item.model.dto.ItemDTO;
import com.ohgiraffers.semi_project.subpage.item.model.dto.ItemJoinDTO;
import com.ohgiraffers.semi_project.subpage.item.model.dto.registRentalDTO;
import com.ohgiraffers.semi_project.subpage.item.model.service.ItemService;
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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/subpage")
public class ItemController {

    private static final Logger logger = LogManager.getLogger(CarController.class);
    private final ItemService itemService;
    private final MessageSource messageSource;
    private final MainService mainService;
    private final SidebarController sidebarController;

    public ItemController(ItemService itemService, MessageSource messageSource, MainService mainService, SidebarController sidebarController) {
        this.itemService = itemService;
        this.messageSource = messageSource;
        this.mainService = mainService;
        this.sidebarController = sidebarController;
    }

    @GetMapping("/item")
    public String item(Model model){
        sidebarController.getSidebar(model);
        sidebarController.getHeader(model);


        List<ItemJoinDTO> rentalList = itemService.findAllItem();
        model.addAttribute("rentalList" ,rentalList);

        System.out.println("rentalList = " + rentalList);

        return "subpage/item";
    }


    @GetMapping(value = "item/find", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public List<ItemJoinDTO> finditemList() {


        return itemService.finditemList();
    }
    @PostMapping("item")
    public String registitem( RedirectAttributes rttr, @RequestParam Map<String ,Object> itemRental) {



        Userdata userdata = new Userdata();
        LoginUserDTO userDTO = userdata.getloginUserDTO();
        int userCode = Integer.parseInt(userDTO.getUserId());
        itemRental.put("userCode", userCode);

        System.out.println("regist = " + itemRental);

        int result = itemService.itemRental(itemRental);


        rttr.addFlashAttribute("successMessage","차량예약에 성공하셨습니다.");


        return "redirect:/subpage/item";
    }
}
