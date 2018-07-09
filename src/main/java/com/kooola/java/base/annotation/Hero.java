package com.kooola.java.base.annotation;


/**
 * Created by march on 2018/7/8.
 */
public class Hero {
    @Deprecated
    public void say(){
        System.out.println("I am a hero");
    }

    public void speak(){
        System.out.println("speak");
    }

    public static void main(String[] args){
        Hero hero = new Hero();
        hero.speak();
        hero.say();
    }
}
