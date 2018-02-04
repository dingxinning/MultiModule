package com.multi.project.chapter16;

/**
 * Created by Wuxiang on 2018/1/28
 */
public class BerylliumSphere {
    private static long counter;
    private final long id = counter++;
    public String toString() { return "Sphere " + id; }
}
