package com.successful.chap05.sec02;

public class TestString {

	//主函数
	public static void main(String[] args) {
		//创建字符串   不可变
		String str = "123";
		
		//其实此时str指向的是另外一个字符串了
		str += "abc";
		
		System.out.println(str);
	}
	
}
