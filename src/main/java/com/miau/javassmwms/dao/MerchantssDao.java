package com.miau.javassmwms.dao;

import com.miau.javassmwms.dto.MerchantssDto;
import com.miau.javassmwms.entity.Merchant;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MerchantssDao {

    long selectCount(String role);

    List<MerchantssDto> selectPage(@Param("start") int start, @Param("size") int size);

    List<Merchant> allks();

    int deleteks(int id);
}