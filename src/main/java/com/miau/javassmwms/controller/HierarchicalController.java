package com.miau.javassmwms.controller;

import com.miau.javassmwms.entity.Hierarchical;
import com.miau.javassmwms.service.intf.HierarchicalService;
import com.miau.javassmwms.vo.PageBean;
import com.miau.javassmwms.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author li
 * @date 2022/9/1
 */
@RestController
@RequestMapping("/api/hi/")
public class HierarchicalController {
    @Autowired
    private HierarchicalService service;
    @RequestMapping("save.do")
    public R save(Hierarchical hierarchical){
        return service.save(hierarchical);
    }
    @RequestMapping("page.do")
    public PageBean selectPage(Integer sid, int page, int limit){
        return service.all(sid ,page,limit);
    }
}