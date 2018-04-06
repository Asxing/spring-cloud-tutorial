//package com.holddie.springcloud.feign.feignclient.controller;
//
//import com.holddie.springcloud.feign.feignclient.model.SmsEntity;
//import com.holddie.springcloud.feign.feignclient.service1.HytrixSmsClient;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * @author HoldDie
// * @version 1.0.0
// * @email holddie@163.com
// * @date 2018/4/6 20:11
// */
//@RestController
//@RequestMapping(value = "/feign-hytrix")
//public class TestHytrixController {
//    static Logger logger = LoggerFactory.getLogger(TestHytrixController.class);
//    @Autowired
//    HytrixSmsClient hytrixSmsClient;
//
//    // get 请求
//    @RequestMapping("/test1")
//    public String test1() {
//        String body = hytrixSmsClient.querySms();
//        return body;
//    }
//
//    // post 请求
//    @RequestMapping("/test2")
//    public String test2(@RequestBody SmsEntity sms) {
//        String body = hytrixSmsClient.sendSms(sms);
//        return body;
//    }
//
//    @RequestMapping("/test4")
//    public SmsEntity test4(String id) {
//        SmsEntity sendSmsTemplate = hytrixSmsClient.getSms(id);
//        return sendSmsTemplate;
//    }
//
//    @RequestMapping("/test5")
//    public String test5() {
//        String sendSmsTemplate = hytrixSmsClient.fail404();
//        return sendSmsTemplate;
//    }
//}
