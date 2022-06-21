package com.chen.service;

import com.chen.properties.MyProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
@Component
public class UserService {

    @Autowired
    private MyProperties myProperties;


    public void test(){
        System.out.println(myProperties.getPassword());
    }
}
