package com.spring.hibernate.service;

import com.spring.hibernate.dao.StockDao;
import com.spring.hibernate.entity.Stock;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Wuxiang on 2017/4/6.
 */
@Transactional
public class StockService {

    StockDao stockDao;

    public void setStockDao(StockDao stockDao) {
        this.stockDao = stockDao;
    }

    public void save(Stock stock){
        stockDao.save(stock);
    }

    public void update(Stock stock){
        stockDao.update(stock);
    }

    public void delete(Stock stock){
        stockDao.delete(stock);
    }

    public Stock findByStockCode(String stockCode){
        return stockDao.findByStockCode(stockCode);
    }
}
