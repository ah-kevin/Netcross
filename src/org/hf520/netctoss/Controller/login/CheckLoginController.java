package org.hf520.netctoss.Controller.login;

import org.hf520.netctoss.entity.AdminInfo;
import org.hf520.netctoss.dao.AdminInfoMapperDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by kevin on 2014/12/30.
 */
@Controller
@RequestMapping("/login")
public class CheckLoginController {
    @Resource
    private AdminInfoMapperDao dao;

    public void setDao(AdminInfoMapperDao dao) {
        this.dao = dao;
    }

    @RequestMapping("/login")
    public String login(AdminInfo admin,Model model){
        AdminInfo info=dao.findByAdminCodeAndPwd(admin);
        model.addAttribute("error","用户名或密码错误");
        if (info!=null){
            return "login/index";
        }else {
            return "login/login";
        }

    }
}
