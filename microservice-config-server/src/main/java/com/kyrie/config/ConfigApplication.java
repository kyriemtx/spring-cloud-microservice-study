package com.kyrie.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName ConfigApplication
 * @Description
 * @Author Kyrie
 * @Date 2019/8/12 14:02
 * @Version 1.0
 **/
@SpringBootApplication

/**
 * @EnableConfigServer 注解激活配置中心
 * application.yml中有个git.url配置，目前配置的是https://github.com/kyriemtx/spring-cloud-microservice-study.git
 * 获取git上的资源遵循：
 *
 */
@EnableConfigServer
public class ConfigApplication {
    public static void main(String[] args){
        SpringApplication.run(ConfigApplication.class,args);
    }
}
