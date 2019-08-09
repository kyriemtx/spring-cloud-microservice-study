package com.kyrie.feign.service;

import com.kyrie.feign.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserFeignService
 * @Description
 * @Author Kyrie
 * @Date 2019/8/9 14:10
 * @Version 1.0
 **/
//使用FeignClient绑定要调用的服务实例名


@FeignClient(value = "microservice-provider-user",fallback = UserFeignService.HystrixClientFallback.class)
public interface UserFeignService {

    /**
     * 根据主键查询用户信息
     * @param id
     * @return
     */
    @RequestMapping(method = RequestMethod.GET,value = "/one")
    public User selectByPrimaryKey(@RequestParam("id") Long id);

    /**
     * 获取用户信息
     * @return
     */
   @RequestMapping(method = RequestMethod.GET,value = "/list")
    public List<User> getUserList();


   @Component
    static class HystrixClientFallback implements UserFeignService{
       @Override
       public User selectByPrimaryKey(Long id){
           User user = new User();
           user.setAge(11);
           user.setId(0L);
           user.setUsername("default");
           return  user;

       }

       @Override
       public List<User> getUserList(){
           List list = new ArrayList();
           User user = new User();
           user.setAge(11);
           user.setId(0L);
           user.setUsername("default");
           list.add(user);
           return list;
       }
   }


}
