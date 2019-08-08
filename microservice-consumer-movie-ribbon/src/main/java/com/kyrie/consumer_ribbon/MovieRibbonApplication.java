package com.kyrie.consumer_ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName MovieRibbonApplication
 * @Description
 * @Author Kyrie
 * @Date 2019/8/8 10:43
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class MovieRibbonApplication {

    /**
     * 通过实例化RestTemplate，利用@LoadBalanch注解开启负载均衡能力
     */
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }

    public static void main(String[] args){
        SpringApplication.run(MovieRibbonApplication.class,args);

    }



}
