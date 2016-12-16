package com.successful.chap05.sec04;

import java.util.Arrays;

public class TestArrays {

	//主函数
	public static void main(String[] args) {
		
		/**
		 * 定义数组的方式有三种
		 */
		//法一  数组的长度为10  每个元素都是0
		int[] arr1 = new int[10];
		//法二  数组的长度由初始化的元素个数决定
		int[] arr2 = new int[] {1,2,3,4,5,6,7,8,9,0};
		//法三
		int arr3[] = {9,5,6,3,8};
		
		
		//定义一个整型数组
		int arr[] = {1,3,5,7,9,2,4,6,8,10};
		
		//遍历输出arr数组的元素
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n以上是普通的遍历");
		
		//Arrays
		String str = Arrays.toString(arr);
		System.out.println("利用Arrays的toString方法"
				+ "把数组以字符串的形式输出: "+ str);
		
		/**
		 * 给数组排序
		 */
		Arrays.sort(arr);
		System.out.println("排序后的数组："+Arrays.toString(arr));
		
		/**
		 * 二分法查询指定的某个数在数组中的下标
		 * 前提是这个数组要排好序的了，不然结果可能有误差
		 */
		int number = 7;
		int index = Arrays.binarySearch(arr, number);
		System.out.println(number +"在数组中的下标是："+index);
		
		/**
		 * 将指定内容 填充到数组中
		 */
		Arrays.fill(arr, 999);
		System.out.println("填充后的数组是："+ Arrays.toString(arr));
		
	}
	
	
	
}
