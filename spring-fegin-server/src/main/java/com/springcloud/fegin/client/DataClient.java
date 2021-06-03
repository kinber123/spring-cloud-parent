package com.springcloud.fegin.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @project: spring-cloud-parent
 * *
 * @className: DataClient
 * *
 * @author: wuchaoyi
 * *
 * @company: 深圳视得安罗格朗电子有限公司
 * *
 * @create: 2021-06-03 15:51
 * *
 * @description:
 **/

@FeignClient(value = "TEST-PROVIDER") 	//要调用的服务名称
@RequestMapping("provider")				//和调用服务controller的一致
public interface DataClient {

    //和调用服务controller的一致
    @RequestMapping("get")
    public String getData();
}

