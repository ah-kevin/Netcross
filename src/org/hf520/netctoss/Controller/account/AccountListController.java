package org.hf520.netctoss.Controller.account;

import org.hf520.netctoss.dao.AccountMapperDao;
import org.hf520.netctoss.entity.Account;
import org.hf520.netctoss.entity.AccountPage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by kevin on 2015/1/9.
 */
@Controller
@RequestMapping("/account")
public class AccountListController {
    @Resource
    private AccountMapperDao dao;

    @RequestMapping(value = "/account_list/{idcard_no}/{real_name}/{login_name}/{status}", method = RequestMethod.GET)
    public String execute(@PathVariable("idcard_no") String idcard_no,@PathVariable("real_name") String real_name,@PathVariable("login_name") String login_name,
                          @PathVariable("status") String status, Model model) {
        System.out.println("idcrad_no="+idcard_no);
        System.out.println("real_Name"+real_name);
        System.out.println("login_name"+login_name);
        //构建查询参数对象
        AccountPage page = new AccountPage();
        page.setIdcard_no(idcard_no);
        page.setReal_name(real_name);
        page.setLogin_name(login_name);
        page.setStatus(status);
        //调用dao查询
        List<Account> list = dao.findByCondition(page);
        model.addAttribute("accounts", list);

        //将条件*号清空
        page.setIdcard_no(conver(page.getIdcard_no()));
        page.setReal_name(conver(page.getReal_name()));
        page.setLogin_name(conver(page.getLogin_name()));
        page.setStatus(conver(page.getStatus()));
        model.addAttribute("page", page);
        return "account/account_list";
    }

    public  String conver(String  s){
        if("*".equals(s)){
            return  "";
        }else {
            return s;
        }
    }

}
