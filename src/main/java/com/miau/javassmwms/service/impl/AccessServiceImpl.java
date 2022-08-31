package com.miau.javassmwms.service.impl;

import com.miau.javassmwms.dao.AccessDao;
import com.miau.javassmwms.dto.AccessDto;
import com.miau.javassmwms.service.intf.AccessService;
import com.miau.javassmwms.vo.PageBean;
import com.miau.javassmwms.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AccessServiceImpl implements AccessService {
    @Autowired
    private AccessDao dao;
    String d=String.valueOf(new Date().getTime());
    /** 入库新增*/
    @Override
    public R saveIn(AccessDto accessDto) {
        int r=dao.saveIn(accessDto,d);
        if (r > 0){
            return R.ok(r);
        }else {
            return R.fail();
        }
    }
    /** 出库新增*/
    @Override
    public R saveOut(AccessDto accessDto) {
        int r=dao.saveOut(accessDto,d);
        if (r > 0){
            return R.ok(r);
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

    @Override
    public R updateOAt(AccessDto accessDto) {
        int r=dao.updateOAt(accessDto);
        if (r > 0){
            return R.ok(r);
        }else {
            return R.fail();
        }
    }

    @Override
    public R updateOAl(AccessDto accessDto) {
        int r=dao.updateOAl(accessDto);
        if (r > 0){
            return R.ok(r);
        }else {
            return R.fail();
        }
    }

    @Override
    public R updateIAt(AccessDto accessDto) {
        int r=dao.updateIAt(accessDto);
        if (r > 0){
            return R.ok(r);
        }else {
            return R.fail();
        }
    }

    @Override
    public R affirmOO(AccessDto accessDto) {
        int r=dao.affirmOO(accessDto);
        if (r > 0){
            return R.ok(r);
        }else {
            return R.fail();
        }
    }

    @Override
    public R affirmOI(AccessDto accessDto) {
        int r=dao.affirmOI(accessDto);
        if (r > 0){
            return R.ok(r);
        }else {
            return R.fail();
        }
    }

    @Override
    public R affirmIO(AccessDto accessDto) {
        int r=dao.affirmIO(accessDto);
        if (r > 0){
            return R.ok(r);
        }else {
            return R.fail();
        }
    }

    @Override
    public R affirmII(AccessDto accessDto) {
        int r=dao.affirmII(accessDto);
        if (r > 0){
            return R.ok(r);
        }else {
            return R.fail();
        }
    }
}
