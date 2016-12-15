package com.successful.chap03.sec08;

public class Demo7 {

	//substring的用法
	public static void main(String[] args) {
		String str = "不开心每一天,可能吗？";
		System.out.println(str);
		//截取字符串 从指定下标开始
		String str1 = str.substring(1);
		System.out.println(str1);
		
		//指定范围的截取
		String str2 = str.substring(1, 6);
		System.out.println(str2);
	}
}
