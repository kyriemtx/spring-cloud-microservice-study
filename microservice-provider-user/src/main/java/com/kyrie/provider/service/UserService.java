package com.kyrie.provider.service;

import com.kyrie.provider.dao.UserMapper;
import com.kyrie.provider.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @ClassName UserService
 * @Description
 * @Author Kyrie
 * @Date 2019/8/8 9:32
 * @Version 1.0
 **/
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 根据主键查询用户
     */
    public User selectByPrimaryKey(Long id){
        User user = userMapper.selectByPrimaryKey(id);
        return  user;

    }

    /**
     * 查询全部用户
     * @return
     */
    public List<User> getUserList(){
        return  userMapper.getUserList();
    }
}