package com.huihui.spring;

/**
 * @author zhazhahui
 * @create 2021-07-24 10:11
 */
public class UserDaoImpl implements UserDao {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public String update(String id) {
        return id;
    }
}
