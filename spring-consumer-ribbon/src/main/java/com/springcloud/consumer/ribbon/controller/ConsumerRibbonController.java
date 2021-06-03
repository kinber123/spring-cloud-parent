package com.springcloud.consumer.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @project: spring-cloud-parent
 * *
 * @className: ConsumerRibbonController
 * *
 * @author: wuchaoyi
 * *
 * @company: 深圳视得安罗格朗电子有限公司
 * *
 * @create: 2021-06-03 16:35
 * *
 * @description:
 **/
@RestController
@RequestMapping("consumerBibbon")
public class ConsumerRibbonController {

    @Autowired
    private RestTemplate restTemplate;

    private final String URL = "http://TEST-PROVIDER/provider/get";

    @GetMapping("get")
    public String get() {
        String data = restTemplate.getForObject(URL, String.class);
        return data;
    }
}

