package com.miau.javassmwms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author li
 * @date 2022/9/3
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HierarchicalDto {
    private Integer id;
    private Integer sid;
    private Integer bid;
    // 用户名
    private String name;
}