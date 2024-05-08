package com.ohgiraffers.semi_project.config;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import java.util.Locale;

@Configuration
@MapperScan(basePackages = "com.ohgiraffers.semi_project", annotationClass = Mapper.class)
public class MybatisConfig {


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
