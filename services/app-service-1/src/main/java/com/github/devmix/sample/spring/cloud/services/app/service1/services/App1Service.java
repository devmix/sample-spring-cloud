package com.github.devmix.sample.spring.cloud.services.app.service1.services;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

/**
 * @author Sergey Grachev
 */
@Service
public class App1Service {

    @HystrixCommand(fallbackMethod = "defaultLongOperation", commandProperties = {
            @HystrixProperty(name = "execution.timeout.enabled", value = "true"),
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000")
    })
    public String longOperation() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "slow-1";
    }

    public String defaultLongOperation() {
        return "slow-2";
    }
}
