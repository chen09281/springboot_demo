package com.chen;

import com.chen.service.OrderService;
import com.chen.service.UserService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    @ConditionalOnBean(value = UserService.class)
    public OrderService orderService(){
        return new OrderService();
    }
}
