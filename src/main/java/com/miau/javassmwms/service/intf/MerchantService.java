package com.miau.javassmwms.service.intf;

import com.miau.javassmwms.entity.Merchant;
import com.miau.javassmwms.vo.PageBean;
import com.miau.javassmwms.vo.R;

/**
 * @author li
 * @date 2022/8/31
 */
public interface MerchantService {
    /**
     * 新增*/
    R save(Merchant merchant);
    /**
     * 查询所有*/
    PageBean selectPage(String role, int page,int limit);
    /**查询*/
    R all();
    /**删除*/
    R delete(int uid);
}