package com.successful.chap03.sec10;

public class People {

	//被final修饰的变量 不能被修改，作为常量
	public final String sex = "男";
	
	
	/**
	 * 被final修饰的方法 不能被子类修改覆盖
	 * 
	 */
	public final void action(){
		//被final修饰的变量 不能被修改，作为常量
		//sex = "女";
		
		System.out.println("做一个三好学生四号青年五大杰出人物!");
	}
	
	//主函数
	public static void main(String[] args) {
		//调用静态常量
		System.out.println(Common.SOMETIME);
	}
}
