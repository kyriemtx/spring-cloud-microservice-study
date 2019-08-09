package com.kyrie.consumer_ribbon.controller;

import com.kyrie.consumer_ribbon.entity.User;
import com.kyrie.consumer_ribbon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @ClassName UserController
 * @Description
 * @Author Kyrie
 * @Date 2019/8/8 11:15
 * @Version 1.0
 **/
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/one")
    public User selectByPrimaryKey(Long id){
        return this.userService.selectByPrimaryKey(id);

    }


    @GetMapping("/test")
    public String test(){
        return userService.test();
    }

    /**
     * 获取用户信息列表
     * @return
     */
    @GetMapping("/list")
    public List<User> getUserList(){
        return userService.getUserList();
    }
}
