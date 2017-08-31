package com.kmeans.b;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wuxiang on 2017/4/30.
 */
public class Cluster {
    public List<Point> points;
    public Point centroid;
    public int id;

    //Creates a new Cluster
    public Cluster(int id) {
        this.id = id;
        this.points = new ArrayList();
        this.centroid = null;
    }

    public List getPoints() {
        return points;
    }
    public void addPoint(Point point) {
        points.add(point);
    }

    public void setPoints(List points) {
        this.points = points;
    }

    public Point getCentroid() {
        return centroid;
    }

    public void setCentroid(Point centroid) {
        this.centroid = centroid;
    }

    public int getId() {
        return id;
    }

    public void clear() {
        points.clear();
    }

    public void plotCluster() {
        System.out.println("[类别: " + id+"]");
        System.out.println("[中心点: " + centroid + "]");
        System.out.println("[所属点: ");
        this.points.forEach(point -> System.out.println(point.toString()));
        System.out.println("]");
    }
}
