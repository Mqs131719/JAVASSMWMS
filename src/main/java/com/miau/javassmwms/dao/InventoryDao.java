package com.miau.javassmwms.dao;

import com.miau.javassmwms.dto.InventoryDto;
import com.miau.javassmwms.entity.Inventory;
import com.miau.javassmwms.vo.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ░░░░░░░░░░░░░░░░░░░░░░░░▄░░
 * ░░░░░░░░░▐█░░░░░░░░░░░▄▀▒▌░
 * ░░░░░░░░▐▀▒█░░░░░░░░▄▀▒▒▒▐░
 * ░░░░░░░▐▄▀▒▒▀▀▀▀▄▄▄▀▒▒▒▒▒▐░
 * ░░░░░▄▄▀▒░▒▒▒▒▒▒▒▒▒█▒▒▄█▒▐░
 * ░░░▄▀▒▒▒░░░▒▒▒░░░▒▒▒▀██▀▒▌░
 * ░░▐▒▒▒▄▄▒▒▒▒░░░▒▒▒▒▒▒▒▀▄▒▒░
 * ░░▌░░▌█▀▒▒▒▒▒▄▀█▄▒▒▒▒▒▒▒█▒▐
 * ░▐░░░▒▒▒▒▒▒▒▒▌██▀▒▒░░░▒▒▒▀▄
 * ░▌░▒▄██▄▒▒▒▒▒▒▒▒▒░░░░░░▒▒▒▒
 * ▀▒▀▐▄█▄█▌▄░▀▒▒░░░░░░░░░░▒▒▒
 * 单身狗就这样默默地看着你，一句话也不说。
 *
 * @Author JohnnyMiau
 * @DateTime 2022/8/29 15:50
 */
public interface InventoryDao {
    /**
     * 查询总条数 带条件*/
    long selectCount(int wid);
    /**
     * 查询库存数据 分页 limit 带条件*/
    List<Inventory> selectPage(@Param("wid") int wid, @Param("start") int page, @Param("size") int limit);
    /**
     * 删除*/
    int update(Inventory inventory);
}
