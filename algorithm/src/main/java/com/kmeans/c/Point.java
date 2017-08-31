package com.kmeans.c;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Wuxiang on 2017/4/30.
 */
public class Point {
    private int x = 0;
    private int y = 0;
    private int cluster_number = 0;

    public Point(int x, int y)
    {
        this.setX(x);
        this.setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setCluster(int n) {
        this.cluster_number = n;
    }

    public int getCluster() {
        return this.cluster_number;
    }

    //计算两点之间的距离
    public static double distance(Point p, Point centroid) {
        return Math.sqrt(
                Math.pow((centroid.getY() - p.getY()), 2)
                + Math.pow((centroid.getX() - p.getX()), 2));
    }

    //Creates random point
    protected static Point createRandomPoint(int min, int max) {
        Random r = new Random();
        int x = min + Math.abs(r.nextInt()) % max;
        int y = min + Math.abs(r.nextInt()) % max;
        return new Point(x,y);
    }

    protected static List createRandomPoints(int min, int max, int number) {
        List points = new ArrayList(number);
        for(int i = 0; i < number; i++) {
            points.add(createRandomPoint(min,max));
        }
        return points;
    }

    public String toString() {
        return "("+x+","+y+")";
    }
}
