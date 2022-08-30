package com.miau.javassmwms.service.impl;

import com.miau.javassmwms.dao.AccessDao;
import com.miau.javassmwms.entity.Access;
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
    public R saveIn(Access access) {
        if (dao.saveIn(access) > 0){
            return R.ok();
        }else {
            return R.fail();
        }
    }
    /** 出库新增*/
    @Override
    public R saveOut(Access access) {
        if (dao.saveOut(access) > 0){
            return R.ok();
        }else {
            return R.fail();
        }
    }
    /** 入库分页*/
    @Override
    public PageBean selectPage(int wid, int page, int limit) {
        int start=(page-1)*limit;
        return PageBean.ok(dao.selectInCount(wid),dao.selectPageIn(wid,start,limit));
    }
    /** 出库分页*/
    @Override
    public PageBean selectOutPage(int wid, int page, int limit) {
        int start=(page-1)*limit;
        return PageBean.ok(dao.selectInCount(wid),dao.selectPageIn(wid,start,limit));
    }
}
