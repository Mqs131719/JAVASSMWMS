package com.miau.javassmwms.service.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;
import com.miau.javassmwms.dao.GoodsDao;
import com.miau.javassmwms.dto.GoodsExcelDto;
import com.miau.javassmwms.entity.Goods;
import com.miau.javassmwms.service.intf.GoodsService;
import com.miau.javassmwms.util.StringUtil;
import com.miau.javassmwms.vo.PageBean;
import com.miau.javassmwms.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * 小盛胜
 * 2022/8/27
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao dao;

    @Override
    public R save(Goods goods) {
//        Goods goods1 = dao.selectOne(goods.getName());
//        System.out.println(goods1);
        if(dao.selectOne(goods.getName())==null&&dao.save(goods)>0){
            dao.save(goods);
            return R.ok();
        }else {
            return R.fail();
        }
    }

    @Override
    public R update(Goods goods) {
        if(dao.update(goods)>0){
            return R.ok();
        }else {
            return R.fail();
        }
    }

    @Override
    public R delete(int id) {
        if(dao.delete(id)>0){
            return R.ok();
        }else {
            return R.fail();
        }
    }

    @Override
    public R debyid(int[] id) {
        if(dao.debyid(id)>0){
            return R.ok();
        }else {
            return R.fail();
        }
    }


    @Override
    public PageBean selectPage(String name,int page,int limit) {
        if(StringUtil.isNotEmpty(name)){
            name="%"+name+"%";
        }else {
            name=null;
        }
        int start=(page-1)*limit;

        return PageBean.ok(dao.selectCount(name),dao.selectPage(name,start,limit));
    }

    @Override
    public List<GoodsExcelDto> all() {
        return dao.all();
    }

    @Override
    public R upload(MultipartFile file) throws IOException {
        //1.接收文件， 获取文件内容
        //1.验证上传文件是否存在
        if(!file.isEmpty()){
            //2.解析Excel -EasyExcel
            //2.解析Excel数据
            List<GoodsExcelDto> list= EasyExcel.read(file.getInputStream(), GoodsExcelDto.class, new ReadListener() {
                @Override
                public void invoke(Object o, AnalysisContext analysisContext) {}
                @Override
                public void doAfterAllAnalysed(AnalysisContext analysisContext) {}
            }).sheet().doReadSync();
            //3.Mybatis 实现批量新增
            if(dao.saveBatch(list)>0){
                //4.返回
                return R.ok();
            }
        }
        return R.fail();
    }
}
