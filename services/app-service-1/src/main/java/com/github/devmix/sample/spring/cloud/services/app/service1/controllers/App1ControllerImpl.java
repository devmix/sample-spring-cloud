package com.github.devmix.sample.spring.cloud.services.app.service1.controllers;

import com.github.devmix.sample.spring.cloud.services.app.api.controllers.App1Controller;
import com.github.devmix.sample.spring.cloud.services.app.service1.services.App1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sergey Grachev
 */
@RestController
public class App1ControllerImpl implements App1Controller {

    @Autowired
    private App1Service service;

    @Override
    public String slowOp1() {
        return service.longOperation();
    }

    @Override
    public String fastOp1() {
        return "fast-1";
    }
}
