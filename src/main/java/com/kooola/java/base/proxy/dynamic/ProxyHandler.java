package com.kooola.java.base.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by march on 2018/7/6.
 */
public class ProxyHandler implements InvocationHandler {

    private Object object;

    //绑定委托对象，并返回代理类
    public Object bind(Object object){
        this.object = object;
        //绑定该类实现的所有接口，取得代理类
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),
                object.getClass().getInterfaces(), this);
    }



    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(object, args);
    }
}
