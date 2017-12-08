package com.github.devmix.sample.spring.cloud.services.app.service2.controllers;

import com.github.devmix.sample.spring.cloud.services.app.service2.clients.App1Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sergey Grachev
 */
@RestController
public class App2Controller {

    @Autowired
    private App1Client client;

    @GetMapping("slow-app-1")
    public String slowApp1() {
        return client.slowOp1();
    }

    @GetMapping("fast-app-1")
    public String fastApp1() {
        return client.fastOp1();
    }
}
