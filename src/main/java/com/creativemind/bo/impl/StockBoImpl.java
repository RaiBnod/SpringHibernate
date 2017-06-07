package com.creativemind.bo.impl;

import com.creativemind.bo.StockBo;
import com.creativemind.dao.StockDao;
import com.creativemind.model.Stock;

/**
 * Created by brai on 6/6/17.
 */
public class StockBoImpl implements StockBo {
    StockDao stockDao;

    public void setStockDao(StockDao stockDao) {
        this.stockDao = stockDao;
    }

    public void save(Stock stock) {
        stockDao.save(stock);
    }

    public void update(Stock stock) {
        stockDao.update(stock);
    }

    public void delete(Stock stock) {
        stockDao.delete(stock);
    }

    public Stock findByStockCode(String stockCode) {
        return stockDao.findByStockCode(stockCode);
    }
}
