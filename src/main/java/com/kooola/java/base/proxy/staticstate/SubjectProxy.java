package com.kooola.java.base.proxy.staticstate;

/**
 * Created by march on 2018/7/6.
 */
public class SubjectProxy implements Subject {
    Subject subjectImp = new RealSubject();
    public void doSomething() {
        subjectImp.doSomething();
    }
}
