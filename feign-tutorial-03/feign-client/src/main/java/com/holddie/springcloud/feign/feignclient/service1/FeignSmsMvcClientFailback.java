//package com.holddie.springcloud.feign.feignclient.service1;
//
//import com.holddie.springcloud.feign.feignclient.model.SmsEntity;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
///**
// * @author HoldDie
// * @version 1.0.0
// * @email holddie@163.com
// * @date 2018/4/6 20:32
// */
//@Component
//public class FeignSmsMvcClientFailback implements HytrixSmsClient{
//
//    static final Logger logger = LoggerFactory.getLogger(FeignSmsMvcClientFailback.class);
//
//    @Override
//    public String querySms() {
//        logger.warn("调用querySms出错");
//        return "querySms出错啦";
//    }
//
//    @Override
//    public String sendSms(SmsEntity sms) {
//        logger.warn("调用sendSms出错");
//        return "sendSms出错啦";
//    }
//
//    @Override
//    public String fail404() {
//        logger.warn("调用fail404出错");
//        return "fail404出错啦";
//    }
//
//    @Override
//    public SmsEntity getSms(String id) {
//        logger.warn("调用sendSms出错");
//        return new SmsEntity(0,"这是错误的");
//    }
//}
