package com.creativemind.bo;

import com.creativemind.model.Stock;

/**
 * Created by brai on 6/6/17.
 */
public interface StockBo {
    void save(Stock stock);
    void update(Stock stock);
    void delete(Stock stock);
    Stock findByStockCode(String stockCode);
}
