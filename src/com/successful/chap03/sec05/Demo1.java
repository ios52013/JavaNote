
//
package com.successful.chap03.sec05;

public class Demo1 {

	/**
	 * 定义一个私有的属性  对外是不可见的
	 */
	private int money;
	
	/**
	 * 
	 * 定义一个包的访问权限的属性  默认的是package属性？
	 * 
	 */
	 String name;
	
	
	
	//提供共有的方法可以访问  getter方法
	public int getMoney(){
		return money;
	}
	
	public void setMoney(int money){
		this.money = money;
	}
}
