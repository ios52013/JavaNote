package com.successful.chap03.sec03;

public class Demo8递归 {

	/**
	 * 非递归
	 * @param n
	 * @return
	 */
	//普通方法 计算 1*2*3*4***
	static long notDiGui(int n){
		long result = 1;
		//
		for(int i = 1; i<=n; i++){
			result *= i;
		}
		return result;
	}

	/**
	 * 递归
	 * @param args
	 */
	static long DiGui(int n){

		if(n == 1){
			return 1;
		}
		
		return DiGui(n-1)*n;

	}

	//主函数
	public static void main(String[] args) {
		System.out.println("非递归:"+Demo8递归.notDiGui(5));
		//调用递归方法
		System.out.println("递归:"+Demo8递归.DiGui(5));
	}


}
