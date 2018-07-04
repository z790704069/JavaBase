* 字符串内存

> 两个（或多个） String 对象的字符串值相同时，这些对象其实指向同一块内存。也就是说创建一个 String 对象，如果该对象的字符串值已经在另一个对象中出现，则不会创建一个对象，而是引用已存在的对象。在这种前提下，如果 String 可变，则会出现一些复杂的情况：一个对象的改变会影响另外一个对象。

```
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("bcd");
        String s4 = new String("bcd");
        System.out.println(s1 == s2);
        System.out.println(s3 == s4);

//        输出如下：
//        true
//        false
//        可以看出：相同字符串的 String 对象指向同一块内存（字符串常量区）
//        通过new出来的 String 分配在堆中，属于两个不同的对象，因此 s3 和 s4 的地址不同
```

* StringBuilder & StringBuffer

> StringBuffer 是线程安全的，StringBuilder 非线程安全

