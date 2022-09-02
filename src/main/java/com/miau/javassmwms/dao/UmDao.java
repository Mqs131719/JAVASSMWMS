package com.miau.javassmwms.dao;

import com.miau.javassmwms.dto.UgDto;
import com.miau.javassmwms.dto.UmDto;

import java.util.List;

/**
 * 小盛胜
 * 2022/9/2
 */
public interface UmDao {
    int save1(UmDto umDto);

    List<UmDto> all3();

    List<UmDto> all4();
}
