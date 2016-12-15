package com.successful.chap03.sec11;

public class TestPeople {

	//主函数
	public static void main(String[] args) {
		//抽象类 不能够实例化 
		//People people = new People();
		
		//子类是可以实现的
		Student stu = new Student();
		stu.setName("小菜鸟");
		stu.say();
		stu.profession();
		
		//
		Teacher teacher = new Teacher();
		teacher.setName("苍井空");
		teacher.say();
		teacher.profession();
		
	}
	
}
