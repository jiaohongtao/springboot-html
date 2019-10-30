package com.example.springboot_html.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author jiaohongtao
 * @since 2019/10/25 17:21
 */
public class TestLambda {

	public static void main(String[] args) {
		// 测试list_lambda
		List<String> proNames = Arrays.asList("Ni", "Hao", "Lambda");
		List<String> uppercaseNames = proNames.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(uppercaseNames);
	}
}
