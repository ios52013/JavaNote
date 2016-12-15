package com.successful.chap03.sec03;

import java.util.Scanner;


public class Demo9斐波那契数列 {

	/**
	 * 用递归实现
	 * 1、1、2、3、5、8、13、21、、、、、
	 * 
	 * F(1) = 1, F(2) = 1
	 * F(N) = F(N-1)+F(N-2)
	 */
	//求一个斐波那契数的方法
	static int FeiBo(int n){
		//第一个 和 第二个 都是1
		if(n<=2){
			return 1;
		}
		//第三个数开始是前面两个数之和
		return FeiBo(n-1)+FeiBo(n-2);
	}
	
	
	//主函数
	public static void main(String[] args) {
		//
		System.out.println("亲,您想我输出多少个斐波那契数列呀?");
		
		Scanner scann = new Scanner(System.in);
		int count = scann.nextInt();
		
		//循环输出每一个数
		for(int i = 1; i<=count; i++){
			System.out.print(Demo9斐波那契数列.FeiBo(i) + "\t");
			//
			if(0 == i%10){
				System.out.println();
			}
			
		}
		
	}
	
}
