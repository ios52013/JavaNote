package com.successful.chap04.sec01;

/**
 *   异常
 * @author tarena
 *
 */
public class ExceptionDemo {

	public static void main(String[] args) {
		//定义一个字符串
		String str = "123a";
		//停止在异常这里了
		int a = Integer.parseInt(str);
		//以下的代码不能再继续执行 输出 
		System.out.println(a);
		
	}
	
	

}
