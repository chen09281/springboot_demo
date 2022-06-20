package com.chen.service;

import com.chen.mapper.UserMapper;
import jdk.jfr.TransitionFrom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class UserService { // userService
    @Autowired
    private UserMapper userMapper;

/*    @Transactional
    public void test(){
        userMapper.insertOne();
//        throw new NullPointerException();
    }*/

    public String test1(){
        return "chen";
    }
}
