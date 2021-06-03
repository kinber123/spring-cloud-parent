package com.hystrix.consumer.feign.factory;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @project: spring-cloud-parent
 * *
 * @className: ProviderClientFactory
 * *
 * @author: wuchaoyi
 * *
 * @company: 深圳视得安罗格朗电子有限公司
 * *
 * @create: 2021-06-03 17:04
 * *
 * @description:
 **/
@Component
public class ProviderClientFactory implements FallbackFactory<ProviderClient> {

    @Override
    public ProviderClient create(Throwable cause) {
        return new ProviderClient() {
            @Override
            public String get(String num) {
                return "Feign调用失败";
            }
        };
    }
}

