package com.successful.chap04.sec05;

/**
 * 自定义异常类,继承于Exception
 * @author tarena
 *
 */

public class CustomException extends Exception{
	//构造方法
	public CustomException(String message){
		//调用父类的
		super(message);
	}
	
	
}
