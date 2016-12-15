package com.successful.chap02.sec04;

/**
 * 
 * 一个三位数的每一位的立方之和 等于该数  ，那这个数就是水仙花数
 *
 */
public class Demo5水仙花数 {

	public static void main(String[] args) {
		// 157;
		// 1^3 + 5^3 + 7^3 = ?
		
		for (int number = 100; number < 1000; number++) {
			//思路：分别拿到百位 十位  个位上的数
			int bai = number / 100;
			int shi = number % 100 /10;
			int ge = number % 10;
			
			//思路：如果每位数的立方之和 等于原来的数 那就输出
			if((bai*bai*bai + shi*shi*shi +ge*ge*ge) == number){
				System.out.println(number + " ");
			}
			
		}
		
		
		
	}

}
