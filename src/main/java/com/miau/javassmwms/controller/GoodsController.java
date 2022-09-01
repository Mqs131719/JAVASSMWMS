package com.miau.javassmwms.controller;

import com.miau.javassmwms.entity.Goods;
import com.miau.javassmwms.service.intf.GoodsService;
import com.miau.javassmwms.vo.PageBean;
import com.miau.javassmwms.vo.R;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 小盛胜
 * 2022/8/27
 */
@RestController
@RequestMapping("/api/controller/")
public class GoodsController {
    @Autowired
    private GoodsService service;

    @PostMapping("save.do")
    public R save(Goods goods){
        return service.save(goods);
    }

    @PostMapping("update.do")
    public R update(Goods goods){
        return service.update(goods);
    }

    @GetMapping("delete.do")
    public R delete(int id){
        return service.delete(id);
    }

    @GetMapping("page.do")
    public PageBean page(String name, int page, int limit){
        return service.selectPage(name, page, limit);
    }

    @PostMapping("debyid.do")
    public R debyid(int[] id){
        return service.debyid(id);
    }
}
