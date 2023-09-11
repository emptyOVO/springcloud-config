package com.feige.springcloud;

import com.feige.myrule.FeigeRandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

//Ribbon 和 Eureka 集合以后，客户端可以直接调用，不用加ip地址
@SpringBootApplication
@EnableEurekaClient
//在微服务启动的时候就能去加载成我们自定义的Ribbon类
@RibbonClient(name = "SPRINGCLOUD-PROVIDER-DEPT",configuration = FeigeRandomRule.class)
public class DeptConsummer_80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsummer_80.class,args);
    }
}
