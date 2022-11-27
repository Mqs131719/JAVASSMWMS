package com.miau.javassmwms.controller;

import com.miau.javassmwms.entity.WareHouse;
import com.miau.javassmwms.service.intf.WareHouseService;
import com.miau.javassmwms.vo.PageBean;
import com.miau.javassmwms.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘豆豆
 * @date 2022/8/29
 */
@RestController
@RequestMapping("/api/warehouse/")
public class WareHouseController {

    @Autowired
    private WareHouseService service;


    @PostMapping ("insert.do")
    public R insert(WareHouse wareHouse){
        return service.insert(wareHouse);
    }



    @GetMapping("all.do")
    public PageBean pag(Integer uid, int page, int limit){
        return service.select(uid,page,limit);
    }

    @GetMapping("page.do")
    public PageBean page(String name,int page,int limit){
        return service.selectPage(name,page,limit);
    }


    @PostMapping("update.do")
    public R update(WareHouse wareHouse){
        return service.update(wareHouse);
    }
}