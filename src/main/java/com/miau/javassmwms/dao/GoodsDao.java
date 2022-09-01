package com.miau.javassmwms.dao;

import com.miau.javassmwms.entity.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsDao {

    int save(Goods goods);

    List<Goods> selectPage(@Param("name") String name, @Param("start") int start, @Param("size") int size);

    long selectCount(String name);

    Goods selectOne(String name);

    int update(@Param("id") int id,@Param("name") String name,@Param("type") String type,@Param("address") String address);

    int delete(int id);

    int debyid(int[] id);

}