package com.miau.javassmwms.service.impl;

import com.miau.javassmwms.dao.GoodsDao;
import com.miau.javassmwms.dto.GoodsExcelDto;
import com.miau.javassmwms.entity.Goods;
import com.miau.javassmwms.service.intf.GoodsService;
import com.miau.javassmwms.util.StringUtil;
import com.miau.javassmwms.vo.PageBean;
import com.miau.javassmwms.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 小盛胜
 * 2022/8/27
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao dao;

    @Override
    public R save(Goods goods) {
//        Goods goods1 = dao.selectOne(goods.getName());
//        System.out.println(goods1);
        if(dao.selectOne(goods.getName())==null&&dao.save(goods)>0){
            dao.save(goods);
            return R.ok();
        }else {
            return R.fail();
        }
    }

    @Override
    public R update(Goods goods) {
        if(dao.update(goods)>0){
            return R.ok();
        }else {
            return R.fail();
        }
    }

    @Override
    public R delete(int id) {
        if(dao.delete(id)>0){
            return R.ok();
        }else {
            return R.fail();
        }
    }

    @Override
    public R debyid(int[] id) {
        if(dao.debyid(id)>0){
            return R.ok();
        }else {
            return R.fail();
        }
    }


    @Override
    public PageBean selectPage(String name,int page,int limit) {
        if(StringUtil.isNotEmpty(name)){
            name="%"+name+"%";
        }else {
            name=null;
        }
        int start=(page-1)*limit;

        return PageBean.ok(dao.selectCount(name),dao.selectPage(name,start,limit));
    }

    @Override
    public List<GoodsExcelDto> all() {
        return dao.all();
    }
}
