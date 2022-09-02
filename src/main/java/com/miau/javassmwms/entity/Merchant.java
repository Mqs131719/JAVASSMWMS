package com.miau.javassmwms.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 小盛胜
 * 2022/9/2
 */
@Data
@NoArgsConstructor

public class Merchant {

    private int uid;
    private String role;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ctime ;

    public Merchant(int uid, String role) {
        this.uid = uid;
        this.role = role;
    }
}
