package com.miau.javassmwms.controller;

import com.miau.javassmwms.entity.Access;
import com.miau.javassmwms.service.intf.AccessService;
import com.miau.javassmwms.vo.PageBean;
import com.miau.javassmwms.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/access/")
public class AccessController {
    @Autowired
    public AccessService service;
    /**入库*/
    @RequestMapping("save.do")
    public R save(Access access){
        return service.saveIn(access);
    }
    /** 入库分页*/
    @RequestMapping("page.do")
    public PageBean page(int wid, int page, int limit ){
        return service.selectPage(wid, page, limit);
    }
    /** 出库*/
    @RequestMapping("saveOut.do")
    public R saveOut(Access access){
        return service.saveOut(access);
    }
    /**出库分页*/
    @RequestMapping("pageOut.do")
    public PageBean pageOut(int wid,int page,int limit) {
        return service.selectOutPage(wid, page, limit);
    }
}
