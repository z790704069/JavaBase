package com.kooola.java.base.ioc;

/**
 * Created by march on 2018/7/12.
 */
public class Engine {

    Engine(int type, String name){
        this.type = type;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    private int type;

    private String name;
}
