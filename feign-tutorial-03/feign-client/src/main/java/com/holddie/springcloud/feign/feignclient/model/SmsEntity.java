package com.holddie.springcloud.feign.feignclient.model;

import lombok.Data;

/**
 * @author HoldDie
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/4/6 20:08
 */
@Data
public class SmsEntity {

    Integer phone;

    String content;

    SmsEntity(){}

    public SmsEntity(int i, String s) {
        this.phone = i;
        this.content = s;
    }
}
