package com.huihui.spring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author zhazhahui
 * @create 2021-07-24 10:13
 */
public class JDKProxy {
    public static void main(String[] args) {

        //创建接口实现类代理对象
        Class[] interfaecs = {UserDao.class};
        UserDaoProxy userDaoProxy = new UserDaoProxy(new UserDaoImpl());
        UserDao o =(UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaecs, userDaoProxy);
        int add = o.add(1, 2);
        System.out.println(add);
    }

}

//
class UserDaoProxy implements InvocationHandler{
    private Object obj;
    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法之前执行" + method.getName() + "参数" + Arrays.toString(args));

        Object invoke = method.invoke(obj, args);

        System.out.println("方法之后执行");


        return invoke;
    }
}
