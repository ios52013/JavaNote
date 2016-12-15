package com.successful.chap02.sec04;

public class Demo1选择语句if {

	public static void main(String[] args) {
		//声明一个整型变量
		int a = 10;
		
		//if语句
		if(a > 0){
		    System.out.println(a+"是正数！");	
		}
		
		//
		int b = 20;
		//if...else...语句
		if(b > 0){
			System.out.println(b+"是正数!");
		}else{
			System.out.println(b+"不是正数!");
		}
		
		int c = -30;
		//if...else if ...else 语句
		if(c > 0){
			System.out.println(c+"是正数!");
		}else if(c < 0){
			System.out.println(c+"是负数!");
		}else{
			System.out.println(c+"的值为0");
		}
		
		
	}

}
