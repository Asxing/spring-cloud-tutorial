package com.holddie.springcloud.feign.smsinterface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author HoldDie
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/4/6 18:38
 */
@SpringBootApplication
@EnableEurekaClient
public class SmsInterFaceApp {

    public static void main(String[] args) {
        SpringApplication.run(SmsInterFaceApp.class, args);
    }
}