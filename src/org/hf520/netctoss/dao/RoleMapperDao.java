package org.hf520.netctoss.dao;

import org.hf520.netctoss.annotation.MyBatis;
import org.hf520.netctoss.entity.Role;

import java.util.List;

/**
 * Created by kevin on 2015/1/6.
 */
@MyBatis
public interface RoleMapperDao {
    public List<Role> findAll();
}
