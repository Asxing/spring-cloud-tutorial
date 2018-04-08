package com.holddie.springcloud.ribbon;

import com.holddie.springcloud.ribbon.config.ServiceByAnnontationConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

/**
 * @author HoldDie
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/4/7 17:49
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
// 通过注解的方式定义了一个针对service-by-annotation服务的负载均衡器
@RibbonClients(value = {
        @RibbonClient(name = "service-by-annotation", configuration = ServiceByAnnontationConfiguration.class)})
public class RibbonClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(RibbonClientApplication.class, args);
    }
}
