package com.successful.chap02.sec05;

public class Demo1数组 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//定义一个数组
		int []arr1;
		
		//定义一个数组
		int arr2[];
		
		//定义一个数组 并 静态初始化
		int []arr3 = new int[]{1,2,3,4,5};
		
		//普通的遍历数组
		for(int i = 0;i<arr3.length; i++){
			System.out.println(arr3[i]);
		}
		
		System.out.println("===foreach 方法遍历数组===");
		
		//foreach 方法遍历数组
		for (int k : arr3) {
			System.out.println(k);
		}
		
		
		System.out.println("====================");
		//定义一个数组 然后动态初始化，长度为3
		int arr4[] = new int[3];
		for (int i : arr4) {
			System.out.println(i);
		}
		
	}

}
