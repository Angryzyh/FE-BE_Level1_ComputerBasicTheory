package com.angryzyh.abstract_factory;

/**
 * 武器产品族中的产品等级2
 **/
public class Dagger extends Weapon{
	@Override
	public void attack() {
		System.out.println("砍丫的！");
	}
}