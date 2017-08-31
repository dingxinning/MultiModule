package com.wx.kmeans;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wuxiang on 2017/4/30.
 */
public class KMeansCluster {
    // 分类数
    private int NUM_CLUSTERS;
    // 节点数
    private int NUM_POINTS;
    //偏差
    private int MIN_COORDINATE;
    private int MAX_COORDINATE;
    //最大迭代次数
    private static final int MAX_ITERATION = 100;

    // 节点列表
    private List<Point> points;
    // 中心点列表
    private List<Cluster> clusters;

    public KMeansCluster(int NUM_CLUSTERS, int NUM_POINTS, int MIN_COORDINATE, int MAX_COORDINATE) {
        this.NUM_CLUSTERS = NUM_CLUSTERS;
        this.NUM_POINTS = NUM_POINTS;
        this.MIN_COORDINATE = MIN_COORDINATE;
        this.MAX_COORDINATE = MAX_COORDINATE;
        this.points = new ArrayList();
        this.clusters = new ArrayList();
    }

    //初始化
    public void init() {
        System.out.println("---初始化点 start---");
        points = Point.createRandomPoints(MIN_COORDINATE, MAX_COORDINATE, NUM_POINTS);
//        points.forEach(point -> System.out.println(point.toString()));
        System.out.println("---初始化点 end---");

        System.out.println("---初始化中心点 start---");
        for (int i = 0; i < NUM_CLUSTERS; i++) {
            Cluster cluster = new Cluster(i);
            Point centroid = Point.createRandomPoint(MIN_COORDINATE,MAX_COORDINATE);
            cluster.setCentroid(centroid);
            clusters.add(cluster);
        }
//        plotClusters();
        System.out.println("---初始化中心点 end---");
    }

    //使用迭代法计算 K-means 的过程
    public void calculate() {
        boolean finish = false;
        int iteration = 0;

        System.out.println("---迭代计算 start---");
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
//            System.out.println("\n迭代次数: " + iteration);
//            System.out.println("所有中心点经过一次迭代后，累计移动的距离: " + distance);
//            plotClusters();

            if (distance == 0 || iteration > MAX_ITERATION) {
                finish = true;
            }
        }
        System.out.println("---迭代计算 end---");
//        plotClusters();

    }

    private void clearClusters() {
        for(Cluster cluster : clusters) {
            cluster.clear();
        }
    }

    private void plotClusters() {
        for (int i = 0; i < NUM_CLUSTERS; i++) {
            Cluster c = clusters.get(i);
            c.plotCluster();
        }
    }

    public List<Cluster> getClusters() {
        return clusters;
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
        double min ;
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
                int newX = (int)sumX / n_points;
                int newY = (int)sumY / n_points;
                centroid.setX(newX);
                centroid.setY(newY);
            }
        }
    }

    public void printInfo() {
        System.out.println("=========================");
        System.out.println("节点数："+points.size());
        System.out.println("中心点数"+clusters.size());
        for (int i = 0; i < clusters.size(); i++) {
            Cluster cluster = clusters.get(i);
            System.out.println(i+" "+cluster.getCentroid().toString()+" "+cluster.getPoints().size());
        }
        System.out.println("=========================");
    }

    public void deleteClusterAndPointsById(int id) {
        for (int i = 0, len = points.size(); i < len; i++) {
            if (points.get(i).getCluster() == id) {
                points.remove(i);
                len--; // 总长度减少1
                NUM_POINTS--;
                i--;
            }
        }
        clusters.get(id).clear();
    }

    public void reassignCenterPoint() {
        for (int i = 0, len = clusters.size(); i < len; i++) {
            clusters.remove(i);
            len--;
            i--;
        }
        for (int i = 0; i < NUM_CLUSTERS; i++) {
            Cluster cluster = new Cluster(i);
            Point centroid = Point.createRandomPoint(MIN_COORDINATE,MAX_COORDINATE);
            cluster.setCentroid(centroid);
            clusters.add(cluster);
        }
    }

    public void changeK(int newK) {
        NUM_CLUSTERS = newK;
    }
}
