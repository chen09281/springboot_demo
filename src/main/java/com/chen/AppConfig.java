package com.chen;

import com.chen.service.OrderService;
import com.chen.service.UserService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    @ConditionalOnMissingClass(value = "com.chen.service.UserService")
    public OrderService orderService(){
        return new OrderService();
    }
}
