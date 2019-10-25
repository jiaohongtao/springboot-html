package com.example.springboot_html.test.multithreading.KFC;

/**
 * @author jiaohongtao
 * @since 2019/10/25 16:36
 */
public class Customers extends Thread {
	private KFC kfc;

	//KFC要传入，保证每一个服务员和用户在同一个KFC对象内
	public Customers(KFC kfc) {
		this.kfc = kfc;
	}

	@Override
	public void run() {
		int size = (int) (Math.random() * 5);//每次要消费的食物的数量
		while (true) {
			kfc.consume(size);//在消费的方法里面传入参数
		}
	}
}
