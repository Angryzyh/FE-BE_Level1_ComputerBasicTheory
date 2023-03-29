package com.angryzyh.Proxy代理.dynamic_proxy_jdk;


import com.angryzyh.Proxy代理.sevice.OrderService;
import com.angryzyh.Proxy代理.sevice.impl.OrderServiceImpl;

import java.lang.reflect.Proxy;

public class TestJdkDynamicProxy {
	public static void main(String[] args) {
		OrderService orderService = new OrderServiceImpl();
		//Proxy.newProxyInstance(类加载器,要被代理的对象,调用处理器InvocationHandler)
		OrderService o = (OrderService)Proxy.newProxyInstance(
			orderService.getClass().getClassLoader(),
			orderService.getClass().getInterfaces(),
			(proxy, method, args1) -> {
				long start = System.currentTimeMillis();
				/*
					方法四要素
					1. 什么对象
					2. 什么方法
					3. 什么参数
					4. 什么返回值
				 */
				Object invoke = method.invoke(orderService, args1);
				long end = System.currentTimeMillis();
				System.out.println("耗时" + (end - start) + "毫秒");
				return invoke;
			});
		String orderInfo = o.getOrderInfo();
		System.out.println("orderInfo = " + orderInfo);
		o.doOrder();
	}
}
