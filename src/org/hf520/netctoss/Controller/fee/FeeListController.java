package org.hf520.netctoss.Controller.fee;

import org.hf520.netctoss.dao.CostMapperDao;
import org.hf520.netctoss.entity.Cost;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by kevin on 2014/12/29.
 */
@Controller
@RequestMapping("/fee")
public class FeeListController {
    @Resource
    private CostMapperDao dao;

    public void setDao(CostMapperDao dao) {
        this.dao = dao;
    }

    //fee/fee_list.from
    @RequestMapping("/fee_list")
    public  String execute(Model model){
        List<Cost> list =dao.findAll();
        model.addAttribute("costs",list);
        return "fee/fee_list";
    }
}
