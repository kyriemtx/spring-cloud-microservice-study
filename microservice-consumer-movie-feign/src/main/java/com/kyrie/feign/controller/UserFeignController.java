package com.kyrie.feign.controller;

import com.kyrie.feign.entity.User;
import com.kyrie.feign.service.UserFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName UserFeignController
 * @Description
 * @Author Kyrie
 * @Date 2019/8/9 14:15
 * @Version 1.0
 **/
@RestController

public class UserFeignController {
    @Autowired
    private UserFeignService userFeignService;

    /**
     * 根据主键查询用户信息
     * @param id
     * @return
     */
    @GetMapping("/one")
    public User selectByPrimaryKey(Long id){
        return  userFeignService.selectByPrimaryKey(id);

    }

    /**
     * 查询用户信息列表
     * @return
     */
    @RequestMapping(method = RequestMethod.GET,value = "/list")
    public List<User> getUserList(){
        return  userFeignService.getUserList();
    }
}
