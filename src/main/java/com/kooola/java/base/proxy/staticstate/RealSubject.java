package com.kooola.java.base.proxy.staticstate;


/**
 * Created by march on 2018/7/6.
 */
public class RealSubject implements Subject {

    public void doSomething() {
        System.out.println("call RealSubject doSomething");
    }
}
