package org.hf520.netctoss.Controller.fee;

import org.hf520.netctoss.dao.CostMapperDao;
import org.hf520.netctoss.entity.Cost;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by kevin on 2015/1/7.
 */
@Controller
@RequestMapping("/fee")
@Transactional(readOnly = true)
public class CheckNameController {
    @Resource
    private CostMapperDao dao;

    @RequestMapping(value = "/check/{name}")
    @ResponseBody
    public boolean check(@PathVariable("name") String name){
        Cost cost= dao.findByname(name);
        if (cost==null){
            return  true;//没记录资费名可用
        }else{
            return false;
        }

    }
}
