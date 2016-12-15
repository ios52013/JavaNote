package com.successful.chap03.sec14;

public class People {

	//属性
	private String name;

	//get set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	
	//构造方法
	
	public People(String name) {
		this.name = name;
	}
	
	
	//要实现打印对象的时候 输出的是 名字 
	//那么就需要重写 toString方法
	
	@Override
	public String toString() {
		//
		return this.getName();
	}
	
	//现在有个需求就是比较p1和p2的时候，只要名字相同就返回true
	//那么就需要重写 equals 方法
	@Override
	public boolean equals(Object obj) {
		//只需要比较属性
		String name = ((People)obj).getName();
		//
		System.out.println("传入对象的姓名属性的值是:"+name);
		//
		return this.name == name;
	}
	
	
	//主函数
	public static void main(String[] args) {
		People p1 = new People("张三");
	    System.out.println(p1);
	    
	    //打印一个类  默认的就是调用toString方法
	    System.out.println(p1.toString());
	    
	    //创建新的对象
	    People p2 = new People("张三");
	    //如果没有重写equals方法 那么比较的就是对象 而不是属性
	    
	    boolean b1 = p2.equals(p1);
	    System.out.println(b1);
	}


}
