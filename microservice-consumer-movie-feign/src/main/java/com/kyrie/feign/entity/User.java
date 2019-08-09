package com.kyrie.feign.entity;

/**
 * @ClassName User
 * @Description
 * @Author Kyrie
 * @Date 2019/8/9 14:07
 * @Version 1.0
 **/
public class User {

    private Long id;
    private String username;
    private int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
