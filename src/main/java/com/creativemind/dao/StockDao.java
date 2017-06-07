package com.creativemind.dao;

import com.creativemind.model.Stock;

/**
 * Created by brai on 6/6/17.
 */
public interface StockDao {
    void save(Stock stock);
    void update(Stock stock);
    void delete(Stock stock);
    Stock findByStockCode(String stockCode);
}
