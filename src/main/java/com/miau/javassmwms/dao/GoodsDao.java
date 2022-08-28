package com.miau.javassmwms.dao;

import com.miau.javassmwms.entity.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsDao {

    int save(Goods goods);

    List<Goods> selectPage(@Param("name") String name, @Param("start") int start, @Param("size") int size);

    long selectCount(String name);

    Goods selectOne(int id);

    int update(Goods goods);

    int delete(int id);

}
