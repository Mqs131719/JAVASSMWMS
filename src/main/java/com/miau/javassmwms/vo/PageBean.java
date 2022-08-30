package com.miau.javassmwms.vo;

import com.miau.javassmwms.config.SystemConfig;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
public class PageBean {
    private int code;
    private String msg;
    private long count;
    private List data;

    /**
     * 成功 返回
     * @param count 总条数
     * @param data 本页数据内容*/
    public static PageBean ok(long count,List data){
        PageBean bean=new PageBean();
        bean.setCode(SystemConfig.PAGE_OK);
        bean.setMsg("OK");
        bean.setCount(count);
        bean.setData(data);
        return bean;
    }
//    public PageBean(long count, List data) {
//        this.code=0;
//        this.msg="OK";
//        this.count = count;
//        this.data = data;
//    }
}
