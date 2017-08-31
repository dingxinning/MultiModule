package com.spring.hibernate.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Wuxiang on 2017/4/6.
 */
@Entity
@Table(name = "stock")
public class Stock implements Serializable {

    @Id
    @Column(name = "STOCK_ID",nullable = false,unique = true)
    @GenericGenerator(name = "generator",strategy = "uuid")
    @GeneratedValue(generator = "generator")
    private String stockId;

    @Column(name = "STOCK_CODE",nullable = false,unique = true)
    private String stockCode;

    @Column(name = "STOCK_NAME",nullable = false,unique = true)
    private String stockName;

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stockId=" + stockId +
                ", stockCode='" + stockCode + '\'' +
                ", stockName='" + stockName + '\'' +
                '}';
    }
}
