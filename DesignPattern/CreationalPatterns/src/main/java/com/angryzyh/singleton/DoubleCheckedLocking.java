package com.angryzyh.singleton;

// 双重校验锁: 懒加载,线程安全,效率高
public class DoubleCheckedLocking{

	private volatile static DoubleCheckedLocking instance;

	public DoubleCheckedLocking() {
	}

	public static DoubleCheckedLocking getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckedLocking.class) {
				if (instance == null) {
					instance = new DoubleCheckedLocking();
				}
			}
		}
		return instance;
	}
}
