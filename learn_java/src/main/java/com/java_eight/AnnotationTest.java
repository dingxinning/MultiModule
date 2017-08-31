package com.java_eight;

import java.lang.annotation.Repeatable;

/**
 * Created by yxrsw on 2017/2/14.
 * java 8 新特性
 * 十、Annotation 注解
 * java8支持多重注解了
 */
@interface Hints {
    Hint[] value();
}

@Repeatable(Hints.class)
@interface Hint {
    String value();
}

//使用包装类当容器来存多个注解
@Hints({@Hint("hint1"), @Hint("hint2")})
class Person1 {

}

public class AnnotationTest {
    public static void main(String[] args) {
        Hint hint = Person1.class.getAnnotation(Hint.class);
        System.out.println(hint);                   // null

        //一直报空指针异常！！！！！！！！！！！！
        Hints hints1 = Person1.class.getAnnotation(Hints.class);
        System.out.println(hints1.value().length);  // 2

        Hint[] hints2 = Person1.class.getAnnotationsByType(Hint.class);
        System.out.println(hints2.length);          // 2

    }
}
