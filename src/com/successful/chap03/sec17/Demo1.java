package com.successful.chap03.sec17;

public class Demo1 {
	
	//主函数
	public static void main(String[] args) {
		
		//声明一个基本数据类型int的变量
		int age = 98;
		//装箱  把基本类型的变量  封装成 对象
		Integer i = new Integer(age);
		
		//拆箱
		int  b = i.intValue();
		
		//输出
		System.out.println("age="+age+" i="+i+" b="+b);
		
		
	}
}
