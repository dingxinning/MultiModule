package com.wx.tsp;

import com.wx.kmeans.Point;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Wuxiang on 2017/5/24.
 */
public class TSPSATest extends TestCase {
    public void testEvaluate() throws Exception {
        int number=10;
        int min = 0;
        int max = 100;
        System.out.println("Start....");

        TSPSA sa = new TSPSA(number, number, 400, 250.0f, 0.98f);
        List<Point> points=new ArrayList<>();
        for(int i = 0; i < number; i++) {
            points.add(createRandomPoint(min, max));
        }
        sa.init(points);
        sa.solve();
    }

    private static Point createRandomPoint(int min, int max) {
        Random r = new Random();
        int x = min + Math.abs(r.nextInt()) % max;
        int y = min + Math.abs(r.nextInt()) % max;
        return new Point(x,y);
    }

}