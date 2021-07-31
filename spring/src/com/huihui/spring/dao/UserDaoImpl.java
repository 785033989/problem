package com.huihui.spring.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author zhazhahui
 * @create 2021-07-23 18:32
 */
@Repository(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("UserDao add");
    }
}
