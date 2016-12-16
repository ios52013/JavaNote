package com.successful.chap07.sec01;

/**
 * 引入集合
 */
import java.util.LinkedList;

public class Demo {

	//主函数
	public static void main(String[] args) {
		//定义一个数组 长度是固定了
		Student student[] = new Student[3];
		Student s1 = new Student("张三",18);
		Student s2 = new Student("李四",19);
		Student s3 = new Student("王五",20);
		
		//以上是数组的，如果再想添加一个学生 那就要修改数组的长度了
		
		//现在引入集合  随时可以增删改查
		//链表
		LinkedList<Student> list = new LinkedList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		//遍历
		for (int i = 0; i < list.size(); i++) {
			//根据索引把对象取出来
			Student stu = list.get(i);
			System.out.println(stu.getName()+"今年"+stu.getAge()+"岁了");
		}
		
		
	}
	
	
}
