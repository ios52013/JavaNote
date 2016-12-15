package com.successful.chap03.sec17;

public class Demo3 {

	public static void main(String[] args) {
		//用户输入的字符串
		String a = "1";
		String b = "2";
		System.out.println("如果直接是字符串的1和2相加:"+(a+b));
		//
		int m = Integer.parseInt(a);
		int n = Integer.parseInt(b);
		
		System.out.println("通过Integer的方法parseInt转换后相加："+(m+n));
		
	}
	
	
}
