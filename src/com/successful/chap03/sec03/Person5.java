package com.successful.chap03.sec03;

/**
 * 三围类
 * @author ruiloveqi
 *
 */
class SanWei{
	//胸围
	int b;
	//腰围
	int w;
	//臀围
	int h;
	
}

/**
 * 人类
 * @author ruiloveqi
 *
 */

public class Person5 {

	//方法         传值  和  传地址
	public void speak(int age, SanWei sanWei){
		System.out.println("我今年"+age+"岁了。我的三围是:"+sanWei.b+","+sanWei.w+","+sanWei.h);
		age++;
		System.out.println("过了一年之后");
		sanWei.b += 10;
		sanWei.w -= 5;
		sanWei.h += 3;
	}
	
	public static void main(String[] args) {
		//创建对象
		Person5 zhangsan = new Person5();
		int age = 22;
		
		//创建三围
		SanWei sanWei = new SanWei();
		sanWei.b = 90;
		sanWei.w = 60;
		sanWei.h = 90;
		
		//调用方法 传参数   age是值传递 。  sanWei是 地址传递传入一个对象
		zhangsan.speak(age, sanWei);
		//
		System.out.println("第二年"+age+"岁了。我的三围是:"+sanWei.b+","+sanWei.w+","+sanWei.h);
		
		
	}
	
	
}
