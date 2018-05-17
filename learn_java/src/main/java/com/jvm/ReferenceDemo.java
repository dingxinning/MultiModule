package com.jvm;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * Created by Wuxiang on 2018/5/17
 * <p>
 * 弱引用 VS 软引用
 *
 * GC一旦发现某块内存上只有弱引用，不管当前内存空间是否足够，那么都会回收这块内存
 * 如果一个对象只具有软引用，而当前虚拟机堆内存空间足够，那么垃圾回收器就不会回收它，反之就会回收这些软引用指向的对象
 */
public class ReferenceDemo {

    public static void main(String[] args) {

        // 强引用
        String str = new String("abc");

        // 软引用
        SoftReference<String> softReference = new SoftReference<>(str);

        // 去掉强引用
        str = null;

        // gc 回收
        System.gc();
        System.out.println(softReference.get());


        // 强引用
        String str123 = new String("123");

        // 弱引用
        WeakReference<String> weakReference = new WeakReference<>(str123);

        // 去掉强引用
        str123 = null;

        // gc 回收
        System.gc();
        System.out.println(weakReference.get());
    }
}
