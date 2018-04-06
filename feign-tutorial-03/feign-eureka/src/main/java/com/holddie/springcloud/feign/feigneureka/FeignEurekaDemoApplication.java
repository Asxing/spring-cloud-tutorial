package com.holddie.springcloud.feign.feigneureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FeignEurekaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignEurekaDemoApplication.class, args);
    }
}
