package com.kooola.java.base.annotation;

import java.lang.reflect.Method;

/**
 * Created by march on 2018/7/9.
 */
public class TestTool {
    public static void main(String[] args){
        NoBug noBug = new NoBug();

        Class clazz = noBug.getClass();

        Method[] methods = clazz.getDeclaredMethods();

        StringBuilder log = new StringBuilder();

        int errornum = 0;

        for( Method m : methods ){
            if( m.isAnnotationPresent(Jiecha.class) ){
                try{
                    m.setAccessible(true);
                    m.invoke(noBug, null);
                }catch (Exception e){
                    errornum++;
                    log.append(m.getName());
                    log.append(" ");
                    log.append("has error: ");
                    log.append("\n\r caused by ");
                    log.append(e.getCause().getClass().getSimpleName());
                    log.append("\n\r");
                    log.append(e.getCause().getMessage());
                    log.append("\n\r");
                }
            }
        }
        log.append(clazz.getSimpleName());
        log.append(" has ");
        log.append(errornum);
        log.append("error.");

        System.out.println(log.toString());
    }
}
