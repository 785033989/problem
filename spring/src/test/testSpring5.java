package test;

import com.huihui.spring.service.UserService;
import config.SpringConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhazhahui
 * @create 2021-07-22 15:31
 */
public class testSpring5 {
    @Test
    public void testService() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean6.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.test();
    }

    @Test
    public void testService2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.test();
    }
}
