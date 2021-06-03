package com.springcloud.fegin.controller;

import com.springcloud.fegin.client.DataClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @project: spring-cloud-parent
 * *
 * @className: DataFeignController
 * *
 * @author: wuchaoyi
 * *
 * @company: 深圳视得安罗格朗电子有限公司
 * *
 * @create: 2021-06-03 15:52
 * *
 * @description:
 **/
@RestController
@RequestMapping("consumer")
public class DataFeignController {

    @Autowired
    private DataClient dataClient;

    @RequestMapping("feignGet")
    public String get() {
        return dataClient.getData();
    }
}
