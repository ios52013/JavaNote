package com.successful.chap03.sec03;

public class Demo7 {

	//普通方法
	void fun1(){
	System.out.println("这是普通方法!");	
	}
	
	//静态方法
	static void fun2(){
		System.out.println("这是static静态方法!");
	}
	
	//主函数
	public static void main(String[] args) {
		//创建对象
		Demo7 demo = new Demo7();
		
		//调用普通方法  对象.方法
		demo.fun1();
		//不能以调用静态方法的方式 去 调用非静态方法
		//Demo7.fun1();
		
		//调用静态方法   类名.方法  或者 对象.方法
		Demo7.fun2();
		demo.fun2();
		
	}
	
	
}
