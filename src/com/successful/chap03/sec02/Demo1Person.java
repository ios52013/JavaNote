package com.successful.chap03.sec02;

/**
 * Person类
 * @author ruiloveqi
 *
 */

//公开   类的标识   类名
public  class  Demo1Person {

	//属性
	String Name;//在类中定义一个属性Name姓名字符串
	int age;//定义一个属性age 表示年龄
	
	//方法
	public void speak(){
		System.out.println("我叫"+Name+" 今年"+age+"岁了!");
	}
	
	
	
	public static void main(String[] args) {
		//定义一个Demo1Person类的对象
		Demo1Person zhangsan;
		
		//实例化对象
		zhangsan = new Demo1Person();
		//给对象属性赋值
		zhangsan.Name = "张三";
		zhangsan.age = 18;
		//调用方法
		zhangsan.speak();
		
		
	}
}
