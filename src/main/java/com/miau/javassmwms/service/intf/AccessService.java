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
    PageBean selectInPage(int page, int limit);
    /** 出库分页*/
    PageBean selectOutPage(int page,int limit);
}
