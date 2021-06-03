package com.springcloud.consumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @project: spring-cloud-parent
 * *
 * @className: ConsumerController
 * *
 * @author: wuchaoyi
 * *
 * @company: 深圳视得安罗格朗电子有限公司
 * *
 * @create: 2021-06-03 14:35
 * *
 * @description:
 **/
@RestController
public class ConsumerController {
    //资源路径
    private final String url = "http://127.0.0.1:8001/provider/get";

    @RequestMapping("get")
    public String get(){
        RestTemplate template = new RestTemplate();
        String data = template.getForObject(url, String.class);
        return data;
    }
}

