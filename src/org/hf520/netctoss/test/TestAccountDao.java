package org.hf520.netctoss.test;

import org.hf520.netctoss.dao.AccountMapperDao;
import org.hf520.netctoss.entity.Account;
import org.hf520.netctoss.entity.AccountPage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by kevin on 2015/1/9.
 */
public class TestAccountDao {
    public static void main(String[] args) {
        String conf = "org/hf520/netctoss/config/applicationContext.xml";
        ApplicationContext ac =new ClassPathXmlApplicationContext(conf);
        AccountMapperDao dao=ac.getBean("accountMapperDao", AccountMapperDao.class);
        AccountPage page =new AccountPage();
        page.setStatus("-1");
        List<Account> list =dao.findByCondition(page);
            for (Account a :list) {
                System.out.println(a.getId()+" "+a.getLogin_name()+" "+a.getReal_name());
            }
    }}
