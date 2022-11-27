package com.miau.javassmwms.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author 刘豆豆
 * @date 2022/8/30
 */
@Data
public class WareHouseUser {

    private Integer id;
    private String name;
    private Integer uid;
    private String uname;
    private String site;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd")//接收
    private Date ctime;

}