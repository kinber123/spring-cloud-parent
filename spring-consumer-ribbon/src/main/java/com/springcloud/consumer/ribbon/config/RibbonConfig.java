package com.springcloud.consumer.ribbon.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @project: spring-cloud-parent
 * *
 * @className: Ribbon
 * *
 * @author: wuchaoyi
 * *
 * @company: 深圳视得安罗格朗电子有限公司
 * *
 * @create: 2021-06-03 16:31
 * *
 * @description:
 **/
@Configuration
public class RibbonConfig {
    @Bean
    @LoadBalanced //开启负载均衡的功能
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
    //修改默认的负载均衡策略
    @Bean
    public IRule myRule() {
        //随机策略
        return new RandomRule();
    }

}
