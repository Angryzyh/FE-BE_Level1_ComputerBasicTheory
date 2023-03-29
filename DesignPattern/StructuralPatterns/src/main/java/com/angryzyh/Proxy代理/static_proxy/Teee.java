package com.angryzyh.Proxy代理.static_proxy;

import com.angryzyh.Proxy代理.sevice.impl.OrderServiceImpl;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class Teee {


	public static void main(String[] args) {
		OrderServiceImpl orderService = new OrderServiceImpl();
		long start = System.currentTimeMillis();
		orderService.doOrder();
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}
