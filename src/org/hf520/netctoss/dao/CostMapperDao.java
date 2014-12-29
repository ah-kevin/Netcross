package org.hf520.netctoss.dao;

import org.hf520.netctoss.annotation.MyBatis;
import org.hf520.netctoss.entity.Cost;

import java.util.List;

/**
 * Created by kevin on 2014/12/29.
 */
@MyBatis
public interface CostMapperDao {
    public List<Cost> findAll();
}
