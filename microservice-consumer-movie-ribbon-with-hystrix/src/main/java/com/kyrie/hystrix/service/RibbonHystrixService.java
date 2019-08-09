package com.kyrie.hystrix.service;

import com.kyrie.hystrix.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.logging.Logger;

/**
 * @ClassName RibbonHystrixService
 * @Description
 * @Author Kyrie
 * @Date 2019/8/8 18:14
 * @Version 1.0
 **/
@Service
public class RibbonHystrixService {
    @Autowired
    private RestTemplate restTemplate;
   // private static final Logger LOGGER = LoggerFactory.getLogger(RibbonHystrixService.class);
    /**
     * 调用服务提供者提供的服务查询用户信息
     * @return
     */
    @HystrixCommand(fallbackMethod = "fallback")
    public User selectByPrimaryKey(Long id){
        User user = restTemplate.getForObject("http://MICROSERVICE-PROVIDER-USER/one/?id="+id,User.class);
        return user;

    }

    public String test(){
        return  restTemplate.getForObject("http://MICROSERVICE-PROVIDER-USER/test",String.class);
    }

    /**
     * 获取用户信息列表
     * @return
     */

    public List<User> getUserList(){
        return restTemplate.getForObject("http://MICROSERVICE-PROVIDER-USER/list",List.class);
    }


    public User fallback(Long id){
        User user = new User();
        user.setAge(88);
        user.setId(5L);
        user.setUsername("kkkkkkkk");
        return  user;
    }
}
