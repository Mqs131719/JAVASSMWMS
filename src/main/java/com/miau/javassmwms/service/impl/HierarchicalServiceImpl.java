package com.miau.javassmwms.service.impl;

import com.miau.javassmwms.dao.HierarchicalDao;
import com.miau.javassmwms.entity.Hierarchical;
import com.miau.javassmwms.service.intf.HierarchicalService;
import com.miau.javassmwms.vo.PageBean;
import com.miau.javassmwms.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author li
 * @date 2022/9/1
 */
@Service
public class HierarchicalServiceImpl implements HierarchicalService {
    @Autowired
    private HierarchicalDao dao;
    @Override
    public R save(Hierarchical hierarchical) {
        if (dao.save(hierarchical)>0){
            return R.ok();
        }
        return R.fail();
    }

    @Override
    public PageBean all(Integer sid, int page, int limit) {
        int start=(page-1)*limit;
        return PageBean.ok(dao.selectCount(sid),dao.all(sid,start,limit));
    }
}