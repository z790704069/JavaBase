package com.kooola.java.base.annotation;

/**
 * Created by march on 2018/7/9.
 */

@TestAnnotation(id = 1, msg = "annotation")
public class Test {
    public static void main(String[] args){
        boolean hasAnnotation = Test.class.isAnnotationPresent(TestAnnotation.class);

        if( hasAnnotation ){
            TestAnnotation testAnnotation = Test.class.getAnnotation(TestAnnotation.class);

            System.out.println("id:" + testAnnotation.id());
            System.out.println("msg:" + testAnnotation.msg());
        }
    }
}
