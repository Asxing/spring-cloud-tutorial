package com.holddie.springcloud.feign.feignclient.service2;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.ConversionService;

/**
 * @author HoldDie
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/4/6 20:40
 */
public class SmsClientConfiguration {

    @Bean
    public Contract feignContract(ConversionService feignConversionService) {
        return new feign.Contract.Default();
    }
}
