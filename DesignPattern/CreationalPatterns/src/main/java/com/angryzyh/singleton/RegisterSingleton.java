package com.angryzyh.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RegisterSingleton{
	/**
	 * 登记式单例模式, 保证map中的对象是同一份
	 */
	private static Map<String, Object> map;

	static {
		System.out.println("static start");
		map = new ConcurrentHashMap<>();
		map.put(RegisterSingleton.class.getName(), new RegisterSingleton());
		System.out.println("static end");
	}

	private RegisterSingleton() {
		System.out.println("this Constructor is called");
	}

	public static Object getInstance(String name) {
		// 如果不填形参,就给name一个默认值
		if (name == null) {
			name = RegisterSingleton.class.getName();
		}
		//如果是第一次调用,就初始化单例
		if (map.get(name) == null) {
			try {
				System.out.println("1");
				map.put(name, Class.forName(name).newInstance());
				System.out.println("2");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return map.get(name);
	}

	@Test
	@DisplayName("test1")
	void test1() {
		Object zyh = RegisterSingleton.getInstance("com.angryzyh.singleton.RegisterSingleton");
	}
}