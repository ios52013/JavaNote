package com.successful.chap03.sec16;

public class Test {

	//测试
	public void test(A a){
		a.action();
	}
	
	//主函数
	public static void main(String[] args) {
		//创建对象调用测试方法
		Test t = new Test();
		t.test(new B()); //这样B类只是使用一次
		
		//引入了 匿名内部类
		t.test(new A(){

			@Override
			public void action() {
				// TODO Auto-generated method stub
				System.out.println("使用了匿名内部类，直接new一个接口或者抽象类");
			}
			
		});
		
		
		
	}
	
	
}
