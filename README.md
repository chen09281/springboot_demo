# 学习springboot
这可比spring好用太多了，基本上bean都能够自动配置。
## Bean配置
### 基本项
| 函数名                       | 作用                           | 参数 |
|---------------------------|------------------------------|--|
| @ConditionalOnBean | 判断bean是否存在该类里，若存在就执行，不存在返回错误 | 对应bean的名称,或类型 |
| @ConditionalOnMissingBean | 判断bean是否存在该类里，若不存在执行，存在则报错 | 对应的bean的名称，或类型 |
| @ConditionalOnSingleCandidate | 只能有单个的 | 类型，名称 |
| @ConditionalOnClass | 判断里面有这个类，那么就生效 | 类型，名称 |
| @ConditionalMissClass | 判断里面是否缺少某个类 | 名字 |
| @ConditionalOnExpression | 判断表达式 | 函数 |
| @ConditionalOnJAVA | 只有对应的java版本才能使用 | 类型 |
| @ConditionalOnWebApplication | 判断是否为web应用 |  |
### 使用案例

#### @ConditionalOnBean

```java
@Configuration
public class AppConfig {
    @Bean
    @ConditionalOnBean(value = UserService.class)
    
    public OrderService orderService() {
        return new OrderService();
    }
}
```

#### @ConditionalOnMissingBean

```java
@Configuration
public class AppConfig {
    @Bean
    @ConditionalOnMissingBean(value = UserService.class)
    public OrderService orderService(){
        return new OrderService();
    }
}
```

#### @ConditionalOnSingleCandidate

```java
@Configuration
public class AppConfig {
    @Bean
    @ConditionalOnSingleCandidate(value = UserService.class)
    public OrderService orderService() {
        return new OrderService();
    }
}
// 结果还是能执行成功，这是通过顺序来走的，但是放在appconfig还是会报错，要留意生成bean的顺序
```

#### @ConditionalOnClass

```java
@Configuration
public class AppConfig {

    @Bean
    @ConditionalOnClass(value = UserService.class)
    public OrderService orderService(){
        return new OrderService();
    }
}
```

#### @ConitionalMissClass

```java
@Configuration
public class AppConfig {

    @Bean
    @ConditionalOnMissingClass(value = "com.chen.service.UserService")
    public OrderService orderService(){
        return new OrderService();
    }
}
```

#### @ConditionalOnExpression

```java
@Configuration
public class AppConfig {
    @Bean
    @ConditionalOnExpression(value = "${test.condition} == true")
    public OrderService orderService(){
        return new OrderService();
    }
}
```

#### @ConditionalOnJAVA

```java
@Configuration
public class AppConfig {
    @Bean
    @ConditionalOnJava(value = JavaVersion.SEVENTEEN)
    public OrderService orderService(){
        return new OrderService();
    }
}
```

