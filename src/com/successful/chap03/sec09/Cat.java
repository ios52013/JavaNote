package com.successful.chap03.sec09;

//也是继承自 Animal类
public class Cat extends Animal{

	//
	private String address;
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 子类无参数构造方法
	 */
	public Cat() {
		super();
		// 
		System.out.println("子类无参数构造方法");
	}

	/**
	 * 子类有参构造方法
	 * @param name 姓名
	 * @param age  年龄
	 * @param address 地址
	 */
	public Cat(String name, int age, String address) {
		super(name, age);
		//
		this.address = address;
		System.out.println("子类有参构造方法");
	}

	
	/**
	 * 重写父类的eat方法
	 */
	public void eat(){
		System.out.println("我是一个小可爱的猫咪，我是吃鱼🐟的!我来自"+this.getAddress());
	}
	
	
	public static void main(String[] args) {
		//注意观察调用方法的顺序  先调用父类的构造方法 再调用自己的
		Cat cat = new Cat("Tom",2,"火星");
		
		cat.say();
		cat.eat();
	}
}
