package com.kyrie.erueka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName EurekaApplication
 * @Description
 * @Author Kyrie
 * @Date 2019/8/7 14:37
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
    public static void main(String[] args){
        SpringApplication.run(EurekaApplication.class,args);

    }
}
