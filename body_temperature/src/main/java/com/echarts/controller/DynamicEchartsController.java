package com.echarts.controller;

import com.alibaba.fastjson.JSON;
import com.echarts.entity.EchartData;
import com.echarts.entity.Series;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by Wuxiang on 2017/7/6.
 * 基于Spring MVC的 ECharts 动态数据实时展示
 */
@Controller
@RequestMapping("/echarts")
public class DynamicEchartsController {


    @RequestMapping("/index")
    public String index(){
        return "dynamic_echarts";
    }

    //获取动态信息
    @RequestMapping(value="/getData",method = RequestMethod.POST,produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String getDynmicLineData() {
        List<String> legend = new ArrayList<>(Arrays.asList(new String[]{"最高气温", "最低气温"}));//数据分组
        List<String> category = new ArrayList<>(Arrays.asList(new String[]{"1", "2", "3", "4", "5", "6", "7"}));//横坐标
        List<Series> series = new ArrayList<>();//纵坐标

        Random random = new Random();
        int rand;
        List<Integer> tempLow = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            rand = Math.abs(random.nextInt() % 10);
            tempLow.add(rand);
        }
        List<Integer> tempHigh = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            rand = Math.abs(random.nextInt() % 10 + 20);
            tempHigh.add(rand);
        }
        series.add(new Series("最高气温", "line", tempLow));
        series.add(new Series("最低气温", "line", tempHigh));
        EchartData data=new EchartData(legend, category, series);
        return JSON.toJSONString(data);
    }
}
