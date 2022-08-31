package com.miau.javassmwms.controller;

import com.miau.javassmwms.dto.UgDto;
import com.miau.javassmwms.service.intf.UgService;
import com.miau.javassmwms.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 小盛胜
 * 2022/8/30
 */
@RestController
@RequestMapping("/api/ug")

public class UgController {
    @Autowired
    private UgService service;

    @GetMapping("save.do")
    public R save(UgDto ugDto){
        return service.save(ugDto);
    }

    @GetMapping("all1.do")
    public R all1(){
        return service.all1();
    }

    @GetMapping("all2.do")
    public R all2(){
        return service.all2();
    }
}
