package com.angryzyh.singleton;

// 懒汉式+锁: 懒加载, 线程安全, 效率低
public class LazySync{
	public static LazySync instance;

	public LazySync() {
	}

	public static synchronized LazySync getInstance() {
		return instance == null ? new LazySync() : null;
	}
}
