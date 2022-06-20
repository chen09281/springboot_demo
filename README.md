# 学习springboot
这可比spring好用太多了，基本上bean都能够自动配置。
## Bean配置
### 基本项
| 函数名                       | 作用                           | 参数 |
|---------------------------|------------------------------|--|
| @ConditionalOnMissingBean | 判断bean是否存在该类里，若存在就执行，不存在返回错误 | 对应bean的名称 |
### 使用案例

```java
import com.chen.service.UserService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;

@Configuration
public class AppConfig {
    @Bean
    @ConditionalOnBean(value = UserService.class)
    public OrderService orderService(){
        return new OrderService();
    }
}
```
