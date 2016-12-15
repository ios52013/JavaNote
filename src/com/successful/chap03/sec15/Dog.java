package com.successful.chap03.sec15;

public class Dog extends Animal {
	

	//重写父类的方法
	public void say(){
		System.out.println("我是一个小可爱的狗!");
	}
	
    /**
     * 子类独有的方法
     */
	public void myName(){
		System.out.println("我的名字叫Jack!");
	}
}
