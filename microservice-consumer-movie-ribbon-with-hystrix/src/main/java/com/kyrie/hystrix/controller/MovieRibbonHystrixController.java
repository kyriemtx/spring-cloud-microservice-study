package com.kyrie.hystrix.controller;

import com.kyrie.hystrix.entity.User;
import com.kyrie.hystrix.service.RibbonHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName MovieRibbonHystrixController
 * @Description
 * @Author Kyrie
 * @Date 2019/8/8 18:28
 * @Version 1.0
 **/
@RestController
public class MovieRibbonHystrixController {
    @Autowired
    private RibbonHystrixService ribbonHystrixService;

    @GetMapping("/one")
    public User selectByPrimaryKey(Long id){
        return ribbonHystrixService.selectByPrimaryKey(id);
    }

    @GetMapping("/test")
    public String test(){
        return  ribbonHystrixService.test();
    }

    /**
     * 获取用户信息列表
     * @return
     */
    @GetMapping("/list")
    public List<User> getUserList(){
        return ribbonHystrixService.getUserList();
    }

    @GetMapping("/feign")
    public String feign(String test){
        return ribbonHystrixService.test();

    }

}
