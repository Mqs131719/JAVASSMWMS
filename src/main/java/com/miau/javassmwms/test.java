package com.miau.javassmwms;

import com.miau.javassmwms.dao.GoodsDao;
import com.miau.javassmwms.dao.UgDao;
import com.miau.javassmwms.entity.Goods;
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
        GoodsDao dao = context.getBean(GoodsDao.class);

    }
    @Test
    public void t2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UgDao dao = context.getBean(UgDao.class);
        System.err.println(dao.all2());
    }
//    @Test
//    public void t3(){
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        GoodsDao dao = context.getBean(GoodsDao.class);
//        System.err.println(dao.update(16,"vivo","家居家装","河南省郑州市"));
//    }
}
