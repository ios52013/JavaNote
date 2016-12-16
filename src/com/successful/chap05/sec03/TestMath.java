package com.successful.chap05.sec03;

public class TestMath {

	//主函数
	public static void main(String[] args) {
		int a = 10, b = 20;
		/**
		 * 求最值
		 */
		System.out.println(a+ "和" + b + "之间最大值是："+ Math.max(a, b));
		System.out.println(a+ "和" + b + "之间最小值是："+ Math.min(a, b));
		
		/**
		 * 四舍五入
		 */
		double p = 12.8;
		System.out.println(p+ " 四舍五入之后是："+Math.round(p));
		
		/**
		 * 求次幂
		 */
		int m = 2, n = 5;
		System.out.println(m + "的"+ n +"次方是："+ Math.pow(m, n));
		
		/**
		 * 求平方根
		 */
		
	}
	
	
}
