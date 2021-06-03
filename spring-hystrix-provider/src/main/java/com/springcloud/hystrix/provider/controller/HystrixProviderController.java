package com.springcloud.hystrix.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @project: spring-cloud-parent
 * *
 * @className: HystrixProviderController
 * *
 * @author: wuchaoyi
 * *
 * @company: 深圳视得安罗格朗电子有限公司
 * *
 * @create: 2021-06-03 16:57
 * *
 * @description:
 **/
@RestController
@RequestMapping("provider")
public class HystrixProviderController {

    @GetMapping("get/{num}")
    public String get(@PathVariable("num") Integer num) {
        if (num == 123) {
            throw new RuntimeException("FAILED");
        }
        return num + "==SUCCEED";
    }
}
