package com.holddie.cloud.gateway.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author HoldDie
 */
@SpringBootApplication
@EnableAutoConfiguration
@EnableEurekaClient
public class CloudGatewayTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudGatewayTutorialApplication.class, args);
    }
}
