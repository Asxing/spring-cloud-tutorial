package com.holddie.springcloud.rabbion;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HoldDie
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/4/7 17:33
 */
@RestController
@RequestMapping("/timeout")
public class SmsController {

    @RequestMapping("/test")
    public String timeOut() throws InterruptedException {
        Thread.sleep(3000L);
        return "ojbk";
    }
}
