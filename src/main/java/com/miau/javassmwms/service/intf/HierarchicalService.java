package com.miau.javassmwms.service.intf;

import com.miau.javassmwms.entity.Hierarchical;
import com.miau.javassmwms.vo.PageBean;
import com.miau.javassmwms.vo.R;

/**
 * @author li
 * @date 2022/9/1
 */
public interface HierarchicalService {
    /**新增*/
    R save(Hierarchical hierarchical);
    /**
     *查询*/

    PageBean all(Integer sid, int page, int limit);
}