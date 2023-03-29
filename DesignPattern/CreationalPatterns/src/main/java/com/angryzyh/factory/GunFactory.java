package com.angryzyh.factory;

/**
 * 具体工厂角色
 **/
public class GunFactory implements WeaponFactory{
	@Override
	public Weapon getWeapon() {
		return new Gun();
	}
}
