package com.wx;

import com.wx.kmeans.Cluster;
import com.wx.kmeans.KMeansCluster;
import com.wx.kmeans.Point;
import com.wx.tsp.TSPSA;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wuxiang on 2017/5/18.
 */
public class OnlineHeuristicCharge {
    public static void main(String[] args) {
        final int min = 0;
        final int max = 500;  //监测区域 （小规模100 大规模500）
        final int C = 2;  // 为MC充电时间 C 单位：s
        final int S = 8;  //MC移动速度  S 单位： m/s
        final double T = 2000; //时间约束 T    （小规模200 大规模2000）
        final double L = 40000; //距离约束 L

        int K = 13;  //初始分类数量 K  （小规模K=5  大规模K=13）
        int Vc = 900;   // 初始 Vc 个传感器请求

        double t = 0;
        double l = 0;
        Point v0 = new Point(0, 0);  //基站
        Point va = new Point(0, 0);  // 当前节点
        List<Integer> P = new ArrayList<>();  //路径
        P.add(0);

        KMeansCluster kMeans = new KMeansCluster(K, Vc, min, max);
        kMeans.init();
        while (true) {
            //重置中心点
            kMeans.reassignCenterPoint();

            kMeans.calculate();
            kMeans.printInfo();

            // 所有的集群
            List<Cluster> clusters = kMeans.getClusters();

            if (K == Vc) {
                // 返回基站 时间加上 当前节点到基站的行进时间
                t += Point.distance(va, v0) / S;
                l += Point.distance(va, v0);
                System.out.println("\n---MC返回基站---\n");
                break;
            }

            int maxGain = choseBestCluster(clusters, va, v0, C);


            // 找不到可行的集群，即找到的具有最大增益的集群为空（个人理解），更新 K
            if (clusters.get(maxGain).getPoints().size() <=1) {
                K = Math.min(K * 2, Vc);
                kMeans.changeK(K);
                System.out.println("\n---更改K值，重新迭代---\n");
                continue;
            }

            List<Point> points = clusters.get(maxGain).getPoints();
            System.out.println("选择第" + maxGain + "个集群进行充电，该集群具有"+points.size()+"个节点。");


            //使用TSP问题的模拟退火算法，找最短路径
            TSPSA tspsa = new TSPSA(points.size(), points.size(), 400, 250.0f, 0.98f);
            try {
                tspsa.init(points);
            } catch (IOException e) {
                e.printStackTrace();
            }
            tspsa.solve();
            int[] tours = tspsa.getBestTour();
            int tourLength = tspsa.getBestLength();


            int firstIndex = tours[0];
            int lastIndex = tours[tours.length - 1];

            // 计算要在下一个集群花费的时间和距离
            double gapTime = Point.distance(va, points.get(firstIndex)) / S + tourLength / S + points.size() * C;
            double gapLength = Point.distance(va, points.get(firstIndex)) + tourLength;
            double returnBSLength = Point.distance(points.get(lastIndex), v0);
            //更新当前时间 t = 从当前节点到集群起点的行进时间 + MC充电时间 + MC在集群中行进时间
            t += gapTime;
            l += gapLength;

            if (t + returnBSLength / S > T || l + returnBSLength > L) {
                t = t - gapTime + Point.distance(va, v0) / S;
                l = l - gapLength + Point.distance(va, v0);
                System.out.println("\n约束下，提前返回基站");
                break;
            }

            System.out.println("\n=========对节点进行充电===========\n");

            //更新路径 P
            int existTourSize = P.size();
            for (int i = 0; i < tours.length; i++) {
                P.add(tours[i] + existTourSize);
            }

            //更新当前节点
            va.setX(points.get(lastIndex).getX());
            va.setY(points.get(lastIndex).getY());
            System.out.println("当前节点："+(lastIndex)+" "+va.toString());
            System.out.println(" 当前时间：" + t + ",  当前路程：" + l);

            // 更新传感器集合 Vc
            Vc -= points.size();
            kMeans.deleteClusterAndPointsById(maxGain);
            System.out.println("剩余传感器集合个数："+Vc+"\n");

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

    private static int choseBestCluster(List<Cluster> clusters, Point va, Point v0,int C) {
        if (clusters.size() == 1) {
            return 0;
        }
        List<Point> points = clusters.get(0).getPoints();
        Point centro = clusters.get(0).getCentroid();
        double maxGain = calculateGain(points, centro, va, v0, C);
        int maxIndex = 0;
        for (int i = 1; i < clusters.size(); i++) {
            points = clusters.get(i).getPoints();
            centro = clusters.get(i).getCentroid();
            double tempGain = calculateGain(points, centro, va, v0, C);
            if ( tempGain> maxGain) {
                maxGain = tempGain;
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private static double calculateGain(List<Point> points, Point centor, Point va, Point v0, int C) {
        if (points.size() == 0) {
            return 0;
        }
        return points.size() / (points.size() * C + Point.distance(centor, v0) - Point.distance(va, v0));
    }
}
