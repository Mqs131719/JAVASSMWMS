package com.miau.javassmwms.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.Data;



import java.util.Date;

/**
 * 小盛胜
 * 2022/9/1
 */
public class GoodsExcelDto {
    @Data
    @ColumnWidth(25)
    public class Goods {
        @ExcelProperty(value="商品id")
        private Integer id;

        @ExcelProperty(value="商品类型")
        private String  type;

        @ExcelProperty(value="商品名")
        private String name;

        @ExcelProperty(value="商品名创建时间")
        @DateTimeFormat("yyyy年MM月dd日")
        private Date ctime ;

        @ExcelProperty(value="商品来源")
        private String address;

    }
}
