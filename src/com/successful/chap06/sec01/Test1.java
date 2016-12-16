package com.successful.chap06.sec01;

/**
 * 目的是为了传入不同类型的对象参数  打印出类型
 * @author ruiloveqi
 *
 */
public class Test1 {

	//main主函数
	public static void main(String[] args) {
		//begin test C1
		C1 c1 = new C1(3);
		c1.print();
		
		//通过get方法可以获取上面传入的参数
		int i = c1.getA();
		System.out.println("刚刚传入的参数是："+i);
		//end test C1
		
		//begin test C2
		C2 c2 = new C2("Hello");
		c2.print();
		String k = c2.getStr();
		System.out.println("创建c2的时候传入的是："+ k);
		//end test C2
		
		/**
		 * 上面是用2个类来实现的
		 * 我们都知道Object是所有类的父类
		 */
		//begin test C3
		C3 c3 = new C3(1);//会自动向上转型
		c3.print();
		//获取值  要向下转型（有时候会报错）
		int i3 = (int) c3.getOb();
		System.out.println("i3 = "+ i3);
		
		C3 c31 = new C3("你好");//向上转型
		c31.print();
		//向下转型
		String s31 = (String) c31.getOb();
		System.out.println("s31 = "+ s31);
		//end test C3
		
		System.out.println("========泛型=========");
		/**
		 * 以上用Object 在打印类型的时候是方便了一个类就能实现打印好多个类型的。
		 * 但是在获取值的时候就有点麻烦
		 * 所以这时候引出了泛型
		 */
		//begin test FanXing
		//尖括号 是指定类型的
		FanXing<Integer> fx1 = new FanXing<Integer>(30);
		fx1.print();
		//取值的时候不用转类型了
		Integer f1 = fx1.getOb();
		System.out.println("f1 = "+ f1);
		
		//字符串类型的
		FanXing<String> fx2 = new FanXing<String>("我爱锐哥，泛型好简单");
		fx2.print();
		//取值
		String f2 = fx2.getOb();
		System.out.println("f2 = "+ f2);
		//end test FanXing
		
	}
}
