package com.holddie.springcloud.feign.feignclient.service2;

import com.holddie.springcloud.feign.feignclient.model.SmsEntity;
import feign.Body;
import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

import javax.websocket.server.PathParam;
import javax.ws.rs.POST;

/**
 * @author HoldDie
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/4/6 20:56
 */
@FeignClient(name = "feign-sms-interface", url = "http://localhost:58081", configuration = SmsClientConfiguration.class)
public interface NormalSmsClient {

    /**
     * 普通
     */
    @RequestLine(value = "GET /sms")
    String querySms();

    /**
     * 传递对象
     */
    @RequestLine(value = "POST /sms")
    String sendSms(SmsEntity sms);

    /**
     * 固定一个body请求的模板，占位符代表参数
     */
    @RequestLine(value = "POST /sms")
    @Headers("Content-Type: application/json")
    // 可以是{"pohone":"10086","content":"hahha"}
    // 或者可以是<xml></xml>
    @Body("%7B\"phone\": \"{phone}\", \"content\": \"{content}\"%7D")
    String sendSmsTemplate(@Param("phone") String phone, @Param("content") String content);

    /**
     * 获取短信内容
     */
    @RequestLine(value = "GET /sms/{id}")
    SmsEntity getSms(@PathParam("id") String id);

}
