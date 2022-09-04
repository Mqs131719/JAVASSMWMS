package com.miau.javassmwms.service.intf;

import com.miau.javassmwms.dto.AccessDto;
import com.miau.javassmwms.vo.PageBean;
import com.miau.javassmwms.vo.R;


public interface AccessService {
    /** 入库新增*/
    R saveIn(AccessDto accessDto);
    /** 出库新增*/
    R saveOut(AccessDto accessDto);
    /** 入库分页*/
    PageBean selectInPage(String goodsName,int page, int limit);
    /** 出库分页*/
    PageBean selectOutPage(String goodsName,int page,int limit);

    /** 出库更新 入库在途信息*/
    R updateOAt(AccessDto accessDto);
    /** 出库更新 出库剩余库存信息*/
    R updateOAl(AccessDto accessDto);
    /** 入库更新 入库在途信息*/
    R updateIAt(AccessDto accessDto);
    /** 确认出库更新出库数据*/
    R affirmOO(AccessDto accessDto);
    /** 确认出库更新入库数据*/
    R affirmOI(AccessDto accessDto);
    /** 确认入库更新出库数据*/
    R affirmIO(AccessDto accessDto);
    /** 确认入库更新入库数据*/
    R affirmII(AccessDto accessDto);
}
