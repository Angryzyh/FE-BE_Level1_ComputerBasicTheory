package com.angryzyh.singleton;

// 懒汉式: 懒加载, 线程不安全, 效率高
public class Lazy{
	private static Lazy instance;

	public Lazy() {}

	public static Lazy getInstance() {
		if (instance == null) {
			instance = new Lazy();
		}
		return instance;
	}
}
