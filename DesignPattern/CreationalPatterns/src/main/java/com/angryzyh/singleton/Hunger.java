package com.angryzyh.singleton;

// 饿汉式: 非懒加载,线程安全(类加载机制),效率高
public class Hunger{
	public static final Hunger instance = new Hunger();

	public Hunger() {
	}

	public static Hunger getInstance() {
		return instance;
	}

}
