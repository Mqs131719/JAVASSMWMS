package com.miau.javassmwms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** 购销关系表*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hierarchical {
    private int sid;
    private int bid;
}
