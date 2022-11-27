package com.miau.javassmwms.dao;

import com.miau.javassmwms.dto.WareHouseUser;
import com.miau.javassmwms.entity.WareHouse;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WareHouseDao {
    /**
     * 新增
     */
    int insert(WareHouse wareHouse);

    /**
     * 查讯总条数，带条件
     */
    long selectCount(String name);

    /**
     * 查询数据 分页 limit 待条件
     */
    List<WareHouse> selectPage(@Param("name") String name, @Param("start") int start, @Param("size") int size);

    //修改
    int update(WareHouse wareHouse);


    /**联合查询*/
    long select1(Integer uid);

    List<WareHouseUser> select(@Param("uid")Integer uid, @Param("start") int start, @Param("size") int size);


}