package com.miau.javassmwms.service.intf;

import com.miau.javassmwms.vo.PageBean;
import com.miau.javassmwms.vo.R;

public interface MerchantssService {
    PageBean selectPage(String role, int page, int limit);

    R allks();

    R deleteks(int uid);
}
