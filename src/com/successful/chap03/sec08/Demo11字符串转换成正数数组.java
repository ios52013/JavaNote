package com.successful.chap03.sec08;

public class Demo11字符串转换成正数数组 {

	public static void main(String[] args) {
		//定义一个字符串
		String str = "1,3,5,7,9";
		
		//声明一个数组   固定长度 还不够灵活
		int[] array = new int[5];
		//作为数组的下标 给数组存数的时候用
		int index = 0;
		
		//遍历 转换
		for(int i = 0; i<str.length(); i++){
			//拿到每一个字符
			char ch = str.charAt(i);
			//判断是不是数字
			if(ch >= '0' && ch <= '9'){
				int number = ch - 48; //48是字符0的ASCII码
				//把整数添加到数组中
				array[index++] = number;
			}
			
		}
		
		System.out.println("转成整数数组后");
		//遍历输出 整数 数组
		for (int i : array) {
			System.out.print(i+" ");
		}
		
		
	}
}
