package com.github.devmix.sample.spring.cloud.services.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

/**
 * @author Sergey Grachev
 */
@Configuration
@EnableAutoConfiguration
@EnableConfigServer
public class ServiceConfigApplication {
    public static void main(final String[] args) {
        SpringApplication.run(ServiceConfigApplication.class, args);
    }
}
