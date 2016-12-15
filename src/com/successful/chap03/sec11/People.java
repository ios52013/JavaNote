package com.successful.chap03.sec11;

//abstract修饰的是抽象类

public abstract class People {

	//属性
	public String name;
	//get  set 方法

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//方法
	public void say(){
		System.out.println("我的姓名叫:"+ this.getName());
	}
	
	/**
	 * 定义一个抽象方法  让子类去实现
	 * 职业
	 */
	public abstract void profession();
	
}
