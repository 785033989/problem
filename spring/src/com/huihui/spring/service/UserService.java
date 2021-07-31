package com.huihui.spring.service;


import com.huihui.spring.dao.UserDao;
import com.huihui.spring.dao.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhazhahui
 * @create 2021-07-23 17:02
 */
@Service
public class UserService {
    //@Autowired
    //@Qualifier(value = "userDaoImpl1")

    @Resource
    private UserDao userDao;

    public void test() {
        userDao.add();
        System.out.println("测试service");
    }
}
