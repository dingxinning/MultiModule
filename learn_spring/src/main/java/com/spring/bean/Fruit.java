package com.spring.bean;

/**
 * Created by Administrator on 2016/12/16.
 */
public class Fruit {
    private int id;
    private String name;
    private int profit;
    private int losses;
    private int year;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", profit=" + profit +
                ", losses=" + losses +
                ", year=" + year +
                '}';
    }
}
