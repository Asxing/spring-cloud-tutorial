package com.holddie.springcloud.ribbon.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HoldDie
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/4/7 18:15
 */
@RestController
@RequestMapping("/loadbalance")
public class TestLoadBalancerClientController {
    private static Logger logger = LoggerFactory.getLogger(TestLoadBalancerClientController.class);
    private final
    LoadBalancerClient loadbalancerClient; // spring cloud 封装的 关于负载均衡组件 ribbon的工具类

    @Autowired
    public TestLoadBalancerClientController(LoadBalancerClient loadbalancerClient) {
        this.loadbalancerClient = loadbalancerClient;
    }
    // properties

    @RequestMapping("/properties")
    public void properties() {
        ServiceInstance serviceInstance = loadbalancerClient.choose("service-by-properties");
        logger.warn("TestLoadBalancerClientController.properties执行结果：{}", serviceInstance.getUri());
    }

    // annotation
    @RequestMapping("/annotation")
    public void annotation() {
        ServiceInstance serviceInstance = loadbalancerClient.choose("service-by-annotation");
        logger.warn("TestLoadBalancerClientController.annotation执行结果：{}", serviceInstance.getUri());
    }

    // eureka
    @RequestMapping("/eureka")
    public void eureka() {
        ServiceInstance serviceInstance = loadbalancerClient.choose("ribbon-sms-interface");
        logger.warn("TestLoadBalancerClientController.eureka执行结果：{}", serviceInstance.getUri());
    }
}
