package org.hf520.netctoss.test;

import org.hf520.netctoss.dao.CostMapperDao;
import org.hf520.netctoss.entity.Cost;
import org.hf520.netctoss.entity.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created by kevin on 2015/1/7.
 */
@Controller
@RequestMapping("/test")
public class JsonController {
    @Resource
    private CostMapperDao dao;

    @RequestMapping("/test1")
    @ResponseBody
    public boolean f1(){
        return true;
    }

    @RequestMapping("/test2")
    @ResponseBody
    public Map<String ,Object> f2(){
        Map map=new HashMap<String,Objects>();
        map.put("id",1001);
        map.put("name","tom");
        return map;
    }

    @RequestMapping("/test3")
    @ResponseBody
    public Cost f3(){
        Cost cost=dao.findById(2);
        return cost;
    }

    @RequestMapping("/test4")
    @ResponseBody
    public List f4(){
        Page page =new Page();
        List<Cost> list=dao.findPage(page);
        return list;
    }
}
