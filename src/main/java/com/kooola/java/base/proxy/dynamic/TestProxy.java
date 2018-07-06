package com.kooola.java.base.proxy.dynamic;


/**
 * Created by march on 2018/7/6.
 */
public class TestProxy {
    public static void main(String[] args){
        ProxyHandler proxyHandler = new ProxyHandler();

        //绑定该类实现的所有接口
        Subject sub = (Subject)proxyHandler.bind(new SubjectDemo());

        sub.doSomething();

        sub = (Subject)proxyHandler.bind(new Subject() {
            public void doSomething() {
                System.out.println("hello proxy");
            }
        });

        sub.doSomething();
    }
}
