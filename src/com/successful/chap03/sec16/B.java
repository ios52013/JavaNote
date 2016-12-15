package com.successful.chap03.sec16;

//这是B 类  实现了接口A

public class B implements A {

	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("这个类只是使用一次，为了实现接口A");
	}

	
}
