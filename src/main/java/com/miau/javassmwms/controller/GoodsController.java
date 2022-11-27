package com.miau.javassmwms.controller;

import com.alibaba.excel.EasyExcel;
import com.miau.javassmwms.dto.GoodsExcelDto;
import com.miau.javassmwms.entity.Goods;
import com.miau.javassmwms.service.intf.GoodsService;
import com.miau.javassmwms.vo.PageBean;
import com.miau.javassmwms.vo.R;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 小盛胜
 * 2022/8/27
 */
@RestController
@RequestMapping("/api/controller/")
public class GoodsController {
    @Autowired
    private GoodsService service;

    @PostMapping("save.do")
    public R save(Goods goods){
        return service.save(goods);
    }

    @PostMapping("update.do")
    public R update(Goods goods){
        return service.update(goods);
    }

    @GetMapping("delete.do")
    public R delete(int id){
        return service.delete(id);
    }

    @GetMapping("page.do")
    public PageBean page(String name, int page, int limit){
        return service.selectPage(name, page, limit);
    }

    @PostMapping("debyid.do")
    public R debyid(int[] id){
        return service.debyid(id);
    }

    @GetMapping("download.do")
    public void download(HttpServletResponse response) throws IOException {
        response.setHeader("content-disposition","attachment;filename=goods-"+System.currentTimeMillis()+".xlsx");
        List<GoodsExcelDto> list=service.all();
        EasyExcel.write(response.getOutputStream(),GoodsExcelDto.class).
                sheet(System.currentTimeMillis()+"").doWrite(list);
    }

    @PostMapping("upload.do")
    public R upload(MultipartFile file) throws IOException {
    return service.upload(file);
    }

}

