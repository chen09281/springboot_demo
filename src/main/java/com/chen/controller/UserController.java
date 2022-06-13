package com.chen.controller;

import com.chen.mapper.UserMapper;
import com.chen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;
    @GetMapping("/chen")
    public String test(){
//        userMapper.insertOne();
        return userService.test1();
    }
}
