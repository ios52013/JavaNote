package com.successful.chap03.sec18;

import com.successful.chap03.sec12.Test;

public class TestSingleton {

	
	
	//主函数
	public static void main(String[] args) {
		
		//The constructor Singleton1() is not visible
		//Singleton1 singleton1 = new Singleton1();
		
		//创建2个对象
		Singleton1 singleton1 = Singleton1.getInstances();
		Singleton1 singleton2 = Singleton1.getInstances();
		
		//
		boolean isSame = (singleton1 == singleton2);
		System.out.println("饿汉模式实现的单例："+ isSame);
		
		
		//
		TestSingleton t1 = new TestSingleton();
		TestSingleton t2 = new TestSingleton();
		System.out.println("普通方法创建的两个对象地址是否相同？"+ (t1 == t2));
		
		
		//懒汉模式
		Singleton2 singleton3 = Singleton2.getInstances();
		Singleton2 singleton4 = Singleton2.getInstances();
		System.out.println("懒汉模式实现的单例:" + (singleton3 == singleton4));
		
		
	}
	
	
}
