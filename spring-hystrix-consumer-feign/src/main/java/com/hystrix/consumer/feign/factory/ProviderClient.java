package com.hystrix.consumer.feign.factory;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @project: spring-cloud-parent
 * *
 * @className: ProviderClient
 * *
 * @author: wuchaoyi
 * *
 * @company: 深圳视得安罗格朗电子有限公司
 * *
 * @create: 2021-06-03 17:03
 * *
 * @description:
 **/
//添加一个后备工厂，在失败时使用
@FeignClient(value = "TEST-HYSTRIX-PROVIDER", fallbackFactory = ProviderClientFactory.class)
@RequestMapping("provider")
public interface ProviderClient {

    @GetMapping("get/{num}")
    public String get(@PathVariable("num") String num);
}

