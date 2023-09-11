package com.feige.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
    //@Configuration--spring applicationContext.xml\

    //配置负载均衡实现restTemplate

    //IRule
    //RoundRibbon默认轮询
    //RandomRule随机
    //AvailabilityFilteringRule : 会先过滤掉，跳闸，访问故障的服务，剩下的进行轮询
    //RetryRule:会先按照轮询获取服务，如果服务获取失败，会在指定的时间类进行重试

    @LoadBalanced //Ribbon
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    /*@Bean
    public IRule myRule(){
        return new FeigeRandomRule();
    }*/
}
