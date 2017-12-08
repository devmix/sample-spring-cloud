package com.github.devmix.sample.spring.cloud.services.app.service2.bus;

import com.github.devmix.sample.spring.cloud.services.app.api.events.BusEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


/**
 * @author Sergey Grachev
 */
@Component
public class BusListener implements ApplicationListener<BusEvent> {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void onApplicationEvent(final BusEvent event) {
        logger.info("Event: {} : {}", event.getClass().getSimpleName(), event.getPayload());
    }
}
