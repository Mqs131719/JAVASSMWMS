package com.miau.javassmwms.dao;

import com.miau.javassmwms.entity.Access;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccessDao {
    /** 新增 入库信息*/
    int saveIn(Access access);
    /** 新增出库信息*/
    int saveOut(Access access);
    /** 查询入库的总条数*/
    long selectInCount(int wid);
    /** 查询出库的总条数*/
    long selectOutCount(int wid);
    /** 实现入库分页*/
    List<Access> selectPageIn(@Param("wid")int wid,@Param("start")int start, @Param("size")int size);
    /** 实现出库分页*/
    List<Access> selectPageOut(@Param("wid")int wid,@Param("start")int start, @Param("size")int size);
}
