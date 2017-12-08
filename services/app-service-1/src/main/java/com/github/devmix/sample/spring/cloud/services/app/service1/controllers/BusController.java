package com.github.devmix.sample.spring.cloud.services.app.service1.controllers;

import com.github.devmix.sample.spring.cloud.services.app.api.events.BusEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sergey Grachev
 */
@RestController
@RequestMapping("/app/bus")
public class BusController {

    @Autowired
    private ApplicationContext ctx;

    @GetMapping("/send/{payload}")
    public void send(@PathVariable("payload") final String payload) {
        final BusEvent event = new BusEvent(this, ctx.getId());
        event.setPayload(payload);
        ctx.publishEvent(event);
    }
}
