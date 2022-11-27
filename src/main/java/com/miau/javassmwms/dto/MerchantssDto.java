package com.miau.javassmwms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MerchantssDto {
    private Integer uid;
    private String role;
    private Integer id;
    private String name;
    private String location;
    private String phone;
}