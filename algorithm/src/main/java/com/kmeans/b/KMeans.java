package com.kmeans.b;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wuxiang on 2017/4/30.
 */
public class KMeans {
    // 分类数
    private int NUM_CLUSTERS = 3;
    // 节点数
    private int NUM_POINTS = 15;
    //偏差
    private static final int MIN_COORDINATE = 0;
    private static final int MAX_COORDINATE = 10;

    private List<Point> points;
    private List<Cluster> clusters;

    public KMeans() {
        this.points = new ArrayList();
        this.clusters = new ArrayList();
    }

    //初始化
    public void init() {
        System.out.println("---初始化点 start---");
        points = Point.createRandomPoints(MIN_COORDINATE, MAX_COORDINATE, NUM_POINTS);
        points.forEach(point -> System.out.println(point.toString()));
        System.out.println("---初始化点 end---");

        System.out.println("---初始化中心点 start---");
        for (int i = 0; i < NUM_CLUSTERS; i++) {
            Cluster cluster = new Cluster(i);
            Point centroid = Point.createRandomPoint(MIN_COORDINATE,MAX_COORDINATE);
            cluster.setCentroid(centroid);
            clusters.add(cluster);
        }
        plotClusters();
        System.out.println("---初始化中心点 end---");
    }

    private void plotClusters() {
        for (int i = 0; i < NUM_CLUSTERS; i++) {
            Cluster c = clusters.get(i);
            c.plotCluster();
        }
    }

    //使用迭代法计算 K-means 的过程
    public void calculate() {
        boolean finish = false;
        int iteration = 0;

        // 添加新数据，一次一个，每个新的数据重新计算质心。
        while(!finish) {
            // 清除分类下含有的点，重新划分
            clearClusters();

            // 保存旧的中心点
            List<Point> lastCentroids = getCentroids();
            iteration++;

            //计算各个点与中心点的距离，以此分类
            assignCluster();

            //重新分配中心点
            calculateCentroids();

            // 计算新的中心点
            List<Point> currentCentroids = getCentroids();

            //计算新旧质心之间的总距离
            double distance = 0;
            for(int i = 0; i < lastCentroids.size(); i++) {
                distance += Point.distance(lastCentroids.get(i), currentCentroids.get(i));
            }
            System.out.println("\n#################");
            System.out.println("迭代次数: " + iteration);
            System.out.println("所有中心点经过一次迭代后，累计移动的距离: " + distance);
            plotClusters();

            if(distance == 0) {
                finish = true;
            }
        }
    }

    private void clearClusters() {
        for(Cluster cluster : clusters) {
            cluster.clear();
        }
    }

    private List<Point> getCentroids() {
        List<Point> centroids = new ArrayList(NUM_CLUSTERS);
        for(Cluster cluster : clusters) {
            Point aux = cluster.getCentroid();
            Point point = new Point(aux.getX(),aux.getY());
            centroids.add(point);
        }
        return centroids;
    }

    private void assignCluster() {
        double max = Double.MAX_VALUE;
        double min = max;
        int cluster = 0;
        double distance = 0.0;

        for(Point point : points) {
            min = max;
            for(int i = 0; i < NUM_CLUSTERS; i++) {
                Cluster c = clusters.get(i);
                // 计算 各点与中心点的距离
                distance = Point.distance(point, c.getCentroid());
                if(distance < min){
                    min = distance;
                    cluster = i;
                }
            }
            point.setCluster(cluster);
            clusters.get(cluster).addPoint(point);
        }
    }

    private void calculateCentroids() {
        for(Cluster cluster : clusters) {
            double sumX = 0;
            double sumY = 0;
            List<Point> list = cluster.getPoints();
            int n_points = list.size();

            for(Point point : list) {
                sumX += point.getX();
                sumY += point.getY();
            }

            Point centroid = cluster.getCentroid();
            if(n_points > 0) {
                double newX = sumX / n_points;
                double newY = sumY / n_points;
                centroid.setX(newX);
                centroid.setY(newY);
            }
        }
    }
}
