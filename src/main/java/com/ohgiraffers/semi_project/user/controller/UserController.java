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
            // 유효성 검사 실패
            mv.addObject("errorMessage", "입력한 형식이 다릅니다.");
            mv.setViewName("redirect:/user/signup");
            return mv; // 여기서 메소드 종료하여 DB로 데이터가 들어가지 않도록 함
        } else {
            // 유효성 검사 성공
            int result = userService.regist(signupDTO);
            String message = (result > 0) ? "회원가입이 성공적으로 완료되었습니다!" : "회원가입에 실패했습니다.";
            mv.addObject("message", message);

            mv.setViewName("redirect:/login/login");

        }

        return mv;
    }



}
