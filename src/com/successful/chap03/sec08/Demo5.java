package com.successful.chap03.sec08;

public class Demo5 {

	public static void main(String[] args) {
		String name = "张三丰";
		char ming = name.charAt(2);
		System.out.println("名字叫:"+ming);
		
		String str = "钓鱼岛是中国的";
		//遍历输出每一个字符
		for(int i=0; i<str.length();i++){
			System.out.println(str.charAt(i));
		}
			
	}
}
