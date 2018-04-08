package com.holddie.springcloud.rabbion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author HoldDie
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/4/7 17:24
 */
@SpringBootApplication
@EnableEurekaServer
public class RibbonEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(RibbonEurekaApplication.class,args);
    }
}
