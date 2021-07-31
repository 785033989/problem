package com.huihui.spring.test;

import autowire.Emp;
import com.huihui.spring.Book;
import com.huihui.spring.Order;
import com.huihui.spring.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhazhahui
 * @create 2021-07-22 15:31
 */
public class testSpring5 {
    @Test
    public void testAdd() {
        //1.加载spring的配置文件
        BeanFactory context = new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置创建的对象
        User user = context.getBean("user", User.class);
        user.add();
    }

    @Test
    public void testBook1() {
        //1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置创建的对象
        Book book = context.getBean("book", Book.class);

        book.test();
    }

    @Test
    public void testBook2() {
        //1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        //2.获取配置创建的对象
        Order order = context.getBean("order", Order.class);
        System.out.println("4.创建对象");

        //手动销毁
        ((ClassPathXmlApplicationContext) context).close();
    }

    @Test
    public void testBook3() {
        //1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        //2.获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);

        //手动销毁
    }
}
