package com.github.devmix.sample.spring.cloud.services.app.service2.clients;

import com.github.devmix.sample.spring.cloud.services.app.api.controllers.App1Controller;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @author Sergey Grachev
 */
@FeignClient(value = "services-app-1", fallback = App1Client.App1ClientFallback.class)
public interface App1Client extends App1Controller {

    @Component
    class App1ClientFallback implements App1Client {

        @Override
        public String slowOp1() {
            return "slow-fallback";
        }

        @Override
        public String fastOp1() {
            return "fast-fallback";
        }
    }
}
