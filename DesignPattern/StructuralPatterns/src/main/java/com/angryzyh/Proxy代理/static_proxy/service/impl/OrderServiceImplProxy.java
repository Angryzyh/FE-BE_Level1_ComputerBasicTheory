package com.angryzyh.Proxy代理.static_proxy.service.impl;


import com.angryzyh.Proxy代理.sevice.OrderService;
import com.angryzyh.Proxy代理.sevice.impl.OrderServiceImpl;

public class OrderServiceImplProxy implements OrderService {

	private final OrderService target;

	public OrderServiceImplProxy() {
		target = new OrderServiceImpl();
	}

	@Override
	public void doOrder() {
		long start = System.currentTimeMillis();
		target.doOrder();
		long end = System.currentTimeMillis();
		System.out.println("用时" + (end - start) + "毫秒");
	}

	@Override
	public String getOrderInfo() {
		long start = System.currentTimeMillis();
		String orderInfo = target.getOrderInfo();
		long end = System.currentTimeMillis();
		System.out.println("用时" + (end - start) + "毫秒");
		return orderInfo;
	}
}
