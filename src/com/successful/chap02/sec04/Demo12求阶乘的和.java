package com.successful.chap02.sec04;

public class Demo12求阶乘的和 {

	public static void main(String[] args) {
		
		// 求1!+2!+3!+...+10! 的值
		//5! = 5*4*3*2*1
		
//		for(int i = 1; i <= 3 ; i++){
//		   sum *= i; //1*2*3
//		}
		
		
		//1! = 1
		//2! = 2*1 = 2
		//3! = 3*2*1 = 6
		//4! = 4*3*2*1 = 24
		//5! = 5*4*3*2*1 = 120
		
		int sum = 0;
		//控制有多少个阶乘
		for (int i = 1; i <= 10; i++) {
			
		    int	jiechen = 1;
			//计算阶乘
			for(int k = i; k > 0; k--){
				jiechen *= k;
			}
			
			//每一个阶乘之和
			sum += jiechen;
		}
		
		System.out.println("1!+2!+3!+...+10! = "+sum);
		
	}

}
