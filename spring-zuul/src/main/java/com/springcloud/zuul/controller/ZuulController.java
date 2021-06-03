package com.springcloud.zuul.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @project: spring-cloud-parent
 * *
 * @className: ZuulController
 * *
 * @author: wuchaoyi
 * *
 * @company: 深圳视得安罗格朗电子有限公司
 * *
 * @create: 2021-06-03 15:20
 * *
 * @description:
 **/
@RestController
public class ZuulController {

    @GetMapping("/zuul")
    public String zuul(){
        return "zuul";
    }
}
