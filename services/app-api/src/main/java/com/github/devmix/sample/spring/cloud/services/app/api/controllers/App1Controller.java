package com.github.devmix.sample.spring.cloud.services.app.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Sergey Grachev
 */
public interface App1Controller {

    @GetMapping(path = "/slow-op1")
    String slowOp1();

    @GetMapping(path = "/fast-op1")
    String fastOp1();
}
