package org.hf520.netctoss.Controller.role;

import org.hf520.netctoss.dao.RoleMapperDao;
import org.hf520.netctoss.entity.Role;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by kevin on 2015/1/7.
 */
@Controller
@RequestMapping("/role")
public class RoleListController {
    @Resource
    private RoleMapperDao dao;

    public void setDao(RoleMapperDao dao) {
        this.dao = dao;
    }

    @RequestMapping("/role_list")
    public String execute(Model model){
        List<Role> list =dao.findAll();
        model.addAttribute("roles",list);
        return "role/role_list";
    }

}
