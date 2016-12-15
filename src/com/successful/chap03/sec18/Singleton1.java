package com.successful.chap03.sec18;

//单例

public class Singleton1 {

	//构造方法 私有化
	private Singleton1(){
		
	}
	
	//
	/**
	 * 饿汉模式创建了对象  实现了单例
	 * final修饰表示是常量 不能修改了
	 * static修饰 是因为在静态方法里面调用
	 */
	private static final Singleton1 singleton1 = new Singleton1();
	
	
	/**
	 * 静态工厂方式
	 * @return
	 */
	//通过这个方法访问私有化的方法 和 属性
	public static Singleton1 getInstances(){
		return singleton1;
	}
	
	
	
}
