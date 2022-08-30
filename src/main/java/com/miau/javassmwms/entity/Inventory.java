//package com.miau.javassmwms.entity;
//
//import com.fasterxml.jackson.annotation.JsonFormat;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.springframework.format.annotation.DateTimeFormat;
//
//import java.util.List;
//
///**
// * 小盛胜
// * 2022/8/30
// */
//@Data
//@NoArgsConstructor
//public class Inventory {
//    private int wid;
//    private int allowance;
//    private int way;
//    @JsonFormat(pattern = "yyyy-MM-dd")
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    private Data ctime;
//    private List<Goods> goods;
//    public Inventory(int allowance, int way, Data ctime) {
//        this.allowance = allowance;
//        this.way = way;
//        this.ctime = ctime;
//    }
//}
