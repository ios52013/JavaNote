package com.successful.chap02.sec04;

public class Demo4循环 {

	public static void main(String[] args) {
		//在控制台输出1-100
		//while循环
		int i = 1;
		while (i < 101) {
			System.out.print(i+"  ");
			
			//每10个换一行
			if(i % 10 == 0){
				System.out.println();
			}
			
			//条件
			i++;
			
		}
		
		System.out.println("==============================");
		
		int k = 1;
		//do...while
		do {
			//输出
			System.out.print(k+ " ");
			//循环的条件
			k++;
			
			if(k%10 == 0){
				System.out.println();
			}
		} while (k <= 100);//满足条件继续循环
		
		
		
		//法三
		System.out.println("==============================");
		
		for (int a = 1; a < 101; a++) {
			System.out.println("这是循环第"+ a +"次!");
		}
		
		
		
	}

}
