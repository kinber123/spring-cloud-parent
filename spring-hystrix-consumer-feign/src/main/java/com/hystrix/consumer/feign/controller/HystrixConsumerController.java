package com.hystrix.consumer.feign.controller;

import com.hystrix.consumer.feign.factory.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @project: spring-cloud-parent
 * *
 * @className: HystrixConsumerController
 * *
 * @author: wuchaoyi
 * *
 * @company: 深圳视得安罗格朗电子有限公司
 * *
 * @create: 2021-06-03 17:04
 * *
 * @description:
 **/
@RestController
@RequestMapping("consumer")
public class HystrixConsumerController {

    @Autowired
    private ProviderClient providerClient;

    @GetMapping("get/{num}")
    public String get(@PathVariable("num") String num) {
        String data = providerClient.get(num);
        return data;
    }
}

