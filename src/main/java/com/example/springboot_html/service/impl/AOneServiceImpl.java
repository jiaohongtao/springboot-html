package com.example.springboot_html.service.impl;

import com.example.springboot_html.service.interf.AService;
import org.springframework.stereotype.Service;

/**
 * @author jiaohongtao
 * @version 1.0
 * @since 2020年07月24日
 */
@Service("aOneServiceImpl")
public class AOneServiceImpl implements AService {
    @Override
    public String a() {
        return this.getClass().getName();
    }
}
