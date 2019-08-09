package com.kyrie.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName MovieFeignApplication
 * @Description
 * @Author Kyrie
 * @Date 2019/8/9 14:03
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class MovieFeignApplication {
    public static void main(String[] args){
        SpringApplication.run(MovieFeignApplication.class,args);

    }

}
