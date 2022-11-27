package com.miau.javassmwms.service.intf;

import com.miau.javassmwms.entity.WareHouse;
import com.miau.javassmwms.vo.PageBean;
import com.miau.javassmwms.vo.R;

public interface WareHouseService {
    /**
     * 新增
     */
    R insert(WareHouse wareHouse);

    /**
     *查询分页
     */
    PageBean selectPage(String name,int page,int limit);

    //修改
    R update(WareHouse wareHouse);

    /**
     * 联合查询*/

    PageBean select(Integer uid, int page, int limit);
}