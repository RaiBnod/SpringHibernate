package com.creativemind.dao.impl;

import com.creativemind.dao.StockDao;
import com.creativemind.model.Stock;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by brai on 6/6/17.
 */
public class StockDaoImpl extends HibernateDaoSupport implements StockDao {
    public void save(Stock stock) {
        getHibernateTemplate().save(stock);
    }

    public void update(Stock stock) {
        getHibernateTemplate().update(stock);
    }

    public void delete(Stock stock) {
        getHibernateTemplate().delete(stock);
    }

    public Stock findByStockCode(String stockCode) {
        List list = getHibernateTemplate().find("from stock where StockCode=?", stockCode);
        return (Stock) list.get(0);
    }
}
