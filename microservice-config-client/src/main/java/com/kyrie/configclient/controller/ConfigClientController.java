package com.kyrie.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ConfigClientController
 * @Description
 * @Author Kyrie
 * @Date 2019/8/13 10:41
 * @Version 1.0
 **/
@RestController

//RefreshScope注解不能少，否则配置文件不会刷新

@RefreshScope
public class ConfigClientController {
    @Value("${profile}")
    private String profile;

    /**
     * 获取配置文件中的profile
     * @return
     */
    @GetMapping("/profile")
    public String profile(){
        return profile;
    }

}
