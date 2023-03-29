package com.angryzyh.Proxy代理.static_proxy;


import com.angryzyh.Proxy代理.sevice.OrderService;
import com.angryzyh.Proxy代理.static_proxy.service.impl.OrderServiceImplProxy;

public class TestStaticProxy {
	/*
	* 静态代理五步走:
	* 场景:一个A类实现了接口,要对a做功能增强
	* 1.创建一个a代理类也实现接口
	* 2.在代理类a中，添加接口属性
	* 3.再在代理类a中，创建代理类a的带参（带接口属性）构造方法
	* 4.代理类a,实现方法后，通过接口属性调用方法，在方法前后再做增强
	* 5.使用的时候，创建代理类a的构造方法，new a(new A()),该对象就是可以做功能增强的代理类了
	* */
	public static void main(String[] args) {
		OrderService orderServiceImplProxy = new OrderServiceImplProxy();
		orderServiceImplProxy.doOrder();
		String orderInfo = orderServiceImplProxy.getOrderInfo();
		System.out.println("orderInfo = " + orderInfo);
	}
}
