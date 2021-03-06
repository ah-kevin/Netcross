package org.hf520.netctoss.Controller.fee;

import org.hf520.netctoss.dao.CostMapperDao;
import org.hf520.netctoss.entity.Cost;
import org.hf520.netctoss.entity.Page;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by kevin on 2014/12/29.
 */
@Controller
@RequestMapping("/fee")
@Transactional(readOnly = true)
public class FeeListController {
    @Resource
    private CostMapperDao dao;

    public void setDao(CostMapperDao dao) {
        this.dao = dao;
    }

    ////fee/fee_list.from
    //@RequestMapping("/fee_list")
    //public  String execute(Model model){
    //    List<Cost> list =dao.findAll();
    //    model.addAttribute("costs",list);
    //    return "fee/fee_list";
    //}
    //fee/fee_list.from?page=1&pagesize=3请求
    //分页查询
    //@RequestMapping("/fee_list")
    //public  String execute(Page page,Model model){
    //    List<Cost> list =dao.findPage(page);
    //    //计算总页数
    //    int totalRows =dao.findRows();
    //    int totalPage=1;//默认为1
    //    if(totalRows%page.getPageSize()==0){
    //
    //        totalPage =totalRows/page.getPageSize();
    //    }else {
    //        totalPage=totalRows/page.getPageSize() +1;
    //    }
    //    page.setTotalPage(totalPage);
    //    //将结果放到Model,供页面访问
    //    model.addAttribute("page",page);
    //    model.addAttribute("costs",list);
    //    return "fee/fee_list";
    //}
    //Resutful 改
    @RequestMapping(value = "/list/{p}",method = RequestMethod.GET)
    public  String execute(@PathVariable("p") int p,Model model){
        Page page =new Page();
        page.setPage(p);
        List<Cost> list =dao.findPage(page);
        //计算总页数
        int totalRows =dao.findRows();
        int totalPage=1;//默认为1
        if(totalRows%page.getPageSize()==0){

            totalPage =totalRows/page.getPageSize();
        }else {
            totalPage=totalRows/page.getPageSize() +1;
        }
        page.setTotalPage(totalPage);
        //将结果放到Model,供页面访问
        model.addAttribute("page",page);
        model.addAttribute("costs",list);
        return "fee/fee_list";
    }
}
