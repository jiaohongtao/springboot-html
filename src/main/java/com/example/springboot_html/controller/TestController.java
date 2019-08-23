package com.example.springboot_html.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 焦洪涛
 * @since 2019/8/22 16:43
 * @describte 测试页面
 */
@Controller
public class TestController {
	@RequestMapping("test")
	public String test() {
		return "test";
	}

	@RequestMapping("hello1")
	public String hello1() {
		return "hello1";
	}

	@RequestMapping("hello2")
	public String hello2() {
		return "hello2";
	}
}