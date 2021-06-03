package com.springcloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @project: spring-cloud-parent
 * *
 * @className: ZuulApplication
 * *
 * @author: wuchaoyi
 * *
 * @company: 深圳视得安罗格朗电子有限公司
 * *
 * @create: 2021-06-03 14:42
 * *
 * @description:
 **/
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaServer
public class ZuulApplication {

    public static void main(String[] args){
        SpringApplication.run(ZuulApplication.class);
    }
}
