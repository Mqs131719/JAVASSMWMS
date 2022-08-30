package com.miau.javassmwms.dao;

import com.miau.javassmwms.dto.AccessDto;
import com.miau.javassmwms.entity.Access;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccessDao {
    /** 新增 入库信息*/
    int saveIn(AccessDto accessDto);
    /** 新增出库信息*/
    int saveOut(AccessDto accessDto);
    /** 查询入库的总条数*/
    long selectInCount();
    /** 查询出库的总条数*/
    long selectOutCount();
    /** 实现入库分页*/
    List<Access> selectPageIn(@Param("start")int start, @Param("size")int size);
    /** 实现出库分页*/
    List<Access> selectPageOut(@Param("start")int start, @Param("size")int size);
}
