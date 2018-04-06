//package com.holddie.springcloud.feign.feignclient.service1;
//
//import com.holddie.springcloud.feign.feignclient.model.SmsEntity;
//import org.springframework.cloud.netflix.feign.FeignClient;
//import org.springframework.web.bind.annotation.*;
//
///**
// * @author HoldDie
// * @version 1.0.0
// * @email holddie@163.com
// * @date 2018/4/6 20:22
// */
//@FeignClient(name = "feign-sms-interface", fallback = FeignSmsMvcClientFailback.class)
//public interface HytrixSmsClient {
//
//    /** 普通 */
//    @RequestMapping(value = "/sms", method = RequestMethod.GET)
//    String querySms();
//
//    /** 传递对象 */
//    // 实际上是对象转json，作为请求报文
//    @RequestMapping(value = "/sms", method = RequestMethod.POST)
//    String sendSms(@RequestBody SmsEntity sms);
//
//    /** 获取短信内容 */
//    @RequestMapping(value = "/sms/{id}", method = RequestMethod.GET)
//    SmsEntity getSms(@PathVariable("id") String id);
//
//    /** 这是一个会报错的请求，测试fallback */
//    @RequestMapping(value = "/fail404", method = RequestMethod.GET)
//    String fail404();
//}
