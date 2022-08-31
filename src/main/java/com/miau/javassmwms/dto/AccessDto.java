package com.miau.javassmwms.dto;

import com.miau.javassmwms.entity.Access;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccessDto {
    /** 商品名 */
    private String goodsName;
    /** 仓库名称*/
    private String whName;
    /** 出入库信息 */
    private Integer id;// 出入库的id
    private Integer quantity;// 商品数量
    private Integer gid;// 商品id

    private Integer inWid;

    private Integer outWid;
    private Integer status;
}
