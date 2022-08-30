//package com.miau.javassmwms.controller;
//
//import com.miau.javassmwms.service.intf.InventoryService;
//import com.miau.javassmwms.vo.PageBean;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * 小盛胜
// * 2022/8/30
// */
//@RestController
//@RequestMapping("/api/inventory/")
//public class InventoryController {
//    @Autowired
//    private InventoryService service;
//
//    @GetMapping("page.do")
//    public PageBean page(int page, int size){
//        return service.queryPage(page,size);
//    }
//}
