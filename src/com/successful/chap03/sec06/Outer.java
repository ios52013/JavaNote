package com.successful.chap03.sec06;

public class Outer {

	private int age = 19;
	
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
	
	//外部类的方法
	public void show(){
		//在这里创建内部类对象
		Inner inner = new Inner();
		inner.show();
	}
	
	//主函数
	public static void main(String[] args) {
		//创建外部类对象
		Outer outer = new Outer();
		outer.show();
	}
}
