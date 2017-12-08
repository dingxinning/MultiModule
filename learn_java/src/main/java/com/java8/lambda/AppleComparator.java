package com.java8.lambda;

import java.util.Comparator;

/**
 * Created by Wuxiang on 2017/12/8.
 */
public class AppleComparator implements Comparator<Apple> {
    public int compare(Apple a1, Apple a2){
        return a1.getWeight().compareTo(a2.getWeight());
    }
}
