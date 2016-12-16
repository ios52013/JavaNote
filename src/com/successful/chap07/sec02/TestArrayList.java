package com.successful.chap07.sec02;

/**
 * 
 * 可变数组
 * 
 * 
 */

import java.util.ArrayList;

public class TestArrayList {

	//封装一个方法 查看集合的元素
	public static void printArrayList(ArrayList<String> arrList){
		System.out.println("当前集合的元素是：");
		//遍历
		for (int i = 0; i < arrList.size(); i++) {
			//通过下标拿出集合中的元素
			System.out.print(arrList.get(i) + " ");
		}
		System.out.println();
		
	}
	
	//主函数
	public static void main(String[] args) {
		//指定了集合所装元素的类型是String
		ArrayList<String> arrayList = new ArrayList<String> ();
		//添加元素
		arrayList.add("孙悟空");
		arrayList.add("沙和尚");
		arrayList.add("白龙马");
		
		//调用方法查看集合里面的内容
		printArrayList(arrayList);
		
		//将指定的元素插入到指定的位置
		arrayList.add(1, "猪八戒");
		printArrayList(arrayList);
		
		//将指定的元素替换指定位置上的元素
		arrayList.set(2, "牛魔王");
		printArrayList(arrayList);
		
		//移除列表中指定位置的元素
		arrayList.remove(2);
		printArrayList(arrayList);
	}
	
}
