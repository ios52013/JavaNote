package com.successful.chap07.sec01;

public class Student {

	//属性
	private String name;
	private int age;
	
	//setter  getter 方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//构造方法
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
