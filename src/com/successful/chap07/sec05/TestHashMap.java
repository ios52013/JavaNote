package com.successful.chap07.sec05;

import java.util.HashMap;
import java.util.Iterator;

import com.successful.chap07.sec01.Student;

public class TestHashMap {

	//主函数
	public static void main(String[] args) {
		//字典    键     值
		HashMap<String,Student> hashMap = new HashMap<String,Student>();
		
		//添加元素
		hashMap.put("1号", new Student("赵子龙",23));
		hashMap.put("2号", new Student("关羽",25));
		hashMap.put("3号", new Student("张飞",20));
		hashMap.put("4号", new Student("马超",19));
		hashMap.put("5号", new Student("黄盖",28));
		
		/**
		 * 通过key 拿到 value值
		 *
		 */
		Student stu = hashMap.get("1号");
		System.out.println(stu.getName()+":"+stu.getAge());
		
		/**
		 * 遍历集合
		 */
		//拿到集合的keySet 所有的key的集合，然后再拿这个集合的迭代器
		Iterator<String> it = hashMap.keySet().iterator();
		//遍历
		while(it.hasNext()){
			//拿到key
			String strKey = it.next();
			//通过key 拿到value的值
			Student student = hashMap.get(strKey);
			System.out.println("key="+strKey+"value["+student.getName()+" 年龄:"+student.getAge()+"]");
			//System.out.println("姓名:"+student.getName()+" 年龄:"+student.getAge());
		}
		
		
	}
	
	/**
	 * HashTable   
	 * LinkedHashMap
	 */
	
}
