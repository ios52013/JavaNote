package com.successful.chap03.sec03;

public class Person4 {

	// 参数之间用逗号隔开 
	//有多个参数  不定个数的  格式  用三个点...
	int speak(String name, int age,String ...hobbies){
		System.out.println("我叫"+name+" 我今年"+age+"岁了!");
		
		System.out.println("我的爱好有："); 
		//遍历
		for (String hobby : hobbies) {
			System.out.print(hobby + " ");
		}
		
		//获取爱好的个数
		int totalHobbies = hobbies.length;
		return totalHobbies;
				
	}
	
	
	public static void main(String[] args) {
		//定义一个Person对象
		Person4 zhangsan = new Person4();
		int count = zhangsan.speak("张三", 19, "撸代码","唱歌","看电视","旅游");
		System.out.println("\n张三有"+count+"个爱好!");
		
	}
	
}
