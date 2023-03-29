package com.angryzyh.factory;

/**
 * 具体工厂角色
 **/
public class FighterFactory implements WeaponFactory{
	@Override
	public Weapon getWeapon() {
		return new Fighter();
	}
}
