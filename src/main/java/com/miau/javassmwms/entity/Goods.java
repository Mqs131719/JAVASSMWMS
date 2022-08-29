package com.miau.javassmwms.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 小盛胜
 * 2022/8/27
 */
@Data

@NoArgsConstructor
public class Goods {
    private Integer id;
    private String  type;
    private String name;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ctime ;

    public Goods(String type, String name) {
        this.type = type;
        this.name = name;
    }
}