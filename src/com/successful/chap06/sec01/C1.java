package com.successful.chap06.sec01;

public class C1 {

	//私有变量
	private Integer a;
	//生成构造方法
	public C1(Integer a) {
		super();
		this.a = a;
	}
	
	//生成setter getter方法
	public Integer getA() {
		return a;
	}

	public void setA(Integer a) {
		this.a = a;
	}
	
	/**
	 * 打印a的类型
	 */
	public void print(){
		System.out.println("变量a的类型是："+ a.getClass().getName());
	}
	
}
