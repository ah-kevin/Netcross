package org.hf520.netctoss.dao;

import org.hf520.netctoss.annotation.MyBatis;
import org.hf520.netctoss.entity.Cost;
import org.hf520.netctoss.entity.Page;

import java.util.List;

/**
 * Created by kevin on 2014/12/29.
 */
@MyBatis
public interface CostMapperDao {
    public List<Cost> findAll();
    public void deleteCost(int id);
    public void saveCost(Cost cost);
    public Cost findById(int id);
    public void updateCost(Cost cost);
    public List<Cost> findPage(Page page);
    public int findRows();
    public Cost findByname(String name);
}
