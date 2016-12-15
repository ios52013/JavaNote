package com.successful.chap03.sec03;

public class Person2 {

	//有一个参数的方法
	void speak(String name){
		System.out.println("我叫 "+name);
	}
	
	
	public static void main(String[] args) {
		//定义一个Person对象
		Person2 zhangsan = new Person2();
		zhangsan.speak("张三");
	}
	
}
