package com.angryzyh.Proxy代理.sevice.impl;


import com.angryzyh.Proxy代理.sevice.OrderService;

import java.util.concurrent.TimeUnit;

public class OrderServiceImpl implements OrderService {

	@Override
	public void doOrder() {
		try {
			TimeUnit.MILLISECONDS.sleep(1243);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("处理订单中");
	}

	@Override
	public String getOrderInfo() {
		try {
			TimeUnit.MILLISECONDS.sleep(245);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("查询订单信息");
		return "两只鸡脚";
	}
}
