package com.ohgiraffers.semi_project.user.controller;

import com.ohgiraffers.semi_project.user.model.dto.SignupDTO;
import com.ohgiraffers.semi_project.user.model.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/signup")
    public void signup() {}


    @PostMapping("/signup")
    public ModelAndView signup(@Valid @ModelAttribute SignupDTO signupDTO, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        ModelAndView mv = new ModelAndView();

        System.out.println("signupDTO = " + signupDTO);

        if (bindingResult.hasErrors()) {
            mv.addObject("errors", bindingResult.getAllErrors());
            mv.setViewName("signup"); // 다시 회원가입 페이지로 이동
            return mv;
        }

        int result = userService.regist(signupDTO);
        if (result > 0) {
            redirectAttributes.addFlashAttribute("message", "회원가입이 성공적으로 완료되었습니다!");
            mv.setViewName("redirect:/user/signup"); // 회원가입 페이지로 리다이렉트
        } else {
            mv.addObject("message", "회원가입에 실패했습니다.");
            mv.setViewName("user/signup"); // 회원가입 페이지로 이동
        }

        return mv;
    }





}
