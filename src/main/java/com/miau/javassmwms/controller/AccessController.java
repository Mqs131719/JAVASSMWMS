package com.miau.javassmwms.controller;

import com.miau.javassmwms.dto.AccessDto;
import com.miau.javassmwms.service.intf.AccessService;
import com.miau.javassmwms.vo.PageBean;
import com.miau.javassmwms.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api/access/")
public class AccessController {
    @Autowired
    public AccessService service;
    /**入库*/
    @PostMapping("save.do")
    public R  save(AccessDto accessDto){
        List<Object> obj = new ArrayList<>();
            obj.add(service.saveIn(accessDto));
            obj.add(service.saveOut(accessDto));
            obj.add(service.updateOAt(accessDto));
            obj.add(service.updateOAl(accessDto));
            return R.ok(obj);
    }
    /** 入库分页*/
    @GetMapping("pageIn.do")
    public PageBean page(String goodsName, int page, int limit ){
        return service.selectInPage(goodsName,page, limit);
    }

    /**出库分页*/
    @GetMapping("pageOut.do")
    public PageBean pageOut(String goodsName,int page,int limit){
        return service.selectOutPage(goodsName,page, limit);
    }

    /**确认出库*/
    @PostMapping("affirmOut.do")
    public R  affirmOut(AccessDto accessDto){
        List<Object> obj = new ArrayList<>();
        obj.add(service.affirmOO(accessDto));
        obj.add(service.affirmOI(accessDto));
        return R.ok(obj);
    }
    /**确认入库*/
    @PostMapping("affirmIn.do")
    public R  affirmIn(AccessDto accessDto){
        List<Object> obj = new ArrayList<>();
        obj.add(service.updateIAt(accessDto));
        obj.add(service.affirmIO(accessDto));
        obj.add(service.affirmII(accessDto));
        return R.ok(obj);
    }
}
