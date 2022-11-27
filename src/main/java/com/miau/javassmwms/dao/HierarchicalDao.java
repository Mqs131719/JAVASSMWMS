package com.miau.javassmwms.dao;

import com.miau.javassmwms.dto.HierarchicalDto;
import com.miau.javassmwms.dto.MerchantDto;
import com.miau.javassmwms.entity.Hierarchical;
import org.apache.ibatis.annotations.Param;

import java.util.IntSummaryStatistics;
import java.util.List;

/**
 * @author li
 * @date 2022/9/1
 */
public interface HierarchicalDao {
    /**
     * 新增*/
    int save(Hierarchical hierarchical);
    /**
     * 查询总数*/
    long selectCount(Integer sid);

    /**
     * 查询*/
    List<HierarchicalDto> all(@Param("sid") Integer sid, @Param("start")int start,@Param("size")int size);

}