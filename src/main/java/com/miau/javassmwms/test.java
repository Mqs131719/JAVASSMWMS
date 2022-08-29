package com.miau.javassmwms;

import com.miau.javassmwms.dao.GoodsDao;
import com.miau.javassmwms.entity.Goods;
import com.miau.javassmwms.service.intf.GoodsService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 小盛胜
 * 2022/8/28
 */

public class test {
    @Test
    public void t1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        GoodsService service = context.getBean(GoodsService.class);

        System.err.println(service.save(new Goods(2,"手机","苹果")));

    }
}
