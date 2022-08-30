package com.miau.javassmwms.service.intf;

import com.miau.javassmwms.entity.Goods;
import com.miau.javassmwms.vo.PageBean;
import com.miau.javassmwms.vo.R;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsService {

    R save(Goods goods);

    R update(Goods goods);

    R delete(int id);

//    R debyid(int[] id);

    PageBean selectPage(String name,int page,int limit);

}
