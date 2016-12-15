package com.successful.chap04.sec03;

public class Demo1_Throws {

	/**
	 * 把异常向外面抛
	 * 在这里可能会有异常的，但是我在这里不处理，
	 * 一层层往上抛throws 抛到方法调用处去处理
	 * @throws NumberFormatException
	 */

	public static void testThrows() throws NumberFormatException{
				String str = "123a";
				int a = Integer.parseInt(str);
				System.out.println(a);			
	}
	
	//主函数
	public static void main(String[] args) {
		
		try{
			testThrows();
			System.out.println("Here");
			
		}catch(Exception e){
			System.out.println("我们在catch这里处理了异常");
			e.printStackTrace();
		}
		
		
		
		System.out.println("I'm Here");
		
	}
	
	
}
