
//这就是包
package com.successful.chap03.sec05;

import java.util.Scanner;

//需要用到第三章第三节里面的Person5
import com.successful.chap03.sec03.Person5;

public class TestDemo1 {

	public static void main(String[] args) {
		//同一个包里面的类 可以直接用 
		//创建对象
		Demo1 demo = new Demo1();
		
		//别人的私有属性 类外不可见  
		//demo.money = 900;
		
		//通过get、set方法可以访问私有属性
		demo.setMoney(9999);
		int money = demo.getMoney();
		System.out.println("我有"+money+"元！");

		//package的属性
		demo.name = "张三";
		
		//不同包的 需要导入相关类
		//创建对象 人   
		Person5 person = new Person5();
		
		//person.speak(18, sanWei);
	}
}
