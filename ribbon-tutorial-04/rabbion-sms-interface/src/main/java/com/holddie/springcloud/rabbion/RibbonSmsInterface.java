package com.holddie.springcloud.rabbion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author HoldDie
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/4/7 17:30
 */
@SpringBootApplication
@EnableEurekaClient
public class RibbonSmsInterface {
    public static void main(String[] args) {
        SpringApplication.run(RibbonSmsInterface.class,args);
    }
}
