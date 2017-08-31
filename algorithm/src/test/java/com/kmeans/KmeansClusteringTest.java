package com.kmeans;

import com.kmeans.a.KmeansClustering;
import com.kmeans.a.Point;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * Created by Wuxiang on 2017/4/30.
 */
public class KmeansClusteringTest {
    @Test
    public void kcluster() throws Exception {
        KmeansClustering kmeansClustering = new KmeansClustering();
        Map<Point, List<Point>> result = kmeansClustering.kcluster(3);
        for (Map.Entry<Point, List<Point>> entry : result.entrySet()) {
            System.out.println("===============聚簇中心为：" + entry.getKey() + "================");
            for (Point point : entry.getValue()) {
                System.out.println(point.getName());
            }
        }
    }

}