package com.miau.javassmwms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
// 出入库表
public class Access {
    private Integer id;// 出入库的id
    private Integer wid;// 仓库id
    private Integer quantity;// 商品数量
    private Integer gid;// 商品id
    private String direction;// 出入库

}
