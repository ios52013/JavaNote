package com.successful.chap02.sec04;

import java.util.Scanner;

public class Demo3练习 {

	public static void main(String[] args) {
		//
		System.out.println("请输入月份:");

		//定义一个系统输入对象
		Scanner scan = new Scanner(System.in);

		//接受用户输入的数
		int month = scan.nextInt();

		//法一  if
		if(1 == month){
			System.out.println("现在是1月份!");
		}else if(2 == month){
			System.out.println("现在是2月份!");
		}else if(3 == month){
			System.out.println("现在是3月份!");
		}else if(4 == month){
			System.out.println("现在是4月份!");
		}else if(5 == month){
			System.out.println("现在是5月份!");
		}else if(6 == month){
			System.out.println("现在是6月份!");
		}else if(7 == month){
			System.out.println("现在是7月份!");
		}else if(8 == month){
			System.out.println("现在是8月份!");
		}else if(9 == month){
			System.out.println("现在是9月份!");
		}else if(10 == month){
			System.out.println("现在是10月份!");
		}else if(11 == month){
			System.out.println("现在是11月份!");
		}else if(12 == month){
			System.out.println("现在是12月份!");
		}else{
			System.out.println("没有这个月份!");
		}

		
		System.out.println("=======以下是用switch语句实现的======");

		//法二、switch
		switch (month) {
		case 1:
			System.out.println("现在是1月份!");
			break;
		case 2:
			System.out.println("现在是2月份!");
			break;
		case 3:
			System.out.println("现在是3月份!");
			break;
		case 4:
			System.out.println("现在是4月份!");
			break;
		case 5:
			System.out.println("现在是5月份!");
			break;
		case 6:
			System.out.println("现在是6月份!");
			break;
		case 7:
			System.out.println("现在是7月份!");
			break;
		case 8:
			System.out.println("现在是8月份!");
			break;
		case 9:
			System.out.println("现在是9月份!");
			break;
		case 10:
			System.out.println("现在是10月份!");
			break;
		case 11:
			System.out.println("现在是11月份!");
			break;
		case 12:
			System.out.println("现在是12月份!");
			break;

		default:
			System.out.println("被捣蛋了哈!");
			break;
		}

		//法三、System.out.println("现在是"+ month +"月份!");

	}

}
