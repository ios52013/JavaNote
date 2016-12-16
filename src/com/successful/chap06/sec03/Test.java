package com.successful.chap06.sec03;

import com.successful.chap06.sec02.Animal;
import com.successful.chap06.sec02.Cat;
import com.successful.chap06.sec02.DemoFanXing;
import com.successful.chap06.sec02.Dog;

/**
 * 通配符泛型
 * @author ruiloveqi
 *
 */
public class Test {

	/*
	 * 
	//这Animal是动物类的
	public static void take(Animal a){
		a.print();
	}
	
	//主函数
	public static void main(String[] args) {
		//利用泛型 创建一个Dog对象
		DemoFanXing<Dog> dog = new DemoFanXing<Dog>(new Dog());
		take(dog);
		//这是一个泛型的Dog对象，但是take的参数是Animal对象所以不符合
		//如果把take函数的参数改成泛型的指定Dog就可以了，可是传入Cat对象的时候又不合适
		
	}
	
	*/
	
	/**
	 * 引入了 通配符泛型  用一个问号？来表示
	 * @param a
	 */
		public static void take(DemoFanXing<?> a){
			a.print();
		}
		
		//主函数
		public static void main(String[] args) {
			//利用泛型 创建一个Dog对象
			DemoFanXing<Dog> dog = new DemoFanXing<Dog>(new Dog());
			take(dog);
			//这是一个泛型的Dog对象，但是take的参数是Animal对象所以不符合
			//如果把take函数的参数改成泛型的指定Dog就可以了，可是传入Cat对象的时候又不合适
			//所以此时引入了
			//通配符泛型 用问号表示？
			
			DemoFanXing<Cat> cat = new DemoFanXing<Cat>(new Cat());
			take(cat);
			
			//
			DemoFanXing<Animal> animal = new DemoFanXing<Animal>(new Animal());
			take(animal);
		}
		
	
	
}
