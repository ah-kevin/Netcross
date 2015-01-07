package org.hf520.netctoss.entity;

import org.hf520.netctoss.util.PrivilegeReader;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kevin on 2015/1/6.
 *
 */
public class Role implements Serializable{
    private  Integer id;
    private  String name;

    //追加关联属性,用于追加关联role_privilege标记
    private List<RolePrivilege> pris=new ArrayList<RolePrivilege>();

    //追加一个方法,根据pris权限ID信息返回权限名
    public String getPrisName(){
        String name="";
        for (RolePrivilege rolePrivilege:pris) {
            Integer pid = rolePrivilege.getPrivilege_id();
            name +=PrivilegeReader.getModuleNameById(pid + "");
            name +=",";
        }
        return name;
    }

    public List<RolePrivilege> getPris() {
        return pris;
    }

    public void setPris(List<RolePrivilege> pris) {
        this.pris = pris;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
