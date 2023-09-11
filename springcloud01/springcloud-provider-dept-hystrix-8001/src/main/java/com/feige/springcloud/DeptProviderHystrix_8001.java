package com.feige.springcloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * @author 高毅飞
 */
//启动类



@SpringBootApplication
@EnableEurekaClient//自动在服务启动后自动注册到eureka
@EnableDiscoveryClient//服务发现
@EnableCircuitBreaker//添加对熔断的支持
public class DeptProviderHystrix_8001 {
    public static void main(String[] args) {SpringApplication.run(DeptProviderHystrix_8001.class,args);}
    @Bean
    public ServletRegistrationBean HystrixMetricsStreamServlet(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new HystrixMetricsStreamServlet());
        registrationBean.addUrlMappings("/actuator/hystrix.stream");
        return registrationBean;
    }
}