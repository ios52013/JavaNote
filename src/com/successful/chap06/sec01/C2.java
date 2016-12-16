package com.successful.chap06.sec01;

public class C2 {

	//私有变量
	private String str;
	//生成构造方法

	public C2(String str) {
		super();
		this.str = str;
	}
	//生成setter getter方法

	public String getStr() {
		return str;
	}
    //setter
	public void setStr(String str) {
		this.str = str;
	}
	
	/**
	 * 打印str的类型
	 */
	public void print(){
		
		System.out.println("变量str的类型是："+ str.getClass().getName());
	}
	
}
