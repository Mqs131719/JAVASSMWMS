package com.miau.javassmwms.controller;

import com.miau.javassmwms.dto.MerchantDto;
import com.miau.javassmwms.entity.Merchant;
import com.miau.javassmwms.service.intf.MerchantService;
import com.miau.javassmwms.vo.PageBean;
import com.miau.javassmwms.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author li
 * @date 2022/8/31
 */
@RestController
@RequestMapping("/api/merchant/")
public class MerchantController {
    @Autowired
    private MerchantService service;

    @RequestMapping("save.do")
    public R save(Merchant merchant){
        return service.save(merchant);
    }

    @RequestMapping("page.do")
    public PageBean selectPage(String role,int page,int limit){
        return service.selectPage(role ,page,limit);
    }

    @RequestMapping("all.do")
    public R all(){ return service.all(); }

    @RequestMapping("delete.do")
    public R delete(int uid){
        return service.delete(uid);
    }
}