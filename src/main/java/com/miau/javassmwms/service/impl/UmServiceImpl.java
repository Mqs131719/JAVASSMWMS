package com.miau.javassmwms.service.impl;

import com.miau.javassmwms.dao.UmDao;
import com.miau.javassmwms.dto.UmDto;
import com.miau.javassmwms.service.intf.UmService;
import com.miau.javassmwms.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 小盛胜
 * 2022/9/2
 */
@Service
public class UmServiceImpl implements UmService {
    @Autowired
    private UmDao dao;
    @Override
    public R save1(UmDto umDto) {
        if (dao.save1(umDto)>0){
            return R.ok();
        }
        return R.fail();
    }

    @Override
    public R all3(){
        return R.ok(dao.all3());
    }

    @Override
    public R all4(){
        return R.ok(dao.all4());
    }
}
