package com.miau.javassmwms.service.intf;


import com.miau.javassmwms.dto.UgDto;
import com.miau.javassmwms.vo.R;

import java.util.List;

public interface UgService {
    R save(UgDto ugDto);

    R all1();

    R all2();
}
