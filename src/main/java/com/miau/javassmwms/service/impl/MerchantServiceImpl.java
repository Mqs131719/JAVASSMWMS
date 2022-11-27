package com.miau.javassmwms.service.impl;

import com.miau.javassmwms.dao.MerchantDao;
import com.miau.javassmwms.entity.Merchant;
import com.miau.javassmwms.service.intf.MerchantService;
import com.miau.javassmwms.vo.PageBean;
import com.miau.javassmwms.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author li
 * @date 2022/8/31
 */
@Service
public class MerchantServiceImpl implements MerchantService {
    @Autowired
    private MerchantDao dao;
    @Override
    public R save(Merchant merchant) {
        if (dao.save(merchant)>0){
            return R.ok();
        }else {
            return R.fail();
        }
    }

    @Override
    public PageBean selectPage(String role,int page, int limit) {
        int start=(page-1)*limit;
        return PageBean.ok(dao.selectCount(role),dao.selectPage(start,limit));
    }

    @Override
    public R all() {
        return R.ok(dao.all());
    }

    @Override
    public R delete(int uid) {
        if (dao.delete(uid)>0){
            return R.ok();
        }
        return R.fail();
    }


}