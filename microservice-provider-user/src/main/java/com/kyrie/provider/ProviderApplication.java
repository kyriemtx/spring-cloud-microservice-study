package com.kyrie.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName ProviderApplication
 * @Description
 * @Author Kyrie
 * @Date 2019/8/7 16:27
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.kyrie.provider.dao")
public class ProviderApplication {
    public  static void  main(String[] args){
        SpringApplication.run(ProviderApplication.class,args);

    }
}
