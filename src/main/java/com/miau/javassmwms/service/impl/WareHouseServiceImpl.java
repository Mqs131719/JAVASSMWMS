package com.miau.javassmwms.service.impl;

import com.miau.javassmwms.config.SystemConfig;
import com.miau.javassmwms.dao.WareHouseDao;
import com.miau.javassmwms.entity.WareHouse;
import com.miau.javassmwms.service.intf.WareHouseService;
import com.miau.javassmwms.util.StringUtil;
import com.miau.javassmwms.vo.PageBean;
import com.miau.javassmwms.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * @author 刘豆豆
 * @date 2022/8/29
 */
@Service
public class WareHouseServiceImpl implements WareHouseService {

    @Autowired
    private WareHouseDao dao;

    /**
     * 新增*/
    @Override
    public R insert(WareHouse wareHouse) {
        if (dao.insert(wareHouse) > 0) {
            return R.ok();
        }else {
            return R.fail();
        }
    }

    /**
     * 查询*/
    @Override
    public PageBean selectPage(String name,int page,int limit) {
        if (StringUtil.isNotEmpty(name)) {
            name="%"+name+"%";
        }

        int start = (page-1)*limit;
        return PageBean.ok(dao.selectCount(name),dao.selectPage(name,start,limit));
    }

    /**修改*/
    @Override
    public R update(WareHouse wareHouse) {
        if (dao.update(wareHouse) > 0) {
            return R.ok();
        }else {
            return R.fail();
        }
    }

    /**
     * 联合查询*/
    @Override
    public PageBean select(Integer uid,int page, int limit) {
        int start = (page-1)*limit;
        return PageBean.ok(dao.select1(uid),dao.select(uid,start,limit));
    }

}