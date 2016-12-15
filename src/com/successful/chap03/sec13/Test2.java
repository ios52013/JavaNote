package com.successful.chap03.sec13;

public class Test2 {
	
	//主函数
	public static void main(String[] args) {
		
		//多态
		//父类引用指向 子类对象
		Animal2 animal = new Dog2();
		animal.say2();
		
		//向下转型一
		Dog2 dog2 = (Dog2)animal;
		dog2.say2();
		
		//向下转型二  不安全  因为子类有的方法 父类不一定有
		Cat2 cat2 = (Cat2)animal;
		cat2.say2();
		
		
	}
	
	
}
