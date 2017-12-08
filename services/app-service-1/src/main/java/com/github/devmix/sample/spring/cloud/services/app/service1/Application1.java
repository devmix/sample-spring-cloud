package com.github.devmix.sample.spring.cloud.services.app.service1;

import com.github.devmix.sample.spring.cloud.AbstractApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.bus.jackson.RemoteApplicationEventScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author Sergey Grachev
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@EnableCircuitBreaker
@EnableHystrixDashboard
@RemoteApplicationEventScan("com.github.devmix.sample.spring.cloud.services.app.api.events")
public class Application1 extends AbstractApplication {

    public static void main(final String[] args) {
        SpringApplication.run(Application1.class, args);
    }
}
