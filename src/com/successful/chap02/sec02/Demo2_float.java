package com.successful.chap02.sec02;

public class Demo2_float {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//声明一个单精度浮点类型
		//这里会有报错 提示不能从double转换成float类型，也就是说在小数默认是double类型的
		//float a = 3.14;

		//在小数后面加上一个 f 表示是float类型
		float b = 3.1415f;

		//输出
		System.out.println("b = "+b);


		//声明一个double类型的变量 并赋值
		double c = 1.999;
		//快捷键是：syso  然后Alt "+" /
		System.out.println("c = "+c);

		//提示：Alt + / 



		//补充
		//获取float的最大值
		float maxFloat = Float.MAX_VALUE;
		System.out.println("maxFloat = "+maxFloat);


		//输出double类型的最大值
		double maxDouble = Double.MAX_VALUE;
		System.out.println("maxDouble = "+ maxDouble);

		//输出double类型的最小值
		double minDouble = Double.MIN_VALUE;
		System.out.println("minDouble = "+ minDouble);


	}

}
