package com.github.devmix.sample.spring.cloud.services.app.ui.emberjs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author Sergey Grachev
 */
@SpringBootApplication
@Controller
public class ApplicationEmberJsUI extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/", "classpath:/webapp/emberjs/");
    }

    @RequestMapping("/")
    public String home() {
        return "redirect:/index.html";
    }

    public static void main(final String[] args) {
        SpringApplication.run(ApplicationEmberJsUI.class, args);
    }
}
