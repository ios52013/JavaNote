package com.successful.chap03.sec09;


//动物类 
public class Animal {
	
	
	//私有属性
	private String name;
	private int age;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
    /**
     * 无参构造方法
     */
	public Animal(){
		System.out.println("父类无参数构造方法!");
	}
	
	/**
	 * 有参构造方法
	 * @param name 姓名
	 * @param age  年龄
	 */
	public Animal(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println("父类有参构造方法!");
	}
	
	
	
	//方法
	public void say(){
		System.out.println("我是一个动物，我的姓名叫:"+this.getName()+" 年龄"+this.getAge()+"岁了");
	}
	
	public void eat(){
		System.out.println("动物会吃东西!");
	}
	
	
}
