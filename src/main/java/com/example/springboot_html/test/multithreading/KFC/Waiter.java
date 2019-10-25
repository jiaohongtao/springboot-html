package com.example.springboot_html.test.multithreading.KFC;

/**
 * @author jiaohongtao
 * @since 2019/10/25 16:37
 */
public class Waiter extends Thread {
	private KFC kfc;

	//KFC要传入，保证每一个服务员和用户在同一个KFC对象内
	public Waiter(KFC kfc) {
		this.kfc = kfc;
	}

	@Override
	public void run() {
		int size = (int) (Math.random() * 5) + 5;//每次生产的数量
		while (true) {
			kfc.product(size);//传入每次生产的数量
		}

	}
}
