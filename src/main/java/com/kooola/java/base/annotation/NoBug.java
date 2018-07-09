package com.kooola.java.base.annotation;

/**
 * Created by march on 2018/7/9.
 */
public class NoBug {
    @Jiecha
    public void suanShu(){
        System.out.println("1234567890");
    }

    @Jiecha
    public void jiafa(){
        System.out.println("1 + 1=" + 1 + 1);
    }

    @Jiecha
    public void jiefa(){
        System.out.println("1 - 1=" + (1 - 1));
    }

    @Jiecha
    public void chengfa(){
        System.out.println("3 * 5=" + 3 * 5);
    }

    @Jiecha
    public void chufa(){
        System.out.println("6 / 0=" + 6 / 0);
    }

    public void introduce(){
        System.out.println("i have no bug");
    }
}
