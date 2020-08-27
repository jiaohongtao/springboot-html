package com.example.springboothtml.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiaohongtao
 * @since 2019/8/22 16:39
 */
@RestController
@Api
public class HelloController {

	@Value("${my.name}")
	private String name;

	@RequestMapping({"", "/index"})
	@ApiOperation(value = "首页(hello)", httpMethod = "GET")
	public String index() {
		return "hello:" + name;
	}
}
