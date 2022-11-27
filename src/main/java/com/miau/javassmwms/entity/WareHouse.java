package com.miau.javassmwms.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author 刘豆豆
 * @date 2022/8/29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WareHouse {

    private Integer id;/**仓库id*/
    private String name;/**仓库名称*/
    private Integer uid;/**所属用户*/
    private String site;/**仓库地址*/

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd")//接收
    private Date ctime;/**仓库创建时间*/

    private User  user;/**所属用户*/
}