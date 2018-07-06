package com.kooola.java.base.proxy.staticstate;

/**
 * Created by march on 2018/7/6.
 */
public class TestProxy {
    public static void main(String[] args){
        Subject sub = new SubjectProxy();
        sub.doSomething();
    }
}

