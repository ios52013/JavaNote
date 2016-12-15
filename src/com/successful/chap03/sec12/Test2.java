package com.successful.chap03.sec12;
/**
 * 实现接口
 * 关键字是 implements 
 *
 */

//先继承类  后 实现接口
public class Test2 extends CH implements D{

	public void actionA(){
		//实现接口之后 就可以直接使用接口当的常量
		//System.out.println(A.TITLEA);
		System.out.println("这是实现了接口A当中的抽象方法");
	}
	
	

	//这是接口B的抽象方法
	@Override
	public void actionB() {
		// 
		System.out.println("实现了接口B的抽象方法");
	}
	
	
	//这是接口D的抽象方法
	@Override
	public void actionD() {
		System.out.println("接口D的抽象方法");
	}
	
	//主函数
	public static void main(String[] args) {
		Test2 test = new Test2();
		test.actionA();
		
		//因为TITLE是全局常量，所以继承实现接口的都可以直接访问
		System.out.println(Test2.TITLEA);
		
	    //调用接口B的方法 和 常量
		test.actionB();
		System.out.println(Test2.TITLEB);
		
		//调用CH类的方法
		test.actionC();
		
		
		//
		test.actionD();
	}



	
}
