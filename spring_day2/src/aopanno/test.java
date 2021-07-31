package aopanno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhazhahui
 * @create 2021-07-24 14:22
 */
public class test {
    @Test

    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        User user = context.getBean("user", User.class);

        user.print();
    }

}
