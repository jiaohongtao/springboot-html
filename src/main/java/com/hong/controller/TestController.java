package com.hong.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiaohongtao
 * @since 2019/8/22 16:43
 * @describtion 测试页面
 */
@RestController
@Api
public class TestController {
	@GetMapping("test")
	@ApiOperation(value = "test", httpMethod = "GET")
	public String test() {
		return "test";
	}

	@GetMapping("hello1")
	@ApiOperation(value = "hello1", httpMethod = "GET")
	public String hello1() {
		return "hello1";
	}

	@GetMapping("hello2")
	@ApiOperation(value = "hello2", httpMethod = "GET")
	public String hello2() {
		return "hello2";
	}
}