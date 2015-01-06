package org.hf520.netctoss.entity;

import java.io.Serializable;

/**
 * Created by kevin on 2015/1/6.
 */
public class RolePrivilege implements Serializable {
    private Integer role_id;
    private Integer privilege_id;

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public Integer getPrivilege_id() {
        return privilege_id;
    }

    public void setPrivilege_id(Integer privilege_id) {
        this.privilege_id = privilege_id;
    }
}
