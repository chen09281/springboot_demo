package com.chen;

import com.chen.service.OrderService;
import com.chen.service.UserService;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationPropertiesScan("com.chen.properties")
public class AppConfig {
    @Bean
//    @ConditionalOnJava(value = JavaVersion.SEVENTEEN)
//    @ConditionalOnWebApplication
//    @ConditionalOnProperty(name = "test.condition123",matchIfMissing = true)
//    @ConditionalOnResource(resources = "https://www.baidu.com")
//    @ConditionalOnWarDeployment
//    @ConditionalOnCloudPlatform(value = )
    public OrderService orderService(){
        return new OrderService();
    }
}
