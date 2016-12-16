package com.successful.chap06.sec02;

/**
 * 这是一个泛型类
 * 限制了只有Animal或者它的子类才可以使用
 * @author ruiloveqi
 *
 */

public class DemoFanXing <T extends Animal>{

	//私有变量
	private T ob;
	//生成构造方法

	public DemoFanXing(T ob) {
		super();
		this.ob = ob;
	}
	//生成setter  getter方法

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
	
	
	/**
	 * 打印类型
	 */
	public void print(){
		System.out.println("T的实际类型是："+ ob.getClass().getName());
	}
	
	
}
