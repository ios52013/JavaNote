package com.successful.chap02.sec04;

import java.util.Scanner;

public class Demo9交换两个数 {

	public static void main(String args[]){
		//定义一个系统输入对象
		Scanner scan = new Scanner(System.in);
		
		//提示用户输入第一个数
		System.out.println("please input frist number：");
		//接收第一个数
		int a = scan.nextInt();
		
		//提示用户输入第二个数
		System.out.println("please input second number:");
		//接收第二个数
		int b = scan.nextInt();
		
		System.out.println("您输入的第一个数a是："+a+"   "+"第二个数b是："+b);
		System.out.println("交换后");
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("a = "+a + "   " +"b = "+b);
		
		
	}
	
	
}
