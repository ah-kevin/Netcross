package org.hf520.netctoss.test;

import org.hf520.netctoss.dao.RoleMapperDao;
import org.hf520.netctoss.entity.Role;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;
/**
 * Created by kevin on 2015/1/6.
 */
public class TestRoleDao {
    public static void main(String[] args) {
        String conf = "org/hf520/netctoss/config/applicationContext.xml";
        ApplicationContext ac =new ClassPathXmlApplicationContext(conf);
        RoleMapperDao dao=ac.getBean("roleMapperDao", RoleMapperDao.class);
        List<Role> list=dao.findAll();
        for (Role r:list){
            System.out.println(r.getId()+" "+r.getName());
        }
    }
}
