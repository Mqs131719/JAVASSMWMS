//package com.miau.javassmwms.service.impl;
//
//import com.miau.javassmwms.dao.InventoryDao;
//import com.miau.javassmwms.service.intf.InventoryService;
//import com.miau.javassmwms.util.StringUtil;
//import com.miau.javassmwms.vo.PageBean;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
///**
// * 小盛胜
// * 2022/8/30
// */
//@Service
//public class InventoryServiceImpl implements InventoryService {
//    @Autowired
//    private InventoryDao dao;
//
//    @Override
//    public PageBean queryPage(int page, int size) {
//        long count = dao.selectCount();
//        int start=(page-1)*size;
//        return new PageBean(count,dao.selectPage(start,size));
//    }
//}
