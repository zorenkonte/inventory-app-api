package com.darkmode.inventory_app.config;

import com.darkmode.inventory_app.annotation.CustomRestController;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import static com.darkmode.inventory_app.util.Constant.API_PREFIX;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer.addPathPrefix(API_PREFIX, aClass -> aClass.isAnnotationPresent(CustomRestController.class));
    }
}
