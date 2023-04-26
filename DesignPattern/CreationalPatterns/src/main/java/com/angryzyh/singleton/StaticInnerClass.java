package com.angryzyh.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// 静态内部类: 懒加载, 线程安全
public class StaticInnerClass{
	// 静态内部类
	public static class StaticInnerClassHolder {
		public static final StaticInnerClass instance = new StaticInnerClass();
	}

	public StaticInnerClass() {
	}

	public static StaticInnerClass getInstance() {
		return StaticInnerClassHolder.instance;
	}
}
