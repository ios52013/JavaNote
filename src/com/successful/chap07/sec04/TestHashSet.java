package com.successful.chap07.sec04;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	//主函数
	public static void main(String[] args) {
		//创建一个Hash集合
		HashSet<String> hs = new HashSet<String>();
		//添加元素
		hs.add("张飞");
		hs.add("刘备");
		hs.add("关羽");
		hs.add("赵子龙");
		
		//遍历
		System.out.println("HashSet里面的元素是无序的...");
		Iterator<String> it = hs.iterator();
		while(it.hasNext()){
			String str = it.next();
			System.out.print(str+" ");
		}
		
		System.out.println();
		//再次添加 关羽
		hs.add("关羽");
		//再次遍历
		System.out.println("HashSet里面的元素是不重复的...");
		Iterator<String> it2 = hs.iterator();
		while(it2.hasNext()){
			String str = it2.next();
			System.out.print(str+" ");
		}
		
	}
	
	
}
