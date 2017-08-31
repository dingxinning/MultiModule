package com.wx.kmeans;

import junit.framework.TestCase;

/**
 * Created by Wuxiang on 2017/5/24.
 */
public class KMeansTest extends TestCase {
    public void testCalculate() throws Exception {
        KMeansCluster kmeans = new KMeansCluster(5,40,0,10);
        kmeans.init();
        kmeans.calculate();
        kmeans.printInfo();

        //删除第一个集群
        kmeans.deleteClusterAndPointsById(0);
        kmeans.printInfo();

        // 更改集群 K
        kmeans.changeK(4);
        // 重新划分中心点
        kmeans.reassignCenterPoint();
        kmeans.calculate();
        kmeans.printInfo();
    }

}