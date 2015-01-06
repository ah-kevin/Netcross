package org.hf520.netctoss.entity;

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
