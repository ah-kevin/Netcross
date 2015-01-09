package org.hf520.netctoss.Controller.fee;

import org.hf520.netctoss.dao.CostMapperDao;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by kevin on 2014/12/29.
 */
@Controller
@RequestMapping("/fee")
@Transactional
public class FeeDeleteController {
    @Resource
    private CostMapperDao dao;

    public void setDao(CostMapperDao dao) {
        this.dao = dao;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public boolean execute(@PathVariable("id") Integer id){
        System.out.println("------d----");
    if (id!=null){
        //调用mapperDao的delete
        dao.deleteCost(id);
    }
        //return "redirect:/fee/fee_list.from";
        return true;
    }
}
