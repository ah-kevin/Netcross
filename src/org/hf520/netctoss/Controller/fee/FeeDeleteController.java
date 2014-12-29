package org.hf520.netctoss.Controller.fee;

import org.hf520.netctoss.dao.CostMapperDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * Created by kevin on 2014/12/29.
 */
@Controller
@RequestMapping("/fee")
public class FeeDeleteController {
    @Resource
    private CostMapperDao dao;

    public void setDao(CostMapperDao dao) {
        this.dao = dao;
    }

    @RequestMapping("/fee_delete")
    public String execute(@RequestParam(value = "id",required = false) Integer id){
    if (id!=null){
        //调用mapperDao的delete
        dao.deleteCost(id);
    }
        return "redirect:/fee/fee_list.from";
    }
}
