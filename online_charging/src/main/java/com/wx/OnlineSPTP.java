package com.wx;

import com.wx.kmeans.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Wuxiang on 2017/5/27.
 */
public class OnlineSPTP {
    public static void main(String[] args) {
        final int min = 0;
        final int max = 500;  //监测区域 （小规模100 大规模500）
        final int C = 2;  // 为MC充电时间 C 单位：s
        final int S = 8;  //MC移动速度  S 单位： m/s
        final double T = 2000; //时间约束 T   （小规模200 大规模2000）
        final double L = 40000; //距离约束 L

        int Vc = 900;   // 初始 Vc 个传感器请求

        double t = 0;
        double l = 0;
        Point v0 = new Point(0, 0);  //基站
        Point va = new Point(0, 0);  // 当前节点
        List<Integer> P = new ArrayList<>();  //路径
        P.add(0);

        List<Point> points=new ArrayList<>();
        for(int i = 0; i < Vc; i++) {
            points.add(createRandomPoint(min, max));
        }
        List<Point> copyPoint = new ArrayList<>();
        for(int i = 0; i < Vc; i++) {
            copyPoint.add(new Point(points.get(i).getX(), points.get(i).getY()));
        }

        while (true) {
            int next = choseNextNode(va, points, C, S);
            if (next == -1) {
                t += Point.distance(va, v0) / S;
                l += Point.distance(va, v0);
                System.out.println("遍历所有节点，返回基站！");
                break;
            }

            double processTime = calculateProcessTime(va, points.get(next), C, S);
            double processLength = Point.distance(va, points.get(next));
            t += processTime;
            l += processLength;
            double returnBSLength = Point.distance(points.get(next), v0);

            if (t + returnBSLength / S > T || l + returnBSLength > L) {
                t = t - processTime + Point.distance(va, v0) / S;
                l = l - processLength + Point.distance(va, v0);
                System.out.println("\n约束下，提前返回基站");
                break;
            }

            va.setX(points.get(next).getX());
            va.setY(points.get(next).getY());

            for (int i = 0; i < copyPoint.size(); i++) {
                if (copyPoint.get(i).getX() == points.get(next).getX() &&
                        copyPoint.get(i).getY() == points.get(next).getY()) {
                    P.add(i);
                    break;
                }
            }
            points.remove(next);
            Vc--;
            System.out.println(" 当前时间：" + t + ",  当前路程：" + l);
        }

        P.add(0);
        System.out.println();
        System.out.println("总节点数："+(Vc+P.size()-2));
        System.out.println("已充电的节点数："+(P.size()-2));
        System.out.println("路径：");
        P.forEach(p-> System.out.print(p+"->"));
        System.out.println("\n总时间：" + t);
        System.out.println("总距离：" + l);

    }

    private static Point createRandomPoint(int min, int max) {
        Random r = new Random();
        int x = min + Math.abs(r.nextInt()) % max;
        int y = min + Math.abs(r.nextInt()) % max;
        return new Point(x,y);
    }

    private static int choseNextNode(Point va, List<Point> points, int C, int S) {
        if (points.size() == 0) {
            return -1;
        }
        if (points.size() == 1) {
            return 0;
        }
        double min = calculateProcessTime(va, points.get(0), C, S);
        int minIndex = 0;
        for (int i = 1; i < points.size(); i++) {
            if (min > calculateProcessTime(va, points.get(i), C, S)) {
                min = calculateProcessTime(va, points.get(i), C, S);
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static double calculateProcessTime(Point vi, Point vj, int C, int S) {
        Point v0 = new Point(0, 0);
        return Point.distance(vi, vj)/S
                + C
                + Point.distance(vj, v0)/S
                - Point.distance(vi, v0)/S;
    }

}
