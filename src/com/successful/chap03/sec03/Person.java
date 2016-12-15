package com.successful.chap03.sec03;

public class Person {

	//定义一个最简单的方法
	void speak(){
		System.out.println("我叫张三!");
	}
	
	
	public static void main(String[] args) {
		//定义一个Person对象
		Person zhangsan = new Person();
		zhangsan.speak();
	}
	
}
