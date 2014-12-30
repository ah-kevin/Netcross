package org.hf520.netctoss.Controller.fee;

import org.hf520.netctoss.dao.CostMapperDao;
import org.hf520.netctoss.entity.Cost;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * Created by kevin on 2014/12/30.
        */
@Controller
@RequestMapping("/fee")
public class FeeUpdateController {
    @Resource
    private CostMapperDao dao;

    public void setDao(CostMapperDao dao) {
        this.dao = dao;
    }

    @RequestMapping("/toUpdate")
    public String toUpdate(@RequestParam(value = "id",required = false) Integer id,Model model){
        Cost cost =dao.findById(id);
        model.addAttribute("cost",cost);
        return "fee/fee_modi";
    }

    @RequestMapping("/updateCost")
    public String updateCost(Cost cost){
        //获取更新进度,调用dao
        dao.updateCost(cost);
        return "redirect:/fee/fee_list.from";
    }
}
