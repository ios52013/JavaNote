package com.successful.chap04.sec02;

public class Demo2_finally {
	
	//测试方法
	public static void testFinally(){
		String str = "123a";
		//
		try{
		   int a = Integer.parseInt(str);	
		   System.out.println(a);
		}catch(Exception e){
			e.printStackTrace();
			return ;
		}finally{
			//写在finally里面的代码都一定会执行到
			System.out.println("final end!");
		}
		
		//这句代码一定会执行到吗？
		//如果在捕捉异常的时候在catch里面有return 就不会
		//但是 即使在catch里面有return，只要写在finally里面的代码都一定会执行到
		System.out.println("异常后面的代码END");
		
	}
	
	//主函数
	public static void main(String[] args) {
		testFinally();
	}
	
}
