package com.miau.javassmwms.service.intf;

import com.miau.javassmwms.entity.Access;
import com.miau.javassmwms.vo.PageBean;
import com.miau.javassmwms.vo.R;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccessService {
    /** 入库新增*/
    R saveIn(Access access);
    /** 出库新增*/
    R saveOut(Access access);
    /** 入库分页*/
    PageBean selectPage(int wid, int page, int limit);
    /** 出库分页*/
    PageBean selectOutPage(int wid,int page,int limit);
}
