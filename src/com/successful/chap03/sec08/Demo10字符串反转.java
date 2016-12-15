package com.successful.chap03.sec08;

public class Demo10字符串反转 {

	public static void main(String[] args) {
		// 
		String str = "abcdefg";
		System.out.println("原字符串:"+str);
		
		String ch = "";
		System.out.println("准备反转:"+ch+"这是存储新的字符");
		//从字符串后面往回 逐个拿到字符 然后拼接
		for(int i=str.length()-1; i>=0; i--){
			ch += str.charAt(i);
		}
		System.out.println("反转后:"+ch);
	}

}
