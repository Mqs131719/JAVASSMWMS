package com.miau.javassmwms.service.impl;

import com.miau.javassmwms.dao.MerchantssDao;
import com.miau.javassmwms.service.intf.MerchantssService;
import com.miau.javassmwms.vo.PageBean;
import com.miau.javassmwms.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MerchantssServiceImpl implements MerchantssService {

    @Autowired
    private MerchantssDao dao;

    @Override
    public PageBean selectPage(String role, int page, int limit) {
        int start=(page-1)*limit;
        return PageBean.ok(dao.selectCount(role),dao.selectPage(start,limit));
    }

    @Override
    public R allks() {
        return R.ok(dao.allks());
    }

    @Override
    public R deleteks(int uid) {
        if (dao.deleteks(uid)>0){
            return R.ok();
        }
        return R.fail();
    }
}