package com.miau.javassmwms.vo;

import com.miau.javassmwms.config.SystemConfig;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * ━━━━━━神兽出没━━━━━━
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　　　　 ┃
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　  ┃
 * 　　┃　　　　　　 ┃
 * 　　┃　　　┻　　　┃
 * 　　┃　　　　　　　┃
 * 　　┗━┓　　　┏━┛Code is far away from bug with the animal protecting
 * 　　　　┃　　　┃    神兽保佑,代码无bug
 * 　　　　┃　　　┃
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━━━永无BUG!━━━━━━
 *
 * @Description:
 * @Author: 邢朋辉
 * @Date: 2022/8/27 11:16
 */
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
}
