package com.successful.chap03.sec06;

public class Outer2 {

	private int age = 23;
	
	/**
	 * 定义内部类
	 * @author ruiloveqi
	 *
	 */
	class Inner{
		//内部类的方法
		public void show(){
			//直接就可以使用外部类的属性
			System.out.println("我今年"+age+"岁了!");
		}
	}
	
	
	
	//主函数
	public static void main(String[] args) {
		//创建外部类对象
		Outer2 outer = new Outer2();
		
		//通过外部类 来创建 内部类对象
		Outer2.Inner inner = outer.new Inner();
		
		inner.show();
	}
}
