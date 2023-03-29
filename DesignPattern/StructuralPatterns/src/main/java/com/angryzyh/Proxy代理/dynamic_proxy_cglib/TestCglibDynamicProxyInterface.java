package com.angryzyh.Proxy代理.dynamic_proxy_cglib;

import com.angryzyh.Proxy代理.sevice.OrderService;
import com.angryzyh.Proxy代理.sevice.impl.OrderServiceImpl;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

public class TestCglibDynamicProxyInterface {
	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();
		OrderServiceImpl orderService = new OrderServiceImpl();
		// 代理接口
		enhancer.setSuperclass(OrderService.class);
		enhancer.setCallback((MethodInterceptor) (o, method, objects, methodProxy) -> {
			long start = System.currentTimeMillis();
			//这里传入实现类对象,invoke执行实现类的方法
			Object invoke = methodProxy.invoke(orderService, objects);
			long end = System.currentTimeMillis();
			System.out.println("耗时" + (end - start) + "毫秒");
			return invoke;
		});
		OrderService o = (OrderService)enhancer.create();

		o.doOrder();
		String orderInfo = o.getOrderInfo();
		System.out.println("orderInfo = " + orderInfo);
	}
}
