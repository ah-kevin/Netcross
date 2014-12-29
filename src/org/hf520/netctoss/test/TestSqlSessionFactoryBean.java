package org.hf520.netctoss.test;

import org.hf520.netctoss.dao.CostMapperDao;
import org.hf520.netctoss.entity.Cost;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by kevin on 2014/12/29.
 */
public class TestSqlSessionFactoryBean {
    public static void main(String[] args) {
        String conf = "/org/hf520/netctoss/config/applicationContext.xml";
        ApplicationContext ac =new ClassPathXmlApplicationContext(conf);
       CostMapperDao dao=ac.getBean("costMapperDao", CostMapperDao.class);
       List<Cost> list= dao.findAll();
        for (Cost e :list){
            System.out.println(e.getId()+" "+e.getName()+" "+e.getBase_cost()+" "+e.getCost_type());
        }
    }
}
