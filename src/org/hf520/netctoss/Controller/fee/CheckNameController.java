package org.hf520.netctoss.Controller.fee;

import org.hf520.netctoss.dao.CostMapperDao;
import org.hf520.netctoss.entity.Cost;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by kevin on 2015/1/7.
 */
@Controller
@RequestMapping("/fee")
public class CheckNameController {
    @Resource
    private CostMapperDao dao;

    @RequestMapping("/checkName")
    @ResponseBody
    public boolean check(@RequestParam(value = "name",required = false) String name){
        Cost cost= dao.findByname(name);
        if (cost==null){
            return  true;//没记录资费名可用
        }else{
            return false;
        }

    }
}
