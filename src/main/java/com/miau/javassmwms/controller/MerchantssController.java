package com.miau.javassmwms.controller;

import com.miau.javassmwms.service.intf.MerchantssService;
import com.miau.javassmwms.vo.PageBean;
import com.miau.javassmwms.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/merchantss/")
public class MerchantssController {
    @Autowired
    private MerchantssService service;

    @RequestMapping("page.do")
    public PageBean selectPage(String role, int page, int limit){
        return service.selectPage(role ,page,limit);
    }

    @RequestMapping("allks.do")
    public R allks(){
        return service.allks();
    }

    @RequestMapping("deleteks.do")
    public R deleteks(int uid){
        return service.deleteks(uid);
    }
}