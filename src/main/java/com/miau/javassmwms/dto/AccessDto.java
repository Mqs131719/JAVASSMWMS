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
    private Access access;
}
