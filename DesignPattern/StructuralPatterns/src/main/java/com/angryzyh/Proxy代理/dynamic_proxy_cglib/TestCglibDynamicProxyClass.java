package com.angryzyh.Proxy代理.dynamic_proxy_cglib;

import com.angryzyh.Proxy代理.sevice.impl.OrderServiceImpl;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

public class TestCglibDynamicProxyClass {
	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();
		// 代理类
		enhancer.setSuperclass(OrderServiceImpl.class);
		enhancer.setCallback((MethodInterceptor) (o, method, objects, methodProxy) -> {
			long start = System.currentTimeMillis();
			//这里直接传入类对象,invokeSuper 执行父对象的方法
			Object invoke = methodProxy.invokeSuper(o, objects);
			long end = System.currentTimeMillis();
			System.out.println("耗时" + (end - start) + "毫秒");
			return invoke;
		});
		OrderServiceImpl o = (OrderServiceImpl)enhancer.create();

		o.doOrder();
		String orderInfo = o.getOrderInfo();
		System.out.println("orderInfo = " + orderInfo);
	}
}
