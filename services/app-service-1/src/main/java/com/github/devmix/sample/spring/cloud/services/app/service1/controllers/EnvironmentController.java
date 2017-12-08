package com.github.devmix.sample.spring.cloud.services.app.service1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sergey Grachev
 */
@RestController
@RequestMapping("/app/env")
public class EnvironmentController {

    @Autowired
    private Environment environment;

    @GetMapping("/property/{name}")
    public String property(@PathVariable("name") final String name) {
        return environment.getProperty(name);
    }
}
