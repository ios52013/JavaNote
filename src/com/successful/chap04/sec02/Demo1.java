package com.successful.chap04.sec02;

public class Demo1 {
	public static void main(String[] args) {
		//定义一个字符串
		String str = "123a";
		
		//捕捉异常
		try {
			//可能会出现异常的代码就放在这里面
			int a = Integer.parseInt(str);
			
			//如果不确定抛出什么类型的异常 可以直接写多几个catch
			
		}catch(NullPointerException e){
			System.out.println("这是NullPointerException异常");			

		}catch(NumberFormatException e){
			//打印错误的栈信息
			e.printStackTrace();
			System.out.println("这是NumberFormatException异常");
			
			// Exception 不能写最前面 因为范围是不断扩大的
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("这是Exception异常");
		}
		
		System.out.println("异常后面还能继续执行");
		
	}
}
