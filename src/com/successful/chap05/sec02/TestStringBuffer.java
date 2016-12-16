package com.successful.chap05.sec02;

/**
 * 可变字符串
 * @author ruiloveqi
 *
 */

public class TestStringBuffer {

	//主函数
	public static void main(String[] args) {
		//创建一个字符串
		StringBuffer str = new StringBuffer("abc");
		System.out.println("原来的字符串："+str);
		
		//在原有的字符串上 追加拼接 字符串
		str.append("1234567");
		System.out.println("拼接后的字符串："+str);
		
		
	}
}
