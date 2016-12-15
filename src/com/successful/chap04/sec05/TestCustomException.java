package com.successful.chap04.sec05;

public class TestCustomException {

	//有可能会抛一个 CustomException 异常
	public static void test(int a) throws CustomException{
		double b = 1.0;
		if(0 == a){
			throw new CustomException("这是一个自定义的异常,分母不能为0");
		}
		
		System.out.println("您输入的数被1除转化成小数是:"+b/a);
		
	}
	
	/**
	 * 自定义异常 是为了项目中定义一套异常体系  比如说根据一些特定的参数
	 * @param args
	 */
	
	
	//主函数
	public static void main(String[] args) {
		
		//因为这是一个Exception异常 所以必须捕获
		try {
			test(0);
		} catch (CustomException e) {
			// 
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
