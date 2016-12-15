package com.successful.chap03.sec04;

public class Person {

	//私有的属性 只能在类中访问
	private String Name;//String属性默认值是Null
	private int age;//int类型默认值是0
	
	//方法
	public void say(){
	     System.out.println("我叫"+Name+",我今年"+age+"岁了");	
	}
	
	//构造方法 的名字 与 类名一致
	//没有返回值
	/**
	 * 默认构造方法
	 */
	Person(){
		System.out.println("默认构造方法!");
	}
	
	/**
	 * 有参数的构造方法
	 * 
	 */
	Person(String name2, int age2){
		System.out.println("有参的构造方法!");
		Name = name2;
		age = age2;
	}
	
	
	//主函数
	public static void main(String[] args) {
		//创建对象
		Person person = new Person();
		person.say();
		
		//
		Person p2 = new Person("张三",23);
		p2.say();
	}
	
}
