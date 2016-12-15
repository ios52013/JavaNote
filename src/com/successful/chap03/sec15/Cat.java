package com.successful.chap03.sec15;

public class Cat extends Animal {


	//重写父类的方法
	public void say(){
		System.out.println("我是一个小猫咪!");
	}
	
	/**
	 * 子类的方法
	 */
	public void eat(){
		System.out.println("我喜欢吃鱼🐟!");
	}
}
