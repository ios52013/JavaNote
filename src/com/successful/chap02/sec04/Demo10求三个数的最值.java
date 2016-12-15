package com.successful.chap02.sec04;

import java.util.Scanner;

public class Demo10求三个数的最值 {

	public static void main(String[] args) {
	
		//声明系统输入对象
		Scanner scan = new Scanner(System.in);
		//
		System.out.println("请输入第一个数:");
		int a = scan.nextInt();
		
		System.out.println("请输入第二个数:");
		int b = scan.nextInt();
		
		System.out.println("请输入第三个数:");
		int c = scan.nextInt();
		
		
		//求最大值
		if(a > b){
			if(a > c){
				System.out.println("最大值是:"+a);
			}else{
				System.out.println("最大值是:"+c);
			}
			
		}else{
			if(b>c){
				System.out.println("最大值是:"+b);
			}else{
				System.out.println("最大值是:"+c);
			}
		}
		
		

		//求最小值
		if(a < b){
			if(a < c){
				System.out.println("最小值是:"+a);
			}else{
				System.out.println("最小值是:"+c);
			}
			
		}else{
			if(b<c){
				System.out.println("最小值是:"+b);
			}else{
				System.out.println("最小值是:"+c);
			}
		}
		
		
		
		/*
		 * 如果有更多的数据呢？那就数组
		 * 有没有更简洁的办法？？
		 * */
		
		
		
	}
	
	
}
