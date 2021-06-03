package com.springcloud.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @project: spring-cloud-parent
 * *
 * @className: ServerController
 * *
 * @author: wuchaoyi
 * *
 * @company: 深圳视得安罗格朗电子有限公司
 * *
 * @create: 2021-06-03 14:14
 * *
 * @description:
 **/
@RestController
public class ServerController {

    /**
     *
     * @return
     */
    @GetMapping("/get")
    public String providerServer(){
        return "springcloud-provider3 !!!";
    }

}
