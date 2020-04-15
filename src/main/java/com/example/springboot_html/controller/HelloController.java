package com.example.springboot_html.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiaohongtao
 * @since 2019/8/22 16:39
 */
@RestController
@Api
public class HelloController {

	@RequestMapping({"", "/index"})
	@ApiOperation(value = "首页(hello)", httpMethod = "GET")
	public String index() {
		return "hello";
	}
}
