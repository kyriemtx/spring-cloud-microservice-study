package com.kyrie.provider.controller;

import com.kyrie.provider.entity.User;
import com.kyrie.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserController
 * @Description
 * @Author Kyrie
 * @Date 2019/8/7 16:35
 * @Version 1.0
 **/
@RestController
public class UserController {
    @Autowired
    private org.springframework.cloud.client.discovery.DiscoveryClient discoveryClients;

    @Autowired
    private UserService userService;

    @GetMapping("/one")
    public User selectByPrimaryKey(Long id){
      User user = userService.selectByPrimaryKey(id);
      return  user;

    }
    @GetMapping("/list")
    public List<User> getUserList(){
        return userService.getUserList();
    }

    @GetMapping("/test")
    public String  test(){
         return  "test";

    }
}
