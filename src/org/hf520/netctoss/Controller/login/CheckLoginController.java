package org.hf520.netctoss.Controller.login;

import org.hf520.netctoss.entity.AdminInfo;
import org.hf520.netctoss.dao.AdminInfoMapperDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

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
    public String login(AdminInfo admin,Model model,HttpSession session){
        //检查验证码
        String c= (String) session.getAttribute("c");
        //System.out.println("用户输入:"+admin.getCode());
        //System.out.println("session:"+c);
        if (!admin.getCode().equals(c)) {
            //验证码错误
            model.addAttribute("code_error","验证码错误");
            return "login/login";
        }
        //检查账号和面膜
        AdminInfo info=dao.findByAdminCodeAndPwd(admin);
        model.addAttribute("error","用户名或密码错误");
        if (info!=null){
            session.setAttribute("user",info.getAdmin_code());
            return "login/index";
        }else {
            return "login/login";
        }

    }
}
