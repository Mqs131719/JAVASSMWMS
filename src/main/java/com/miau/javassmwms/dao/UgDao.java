package com.miau.javassmwms.dao;

import com.miau.javassmwms.dto.UgDto;

import java.util.List;

/**
 * 小盛胜
 * 2022/8/30
 */
public interface UgDao {
    int save(UgDto ugDto);

     List<UgDto> all1();

     List<UgDto> all2();
}
