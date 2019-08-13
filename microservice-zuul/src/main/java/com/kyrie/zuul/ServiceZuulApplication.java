package com.kyrie.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @ClassName ServiceZuulApplication
 * @Description
 * @Author Kyrie
 * @Date 2019/8/12 16:54
 * @Version 1.0
 **/
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ServiceZuulApplication {
    public static void main(String[] args){
        SpringApplication.run(ServiceZuulApplication.class,args);
    }
}
