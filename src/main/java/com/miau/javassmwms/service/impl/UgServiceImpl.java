package com.miau.javassmwms.service.impl;

import com.miau.javassmwms.dao.UgDao;
import com.miau.javassmwms.dto.UgDto;
import com.miau.javassmwms.service.intf.UgService;
import com.miau.javassmwms.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 小盛胜
 * 2022/8/30
 */
@Service
public class UgServiceImpl implements UgService {

    @Autowired
    private UgDao dao;

    @Override
    public R save(UgDto ugDto) {
        if(dao.save(ugDto)>0){
            return R.ok();
        }else {
            return R.fail();
        }
    }
    @Override
    public R all1(){

     return R.ok(dao.all1());
 }

    @Override
    public R all2(){
        return R.ok(dao.all2());
    }

}
