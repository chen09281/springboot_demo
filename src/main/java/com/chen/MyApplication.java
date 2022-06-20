package com.chen;

import com.chen.service.OrderService;
import com.chen.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(MyApplication.class);
        System.out.println(applicationContext.getBean(OrderService.class));
    }
}
