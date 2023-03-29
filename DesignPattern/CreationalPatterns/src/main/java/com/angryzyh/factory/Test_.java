package com.angryzyh.factory;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Test_ {

	@Test
	@DisplayName("测试工厂方法模式")
	void 测试工厂方法模式() {
		WeaponFactory factory = new GunFactory();
		Weapon weapon = factory.getWeapon();
		weapon.attack();

		WeaponFactory factory1 = new FighterFactory();
		Weapon weapon1 = factory1.getWeapon();
		weapon1.attack();
	}

}
