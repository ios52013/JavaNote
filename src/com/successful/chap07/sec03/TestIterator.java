package com.successful.chap07.sec03;

import java.util.Iterator;
import java.util.LinkedList;

import com.successful.chap07.sec01.Student;

public class TestIterator {

	///
	public static void main(String[] args) {
		//创建链表
		LinkedList<Student> list = new LinkedList<Student>();
		list.add(new Student("张三",18));
		list.add(new Student("李四",20));
		list.add(new Student("王五",19));
		list.add(new Student("赵六",21));
		list.add(new Student("田七",18));

		/**
		 * Iterator 遍历集合
		 */
		//利用迭代器遍历
		Iterator<Student> it = list.iterator();
		
		while(it.hasNext()){
			//返回迭代的下一个元素
			Student stu = it.next();
			System.out.println(stu.getName()+" "+stu.getAge());
		}
		
		
		
		
	}
	
	
}
