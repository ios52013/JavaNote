package com.successful.chap07.sec03;

import java.util.ArrayList;

import com.successful.chap07.sec01.Student;

public class TestForeach {

	//主函数
	public static void main(String[] args) {
		ArrayList<Student> arr = new ArrayList<Student>();
		arr.add(new Student("葫芦娃",7));
		arr.add(new Student("穿山甲",2));
		arr.add(new Student("老爷爷",99));
		arr.add(new Student("小蝴蝶",1));
		arr.add(new Student("山  神",9999));
		
		/**
		 * 利用foreach 来遍历集合
		 */
		
		
		for (Student stu : arr) {
			System.out.println("姓名:"+stu.getName()+" 年龄:"+stu.getAge());
		}
		
				
	}
	
	
}
