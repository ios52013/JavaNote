package com.successful.chap06.sec02;

public class Test {

	//主函数
	public static void main(String[] args) {
		DemoFanXing<Dog> demo1 = new DemoFanXing<Dog>(new Dog());
		//取值 获取了一个对象
		Dog dog = demo1.getOb();
		dog.print();
		
		DemoFanXing<Cat> demo2 = new DemoFanXing<Cat>(new Cat());
		//取值
		Cat cat = demo2.getOb();
		cat.print();
		
		/**
		 * 其他类型的不是继承自Animal类的，所以被限制了
		 */
		//DemoFanXing<Integer> demo3 = new DemoFanXing<Integer>(3);
		
		
	}
}
