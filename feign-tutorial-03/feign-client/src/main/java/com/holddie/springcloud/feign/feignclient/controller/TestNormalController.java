package com.holddie.springcloud.feign.feignclient.controller;

import com.holddie.springcloud.feign.feignclient.model.SmsEntity;
import com.holddie.springcloud.feign.feignclient.service2.NormalSmsClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HoldDie
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/4/6 20:16
 */
@RestController
@RequestMapping("/feign-normal")
public class TestNormalController {

    static Logger logger = LoggerFactory.getLogger(TestNormalController.class);

    @Autowired
    NormalSmsClient normalSmsClient;

    // get 请求
    @RequestMapping("/test1")
    public String test1() {
        String body = normalSmsClient.querySms();
        return body;
    }

    // post 请求
    @RequestMapping("/test2")
    public String test2(@RequestBody SmsEntity sms) {
        String body = normalSmsClient.sendSms(sms);
        return body;
    }

    @RequestMapping("/test3")
    public String test3(String phone, String content) {
        String sendSmsTemplate = normalSmsClient.sendSmsTemplate(phone, content);
        return sendSmsTemplate;
    }

    @RequestMapping("/test4")
    public SmsEntity test4(String id) {
        SmsEntity sendSmsTemplate = normalSmsClient.getSms(id);
        return sendSmsTemplate;
    }
}
