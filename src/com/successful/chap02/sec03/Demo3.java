package com.successful.chap02.sec03;

//自增自减运算符
public class Demo3 {

	public static void main(String[] args) {
		// 
		int a = 5;
		//后置++： 先运算，后自增
		int b = a++;
		//输出
		System.out.println("b = " + b);
		
		a = 5;
		//前置++： 先自增，后运算
		int c = ++a;
		System.out.println("c = " + c);
		
		/*
		 * 别忘记了赋值运算符 也是一种运算哦
		 * */
	}

}
