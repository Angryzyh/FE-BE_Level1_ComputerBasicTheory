package com.angryzyh.abstract_factory;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Test_ {
	@Test
	@DisplayName("测试抽象工厂")
	void 测试抽象工厂() {
		// 客户端调用方法时只面向AbstractFactory调用方法。
		AbstractFactory factory = new WeaponFactory(); // 注意：这里的new WeaponFactory()可以采用 简单工厂模式 进行隐藏。
		Weapon gun = factory.getWeapon("Gun");
		Weapon dagger = factory.getWeapon("Dagger");
		gun.attack();
		dagger.attack();

		AbstractFactory factory1 = new FruitFactory(); // 注意：这里的new FruitFactory()可以采用 简单工厂模式 进行隐藏。
		Fruit orange = factory1.getFruit("Orange");
		Fruit apple = factory1.getFruit("Apple");
		orange.ripeCycle();
		apple.ripeCycle();
	}
}
