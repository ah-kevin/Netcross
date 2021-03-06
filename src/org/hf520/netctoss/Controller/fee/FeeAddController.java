package org.hf520.netctoss.Controller.fee;

import org.hf520.netctoss.dao.CostMapperDao;
import org.hf520.netctoss.entity.Cost;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by kevin on 2014/12/29.
 */
@Controller
@RequestMapping("/fee")
public class FeeAddController {
    @Resource
    private CostMapperDao dao;

    public void setDao(CostMapperDao dao) {
        this.dao = dao;
    }

    @RequestMapping(value = "/toAdd",method = RequestMethod.GET)
    public String toADD(){
        return "fee/fee_add";
    }
    //对应/fee/add.from请求,将表单参数封装成cost对象传入
    //jsp表单中组件name属性要与Cost中属性   一致ρ
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(Cost cost){
        dao.saveCost(cost);
        System.out.println(cost.getId());
        return "redirect:/fee/list/1";
    }
}
