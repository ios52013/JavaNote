package com.successful.chap03.sec13;

public class Test {
	
	//主函数
	public static void main(String[] args) {
		//创建对象
		Cat cat = new Cat();
		cat.say();
		
		Dog dog = new Dog();
		dog.say();
		
		//多态
		//父类引用指向 子类对象
		Animal animal = new Dog();
		animal.say();
		
		//随时更换子类对象
		animal = new Cat();
		animal.say();
		
	}
	
	
}
