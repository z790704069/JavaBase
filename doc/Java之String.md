

# 字符串内存

> 两个（或多个） String 对象的字符串值相同时，这些对象其实指向同一块内存。也就是说创建一个 String 对象，如果该对象的字符串值已经在另一个对象中出现，则不会创建一个对象，而是引用已存在的对象。在这种前提下，如果 String 可变，则会出现一些复杂的情况：一个对象的改变会影响另外一个对象。

```
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("bcd");
        String s4 = new String("bcd");
        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
        Systen.out.println(s3.equals(s4));
```
上述代码输出如下：
```
true
false
true
```

> "==" 判断对象内存地址是否一致；
> equals判断两个字符串对象的字面值是否相同；
> 直接复制的字符串分配到字符串常量区，相同字符串对象公用地址；
> 通过new出来的对象，虽然字面值相同，但仍然不属于同一对象，地址自然不同；
> String类的hashCode()方法不能用来判断字符串的地址，String的hashCode（）方法重写Object的。

看一看String的hashCode()方法，就知道跟内存没半点关系：
```
// * s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]

public int hashCode() {
  int h = hash;
  if (h == 0 && value.length > 0) {
    char val[] = value;

    for (int i = 0; i < value.length; i++) {
      h = 31 * h + val[i];
    }
    hash = h;
  }
  return h;
}
```





# StringBuilder & StringBuffer

> StringBuffer 是线程安全的，StringBuilder 非线程安全

StringBuffer append源码：
```
@Override
public synchronized StringBuffer append(String str) {
    toStringCache = null;
    super.append(str);
    return this;
}
```

StringBuilder append源码：
```
@Override
    public StringBuilder append(String str) {
        super.append(str);
        return this;
    }
```
可以看出StringBuffer使用了synchronized来修饰方法，所以是线程安全的


