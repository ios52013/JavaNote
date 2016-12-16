package com.successful.chap07.sec02;

import java.util.LinkedList;

/**
 * 链表
 * 
 *
 */

public class TestLinkedList {

	//封装查看列表元素的方法
	public static void printLinkedList(LinkedList<String> linkedList){
		System.out.println("链表中的元素：");
		//遍历
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.print(linkedList.get(i)+ " ");
		}
		System.out.println();
	}
	
	//主函数
	public static void main(String[] args) {
		 LinkedList<String> linkedList = new LinkedList<String>();
		 //添加元素
		 linkedList.add("葫芦娃");
		 linkedList.add("唐三藏");
		 linkedList.add("白骨精");
		 linkedList.add("奥特曼");
		 linkedList.add("白骨精");
		 
		 //查看链表中的元素
		 printLinkedList(linkedList);  
		 
		 //返回列表中指定元素首次出现的位置。如果不存在，返回-1
		 String str = "白骨精";
		 int index = linkedList.indexOf(str);
		 System.out.println(str + "在列表中首次出现的下标是："+ index);
		//查看链表中的元素
		 printLinkedList(linkedList);  
		 
		//获取但是并不移除列表中第一个元素,如果不存在就返回null
		 System.out.println("第一个元素："+linkedList.peekFirst());
		//查看链表中的元素
		 printLinkedList(linkedList);  
		 
		//获取并不移除列表中最后一个元素,如果不存在就返回null
		 System.out.println("最后一个元素："+linkedList.peekLast());
		//查看链表中的元素
		 printLinkedList(linkedList);  
		 
		//获取 并 移除列表中第一个元素,如果不存在就返回null
		 System.out.println("第一个元素："+linkedList.pollFirst());
		//查看链表中的元素
		 printLinkedList(linkedList);  
		 
	    //获取 并 移除列表de最后一个元素,如果不存在就返回null
		 System.out.println("第一个元素："+linkedList.pollLast());
		//查看链表中的元素
		 printLinkedList(linkedList);  
		 
		 
	}
	
}
