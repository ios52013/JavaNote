package com.successful.chap03.sec09;

/**
 * 定义Dog类 继承Animal类  
 * extends是继承关键字
 * @author ruiloveqi
 *
 */
//               继承 关键字
public class Dog extends Animal {


	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setAge(3);
		dog.setName("Piter");
		dog.say();
		dog.eat();
		
	}
	
	
	
}
