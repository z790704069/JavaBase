package com.kooola.java.base.string;

/**
 * Created by march on 2018/7/4.
 */
public class StringDemo {
    public static void main(String[] args){
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("bcd");
        String s4 = new String("bcd");
        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
//        输出如下：
//        true
//        false
//        可以看出：相同字符串的String对象指向同一块内存（字符串常量区）
//        通过new出来的String分配在堆中，属于两个不同的对象，因此s3和s4的地址不同

    }
}
