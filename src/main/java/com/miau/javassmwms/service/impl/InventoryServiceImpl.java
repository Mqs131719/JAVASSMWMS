package com.miau.javassmwms.service.impl;

import com.miau.javassmwms.dao.InventoryDao;
import com.miau.javassmwms.entity.Inventory;
import com.miau.javassmwms.service.intf.InventoryService;
import com.miau.javassmwms.vo.PageBean;
import com.miau.javassmwms.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ░░░░░░░░░░░░░░░░░░░░░░░░▄░░
 * ░░░░░░░░░▐█░░░░░░░░░░░▄▀▒▌░
 * ░░░░░░░░▐▀▒█░░░░░░░░▄▀▒▒▒▐░
 * ░░░░░░░▐▄▀▒▒▀▀▀▀▄▄▄▀▒▒▒▒▒▐░
 * ░░░░░▄▄▀▒░▒▒▒▒▒▒▒▒▒█▒▒▄█▒▐░
 * ░░░▄▀▒▒▒░░░▒▒▒░░░▒▒▒▀██▀▒▌░
 * ░░▐▒▒▒▄▄▒▒▒▒░░░▒▒▒▒▒▒▒▀▄▒▒░
 * ░░▌░░▌█▀▒▒▒▒▒▄▀█▄▒▒▒▒▒▒▒█▒▐
 * ░▐░░░▒▒▒▒▒▒▒▒▌██▀▒▒░░░▒▒▒▀▄
 * ░▌░▒▄██▄▒▒▒▒▒▒▒▒▒░░░░░░▒▒▒▒
 * ▀▒▀▐▄█▄█▌▄░▀▒▒░░░░░░░░░░▒▒▒
 * 单身狗就这样默默地看着你，一句话也不说。
 *
 * @Author JohnnyMiau
 * @DateTime 2022/8/29 16:49
 */
@Service
public class InventoryServiceImpl implements InventoryService {
    @Autowired
    private InventoryDao dao;

    @Override
    public PageBean selectPage(int wid, int page, int limit) {
        int start=(page-1)*limit;
        return PageBean.ok(dao.selectCount(wid),dao.selectPage(wid,start,limit));
    }

    @Override
    public R update(Inventory inventory) {
        if(dao.update(inventory)>0){
            return R.ok();
        }else {
            return R.fail();
        }
    }
}
