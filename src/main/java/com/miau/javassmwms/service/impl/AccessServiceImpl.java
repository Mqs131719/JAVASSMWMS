package com.miau.javassmwms.service.impl;

import com.miau.javassmwms.dao.AccessDao;
import com.miau.javassmwms.dto.AccessDto;
import com.miau.javassmwms.service.intf.AccessService;
import com.miau.javassmwms.vo.PageBean;
import com.miau.javassmwms.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccessServiceImpl implements AccessService {
    @Autowired
    private AccessDao dao;
    /** 入库新增*/
    @Override
    public R saveIn(AccessDto accessDto) {
        if (dao.saveIn(accessDto) > 0){
            return R.ok(dao.saveIn(accessDto));
        }else {
            return R.fail();
        }
    }
    /** 出库新增*/
    @Override
    public R saveOut(AccessDto accessDto) {
        if (dao.saveOut(accessDto) > 0){
            return R.ok(dao.saveOut(accessDto));
        }else {
            return R.fail();
        }
    }
    /** 入库分页*/
    @Override
    public PageBean selectInPage(int page, int limit) {
        int start=(page-1)*limit;
        return PageBean.ok(dao.selectInCount(),dao.selectPageIn(start,limit));
    }
    /** 出库分页*/
    @Override
    public PageBean selectOutPage(int page, int limit) {
        int start=(page-1)*limit;
        return PageBean.ok(dao.selectInCount(),dao.selectPageIn(start,limit));
    }
}
