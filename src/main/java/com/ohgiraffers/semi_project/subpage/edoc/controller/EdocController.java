package com.ohgiraffers.semi_project.subpage.edoc.controller;

import com.ohgiraffers.semi_project.subpage.edoc.model.dto.EdocAndEmployeeDTO;
import com.ohgiraffers.semi_project.subpage.edoc.model.service.EdocService;
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
public class EdocController {

    private static final Logger logger = LogManager.getLogger(EdocController.class);

    private final EdocService edocService;
    private final MessageSource messageSource;

    @Autowired
    public EdocController(EdocService edocService, MessageSource messageSource) {
        this.edocService = edocService;
        this.messageSource = messageSource;
    }

    @GetMapping("/edoc")
    public String edoc(Model model) {
        List<EdocAndEmployeeDTO> employeeAndEdocList = edocService.findAllEmployeeAndEdoc();

        model.addAttribute("employeeAndEdocList", employeeAndEdocList);

        System.out.println(employeeAndEdocList);
        return "subpage/edoc";                          
    }
//
//    @GetMapping("/joinUser_No")
//    public String employeeAndEdocList(Model model) {
//
//        List<EdocAndEmployeeDTO> employeeAndEdocList = edocService.findAllEmployeeAndEdoc();
//
//        model.addAttribute("employeeAndEdocList", employeeAndEdocList);
//
//        System.out.println(employeeAndEdocList);
//        return "subpage/edoc";
//    }

    


}
