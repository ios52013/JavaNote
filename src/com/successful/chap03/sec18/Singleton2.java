package com.successful.chap03.sec18;

//单例

public class Singleton2 {

	//构造方法 私有化
	private Singleton2(){
		
	}
	
	//
	/**
	 * 懒汉模式实现单例
	 * 在第一次调用的时候实例化
	 */
	private static  Singleton2 singleton1 = null;
	
	
	/**
	 * 静态工厂方式
	 * @return
	 */
	public synchronized static Singleton2 getInstances(){
		
		//第一次被调用的时候 会创建对象
		if(singleton1 == null){
			System.out.println("第一次调用的时候实例化");
			singleton1 = new Singleton2();
		}
		
		return singleton1;
	}
	
	
	
}
