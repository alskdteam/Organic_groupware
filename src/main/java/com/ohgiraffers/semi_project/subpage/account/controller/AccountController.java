package com.ohgiraffers.semi_project.subpage.account.controller;

import com.ohgiraffers.semi_project.subpage.account.model.dto.AccountJoinDTO;
import com.ohgiraffers.semi_project.subpage.account.model.dto.RegistAccDTO;
import com.ohgiraffers.semi_project.subpage.account.model.service.AccountService;
import com.ohgiraffers.semi_project.subpage.car.controller.CarController;
import com.ohgiraffers.semi_project.subpage.car.model.dto.CarJoinDTO;
import com.ohgiraffers.semi_project.subpage.car.model.service.CarService;
import com.ohgiraffers.semi_project.subpage.main.controller.SidebarController;
import com.ohgiraffers.semi_project.subpage.main.model.service.MainService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/subpage")
public class AccountController {

    private static final Logger logger = LogManager.getLogger(AccountController.class);

    private final AccountService accountService;
    private final MessageSource messageSource;
    private final SidebarController sidebarController;

    @Autowired
    public AccountController(AccountService accountService, MessageSource messageSource, MainService mainService, SidebarController sidebarController) {
        this.accountService = accountService;
        this.messageSource = messageSource;
        this.sidebarController = sidebarController;
    }

    @GetMapping("account")
    public String accJoinList(Model model) {
        sidebarController.getSidebar(model);
        sidebarController.getHeader(model);

        List<AccountJoinDTO> accJoinList = accountService.findAllAcount();
        model.addAttribute("accJoinList", accJoinList);

//        System.out.println("accJoinList = " + accJoinList);


        return "subpage/account";
    }

    @PostMapping("/account")
    public String registAccount(RegistAccDTO registAccDTO, RedirectAttributes rttr ) {

        System.out.println("registAccDTO = " + registAccDTO);
        accountService.registAccount(registAccDTO);
        rttr.addFlashAttribute("successMessage","거래처등록에 성공하셨습니다.");


        return "redirect:/subpage/account";
    }

    
}
