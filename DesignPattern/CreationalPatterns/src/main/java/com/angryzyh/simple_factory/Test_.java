package com.angryzyh.simple_factory;

import org.junit.jupiter.api.Test;

public class Test_ {
	@Test
	public void test1() {
		Weapon weapon1 = WeaponFactory.getWeapon("TANK");
		weapon1.attack();

		Weapon weapon2 = WeaponFactory.getWeapon("FIGHTER");
		weapon2.attack();

		Weapon weapon3 = WeaponFactory.getWeapon("DAGGER");
		weapon3.attack();
	}
}
