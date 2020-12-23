package com.hong.controller;

import com.hong.util.common.IDCardUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiaohongtao
 * @version 1.0
 * @since 2020年12月23日
 */
@Api(tags = "获取行政地址")
@RestController
public class ProvinceController {

    @ApiOperation(value = "省级", httpMethod = "GET")
    @GetMapping("/province/{idNumber}")
    public String getProvince(@PathVariable String idNumber) {
        return IDCardUtil.getProvince(idNumber);
    }
}
