package com.ohgiraffers.semi_project.config;

import com.ohgiraffers.semi_project.auth.model.service.Userdata;
import com.ohgiraffers.semi_project.subpage.main.controller.SidebarController;
import com.ohgiraffers.semi_project.subpage.main.model.service.MainService;
import com.ohgiraffers.semi_project.user.model.dto.LoginUserDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Locale;
import java.util.Map;

@Configuration
@ComponentScan(basePackages = "com.ohgiraffers.semi_project")
public class ContextConfiguration {


    @Bean
    public ReloadableResourceBundleMessageSource messageSource() {
        ReloadableResourceBundleMessageSource source = new ReloadableResourceBundleMessageSource();
        source.setBasename("classpath:/messages/message");
        source.setDefaultEncoding("UTF-8");
        /* 제공하지 않는 언어로 요청 시 MessageSource에서 사용할 default 언어 한국 */
        Locale.setDefault(Locale.KOREA);
        return source;
    }


}
