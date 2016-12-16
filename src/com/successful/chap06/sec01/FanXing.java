package com.successful.chap06.sec01;

/**
 * 定义泛型类
 * 要在类名后面用尖括号括起来 加上代表泛型的字母  一般会用T  （Type）
 * @author ruiloveqi
 *
 */
public class FanXing <T> {

	//声明变量
	private T ob;//要在运行的时候才知道是什么类型
	//生成构造方法

	public FanXing(T ob) {
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
