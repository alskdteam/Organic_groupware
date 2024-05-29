package com.ohgiraffers.semi_project.subpage.edoc.controller;

import com.ohgiraffers.semi_project.auth.model.service.Userdata;
import com.ohgiraffers.semi_project.subpage.edoc.model.dto.EdocFormCtDTO;
import com.ohgiraffers.semi_project.subpage.edoc.model.service.EdocService;
import com.ohgiraffers.semi_project.user.model.dto.LoginUserDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Locale;

@Controller
@RequestMapping("/subpage")
public class EdocFormCtFunctionController {

    private final EdocService edocService;

    @Autowired
    private HttpServletRequest request;

    public EdocFormCtFunctionController(EdocService edocService, MessageSource messageSource) {
        this.edocService = edocService;
    }

    @PostMapping("/regist")
    public String registEdoc(@Valid @ModelAttribute EdocFormCtDTO newEdoc, BindingResult bindingResult,
                             HttpSession session, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            // 유효성 검사에 실패한 경우 처리
            redirectAttributes.addFlashAttribute("errorMessage", "날짜 형식을 맞춰주세요");
            return "redirect:" + request.getHeader("Referer");
        }

        Userdata userDate = new Userdata();
        LoginUserDTO userDTO = userDate.getloginUserDTO();
        int user_id = Integer.parseInt(userDTO.getUserId());

        // newEdoc 객체에 user_id 설정
        newEdoc.setUser_id(user_id);

        EdocFormCtDTO insertedEdoc = edocService.registNewEdoc(newEdoc);

        if (insertedEdoc != null) {
            session.setAttribute("successMessage", "등록에 성공했습니다");
        } else {
            session.setAttribute("successMessage", "등록에 실패했습니다.");
        }

        String edocFormCtNo = String.valueOf(newEdoc.getEdoc_form_ct_no());
        return "redirect:/subpage/edocFrom/selectEdocList/" + edocFormCtNo;

    }
}
