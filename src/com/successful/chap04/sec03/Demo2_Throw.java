package com.successful.chap04.sec03;

public class Demo2_Throw {

	//
	public static void testThrow(int a) throws Exception{
		
		//如果传入的参数是1 就不满足 所以就抛出异常
		if(a == 1){
			//直接抛出一个异常类
			throw new Exception("有异常");
		}
		//
		System.out.println("您传入的参数是:" + a);
	}
	
	
	
	
	//主函数
	public static void main(String[] args) {
		//Exception是检查型异常 。编译的时候就报错了
		//testThrow(2);
		
		//但是由于抛出来的是 Exception 必须要处理
		try {
			testThrow(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		//
		
		try {
			testThrow(9);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
