package org.hf520.netctoss.dao;

import org.hf520.netctoss.annotation.MyBatis;
import org.hf520.netctoss.entity.Account;
import org.hf520.netctoss.entity.AccountPage;

import java.util.List;

/**
 * Created by kevin on 2015/1/9.
 */
@MyBatis
public interface AccountMapperDao {
        public List<Account> findByCondition(AccountPage page);
}
