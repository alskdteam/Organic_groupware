package com.ohgiraffers.semi_project.subpage.edoc.controller;

import com.ohgiraffers.semi_project.subpage.edoc.model.dto.EdocFormCtDTO;
import com.ohgiraffers.semi_project.subpage.edoc.model.service.EdocService;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Locale;

@Controller
@RequestMapping("/subpage")
public class EdocFormCtFunctionController {

    private static final Logger logger = LogManager.getLogger(EdocFormCtFunctionController.class);

    private final EdocService edocService;
    private final MessageSource messageSource;

    @Autowired
    private HttpServletRequest request;

    public EdocFormCtFunctionController(EdocService edocService, MessageSource messageSource) {
        this.edocService = edocService;
        this.messageSource = messageSource;
    }

    @PostMapping("/regist")
    public String registEdoc(@ModelAttribute EdocFormCtDTO newEdoc, RedirectAttributes rttr, Locale locale, Model model) {
        edocService.registNewEdoc(newEdoc);
        model.addAttribute("successMessage", "등록에 성공했습니다.");

        logger.info("Locale : {}", locale);
        rttr.addFlashAttribute("successMessage", messageSource.getMessage("registMenu", null, locale));


        return "redirect:" + request.getHeader("Referer");
    }
}
