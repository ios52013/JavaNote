package com.successful.chap03.sec15;

public class Test {

	//
	public static void doSomeThing(Animal animal){
		//不管是父类还是子类 对象 都有一个say方法
		animal.say();
		//向下转型
		if(animal instanceof Dog){//判断如果是Dog
			((Dog) animal).myName();
		}
		
		//判断多态是属于哪一类 这样一来向下转型 就安全多了
		if(animal instanceof Cat){
			((Cat) animal).eat();
		}
		
	}
	
	//主函数
	public static void main(String[] args) {
		//多态的体现  父类引用指向子类对象
		Animal dog = new Dog();
		//
		System.out.println("dog对象是否属于Animal类: "+(dog instanceof Animal));
		System.out.println("dog对象是否属于Dog类: "+(dog instanceof Dog));
		System.out.println("dog对象是否属于Cat类："+(dog instanceof Cat));
		
		//在这静态方法里面必须 调用 静态方法
		doSomeThing(new Dog());
		doSomeThing(new Cat());
		
	}
	
	
}
