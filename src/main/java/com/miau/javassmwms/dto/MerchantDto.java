package com.miau.javassmwms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author li
 * @date 2022/8/31
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MerchantDto {
    private Integer uid;
    private String role;
    private Integer id;
    private String name;
    private String location;
    private String phone;
}