package com.hystrix.consumer.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @project: spring-cloud-parent
 * *
 * @className: HystrixConsumerFeignApplication
 * *
 * @author: wuchaoyi
 * *
 * @company: 深圳视得安罗格朗电子有限公司
 * *
 * @create: 2021-06-03 17:01
 * *
 * @description:
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.hystrix.consumer.feign.factory")
public class HystrixConsumerFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixConsumerFeignApplication.class);
    }
}

