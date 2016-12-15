package com.successful.chap04.sec04;

public class Demo1 {

	/**
	 * 运行时异常，编译时候不检查,也可以不使用try...catch捕获
	 * @throws RuntimeException
	 */
	//抛异常
	public static void testRuntimeException() throws RuntimeException{
		int a = 3;
		int b = 0;
		int c = a/b;
		//
		//throw new RuntimeException();
	}

	/**
	 * Exception异常，编译时会检查，必须使用try...catch捕获
	 * @throws Exception
	 */
	public static void testException() throws Exception{
		int a = 3;
		int b = 0;
		if (0 == b){
			throw new Exception("分母不能为0");
		}
		int c = a/b;

	}

	//主函数
	public static void main(String[] args) {

		System.out.println("运行时异常  我们可以不捕获");
		//运行时异常  我们可以不捕获
		//testRuntimeException();

		//但是不捕获的话，下面的代码如果还有异常就不会抛出，所以最好还是try...catch
		try {
			testRuntimeException();
		} catch (Exception e) {
			e.printStackTrace();
		}

		//
		try {
			testException();
		} catch (Exception e1) {
			e1.printStackTrace();
		}


	}



}
