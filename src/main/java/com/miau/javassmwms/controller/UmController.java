package com.miau.javassmwms.controller;


import com.miau.javassmwms.dto.UmDto;
import com.miau.javassmwms.service.intf.UmService;
import com.miau.javassmwms.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 小盛胜
 * 2022/9/2
 */
@RestController
@RequestMapping("/api/um")
public class UmController {

        @Autowired
        private UmService service;

        @PostMapping("save1.do")
        public R save1(UmDto umDto){
            return service.save1(umDto);
        }

        @GetMapping("all3.do")
        public R all3(){
            return service.all3();
        }

        @GetMapping("all4.do")
        public R all4(){
            return service.all4();
        }
}
