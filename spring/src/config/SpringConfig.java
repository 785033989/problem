package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhazhahui
 * @create 2021-07-23 18:55
 */
@Configuration//作为配置类，替代配置文件
@ComponentScan(basePackages = "com.huihui")
public class SpringConfig {

}
