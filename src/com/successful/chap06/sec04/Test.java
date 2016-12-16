package com.successful.chap06.sec04;

/**
 * 泛型方法
 * 在返回值前面用尖括号括起来一个类型
 * 要求：泛型方法的泛型 必须是一个对象类型
 * @author ruiloveqi
 *
 */
public class Test {

	/**
	 * 泛型方法
	 * @param t
	 */
	//T必须是一个对象类型
	public static <T> void func(T t){
		System.out.println("T的类型是："+ t.getClass().getName());
	}
	
	//主函数
	public static void main(String[] args) {
		//字符串
		func("");
		//
		func(1);
		func(3.14);
		func(1.99f);
		func(new Object());
		
		/**问题***
		 * 虽然说是至少要是对象类型
		 * 可是我还不大明白为什么 int float的参数传进去可可以？？？
		 */
	}
}
