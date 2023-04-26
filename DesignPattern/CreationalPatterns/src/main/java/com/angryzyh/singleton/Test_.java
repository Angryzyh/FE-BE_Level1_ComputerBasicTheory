package com.angryzyh.singleton;

import lombok.SneakyThrows;
import org.junit.jupiter.api.*;

import java.util.concurrent.*;

// 多线程测试单例模式
public class Test_ {

	@SneakyThrows
	@Test
	@DisplayName("测试单例模式")
	void 测试单例模式() {
		Callable<Hunger> callable = new Callable<Hunger>() {
			@Override
			public Hunger call() throws Exception {
				return Hunger.getInstance();
			}
		};
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		Future<Hunger> submit1 = executorService.submit(callable);
		Future<Hunger> submit2 = executorService.submit(callable);
		Hunger instance1 = submit1.get();
		Hunger instance2 = submit2.get();
		System.out.println(instance1 == instance2);
	}
}
