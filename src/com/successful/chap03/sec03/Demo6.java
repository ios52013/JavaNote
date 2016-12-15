package com.successful.chap03.sec03;

public class Demo6 {

	int add(int a, int b){
		System.out.println("这是方法一");
		return a+b;
	}

	/**
	 * 方法的重载，参数个数不一样
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	int add(int a, int b, int c){
		System.out.println("这是方法二,参数个数不同");
		return a+b+c;
	}

	/**
	 * 方法的重载 参数类型不一样
	 * @param a
	 * @param b
	 * @return
	 */
	int add(int a, String b){
		System.out.println("这是方法三");
		//Integer的类方法 把 字符串 转成 int数值
		return a + Integer.parseInt(b);
	}

	
	//返回值类型不一样 是不是 重载？？
	//不是！！！
	/*
	long add(int a, int b){
		return a+b;
	}
	*/
	
	//主函数
	public static void main(String[] args) {
		Demo6 demo = new Demo6();
		System.out.println(demo.add(2, 8));
		System.out.println(demo.add(3, 7, 10));
		//
		System.out.println(demo.add(12, "9"));
		
	}

}
