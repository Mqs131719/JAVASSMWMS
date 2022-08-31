package com.miau.javassmwms.dao;

import com.miau.javassmwms.dto.AccessDto;
import com.miau.javassmwms.entity.Access;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccessDao {
    /** 新增 入库信息*/
    int saveIn(@Param("accessDto")AccessDto accessDto,@Param("d") String d);
    /** 新增 出库信息*/
    int saveOut(@Param("accessDto")AccessDto accessDto,@Param("d") String d);
    /** 出库更新 入库在途信息*/
    int updateOAt(AccessDto accessDto);
    /** 出库更新 出库剩余库存信息*/
    int updateOAl(AccessDto accessDto);
    /** 入库更新 入库在途信息*/
    int updateIAt(AccessDto accessDto);
    /** 确认出库更新出库数据*/
    int affirmOO(AccessDto accessDto);
    /** 确认出库更新入库数据*/
    int affirmOI(AccessDto accessDto);
    /** 确认入库更新出库数据*/
    int affirmIO(AccessDto accessDto);
    /** 确认入库更新入库数据*/
    int affirmII(AccessDto accessDto);
    /** 查询入库的总条数*/
    long selectInCount();
    /** 查询出库的总条数*/
    long selectOutCount();
    /** 实现入库分页*/
    List<Access> selectPageIn(@Param("start")int start, @Param("size")int size);
    /** 实现出库分页*/
    List<Access> selectPageOut(@Param("start")int start, @Param("size")int size);
}
