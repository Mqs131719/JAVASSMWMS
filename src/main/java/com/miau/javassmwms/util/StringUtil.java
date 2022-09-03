package com.miau.javassmwms.util;

public class StringUtil {
    /**
     * 验证字符串是否为空*/
    public static boolean isNotEmpty(String... strs){
        boolean r=true;
        for(String s:strs){
            if(s==null || s.length()==0){
                r=false;
                break;
            }
        }
        return r;
    }
}
