package com.holddie.springcloud.feign.feignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClientsConfiguration;

/**
 * @author HoldDie
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/4/6 20:04
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(defaultConfiguration=FeignClientsConfiguration.class)
public class FeignClientApp {

    public static void main(String[] args) {
        SpringApplication.run(FeignClientApp.class, args);
    }
}
