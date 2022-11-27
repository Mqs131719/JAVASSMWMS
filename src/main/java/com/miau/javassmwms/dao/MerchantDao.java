package com.miau.javassmwms.dao;

import com.miau.javassmwms.dto.MerchantDto;
import com.miau.javassmwms.entity.Merchant;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author li
 * @date 2022/8/31
 */
public interface MerchantDao {
    /**
     * 新增*/
    int save(Merchant merchant);
    /**
     * 查询总数*/
    long selectCount(String role);
    /**
     * 查询数据 分页*/
    List<MerchantDto> selectPage(@Param("start") int start,@Param("size") int size);
    /**
     * 查询*/
    List<Merchant> all();
    /**
     * 删除*/
    int delete(int id);
}