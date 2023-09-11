package com.feige.myrule;

import com.feige.myrule.FeigeRandomRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeigeRule {
    @Bean
    public IRule myRule(){
        //return new FeigeRandomRule();//默认是轮询，现在自定义为自己的策略
        return new RoundRobinRule();
    }
}
