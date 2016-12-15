package com.successful.chap02.sec04;

public class Demo11求和1到100 {

	public static void main(String[] args) {
		//求1+2+3+...+99+100的和

		//声明一个计数器
		int i = 0;
		//声明一变量保存和
		int sum = 0;

		//法一
		for (i = 1; i < 101; i++) {
			sum += i;
		}
		//输出结果
		System.out.println("1+2+3+...+100 = " + sum);

		//法二
		i = 1;
		sum = 0;
		while(i <= 100){
			sum += i;
			i++;
		}
		//输出结果
		System.out.println("1+2+3+...+100 = " + sum);



		//法三
		i = 1;
		sum = 0;
		//
		do{
			sum += i;
			i++;
		}while(i <= 100);
		//输出结果
		System.out.println("1+2+3+...+100 = " + sum);


	}

}
