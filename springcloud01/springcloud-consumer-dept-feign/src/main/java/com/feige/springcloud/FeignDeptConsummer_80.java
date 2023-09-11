package com.feige.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

//Ribbon 和 Eureka 集合以后，客户端可以直接调用，不用加ip地址
@SpringBootApplication
@EnableEurekaClient
// feign客户端注解,并指定要扫描的包以及配置接口DeptClientService
@EnableFeignClients(basePackages = {"com.feige.springcloud"})
// 切记不要加这个注解，不然会出现404访问不到
//@ComponentScan("com.feige.springcloud")
public class FeignDeptConsummer_80 {
    public static void main(String[] args) {
        SpringApplication.run(FeignDeptConsummer_80.class,args);
    }
}
