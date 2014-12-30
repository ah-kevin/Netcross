package org.hf520.netctoss.dao;

import org.hf520.netctoss.annotation.MyBatis;
import org.hf520.netctoss.entity.AdminInfo;

/**
 * Created by kevin on 2014/12/30.
 */
@MyBatis
public interface AdminInfoMapperDao {
public AdminInfo findByAdminCodeAndPwd(AdminInfo adminInfo);
}
