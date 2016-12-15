package com.successful.chap03.sec03;

public class Person3 {

	// 有2个参数的方法，参数之间用逗号隔开
	void speak(String name, int age){
		System.out.println("我叫"+name+" 我今年"+age+"岁了!");
	}
	
	
	public static void main(String[] args) {
		//定义一个Person对象
		Person3 zhangsan = new Person3();
		zhangsan.speak("张三",23);
	}
	
}
