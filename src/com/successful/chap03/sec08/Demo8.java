package com.successful.chap03.sec08;

public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "I love you very much,Do you know?";

		System.out.println("原字符串");
		System.out.println(str);
		
		//转换成大写字符
		String str2 = str.toUpperCase();
		System.out.println("转换后");
		System.out.println(str2);
		
		//转换成小写
		String lowerStr = str2.toLowerCase();
		System.out.println("转换成小写\n"+lowerStr);
	}

}
