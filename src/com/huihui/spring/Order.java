package com.huihui.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author zhazhahui
 * @create 2021-07-23 15:13
 */
public class Order implements BeanPostProcessor {
    private String name;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("1.9初始化之前");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("2.1初始化之后");
        return bean;
    }

    public void setName(String name) {
        System.out.println("2.调用set方法");
        this.name = name;
    }

    public Order() {
        System.out.println("1.执行了无参构造器");
    }
    public void initMethod(){
        System.out.println("3.执行了初始化方法");
    }

    public void destroyMethod(){
        System.out.println("5.执行了销毁方法");
    }
}
