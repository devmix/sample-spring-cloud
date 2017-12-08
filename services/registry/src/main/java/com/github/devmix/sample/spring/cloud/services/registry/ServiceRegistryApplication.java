package com.github.devmix.sample.spring.cloud.services.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Sergey Grachev
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryApplication {

    public static void main(final String[] args) {
        SpringApplication.run(ServiceRegistryApplication.class, args);
    }
}
