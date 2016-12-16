package com.successful.chap06.sec01;

public class C3 {

	//私有变量
	private Object ob;
	//生成构造函数

	public C3(Object ob) {
		super();
		this.ob = ob;
	}


	//生成setter getter方法
	public Object getOb() {
		return ob;
	}

	public void setOb(Object ob) {
		this.ob = ob;
	}
	
	/**
	 * 打印ob的类型
	 */
	public void print(){
		System.out.println("ob的类型是："+ob.getClass().getName());
	}
	
}
