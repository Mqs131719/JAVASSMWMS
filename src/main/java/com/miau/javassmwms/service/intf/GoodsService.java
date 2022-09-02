package com.miau.javassmwms.service.intf;

import com.miau.javassmwms.dto.GoodsExcelDto;
import com.miau.javassmwms.entity.Goods;
import com.miau.javassmwms.vo.PageBean;
import com.miau.javassmwms.vo.R;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface GoodsService {

    R save(Goods goods);

    R update(Goods goods);

    R delete(int id);

    R debyid(int[] id);

    PageBean selectPage(String name,int page,int limit);

    List<GoodsExcelDto> all();

    R upload(MultipartFile file) throws IOException;
}
