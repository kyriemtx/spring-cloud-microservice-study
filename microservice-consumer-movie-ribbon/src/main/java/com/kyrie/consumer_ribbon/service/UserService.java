package com.kyrie.consumer_ribbon.service;

import com.kyrie.consumer_ribbon.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @ClassName UserService
 * @Description
 * @Author Kyrie
 * @Date 2019/8/8 11:11
 * @Version 1.0
 **/
@Service
public class UserService {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 调用服务提供者提供的服务查询用户信息
     * @return
     */
    public User selectByPrimaryKey(Long id){

        User user = restTemplate.getForObject("http://MICROSERVICE-PROVIDER-USER/one/"+id,User.class);
        return user;

    }

    public String test(){
        return  restTemplate.getForObject("http://MICROSERVICE-PROVIDER-USER/test",String.class);
    }
}
