package com.springcloud.fegin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @project: spring-cloud-parent
 * *
 * @className: FeginServerApplication
 * *
 * @author: wuchaoyi
 * *
 * @company: 深圳视得安罗格朗电子有限公司
 * *
 * @create: 2021-06-03 15:44
 * *
 * @description:
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.springcloud.fegin.client") 	//feign接口的地址（上图的client目录）
public class FeignServerApplication {

    public static void main(String[] args){
        SpringApplication.run(FeignServerApplication.class);
    }
}
