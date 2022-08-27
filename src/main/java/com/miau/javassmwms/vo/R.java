package com.miau.javassmwms.vo;

import com.miau.javassmwms.config.SystemConfig;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class R {
    private int code;
    private String msg;
    private Object data;

    /**
     * 成功*/
    public static R ok(Object data){
        //魔法值：直接写值的(数字、字符串等)，开发中应该避免魔法值，要么用枚举要么用常量
//        return new R(200,"OK",data);
        return new R(SystemConfig.R_OK,"OK",data);
    }
    /**
     * 成功*/
    public static R ok(){
        return ok(null);
    }
    /**
     * 失败*/
    public static R fail(String msg){
        return new R(SystemConfig.R_FAIL,msg,null);
    }
    /**
     * 失败*/
    public static R fail(){
        return fail("FAIL");
    }
}
