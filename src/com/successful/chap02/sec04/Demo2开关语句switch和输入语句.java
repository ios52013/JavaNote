package com.successful.chap02.sec04;

//导入头文件
//快捷键：ctrl+shift+ o
import java.util.Scanner;

//类  
public class Demo2开关语句switch和输入语句 {
//主函数
	public static void main(String[] args) {
		// 
		System.out.println("***************************");
		System.out.println("   中国工商银行横岗支行ATM");
		System.out.println("1、存款               2、查询");
		System.out.println("3、转账               4、取款");
		System.out.println("5、改密               6、其他");
		System.out.println("***************************");
		System.out.println("请选择您需要的操作：");
		//这个输出不换行 注意
		System.out.print(">>");
		
		//定义一个系统输入对象
		Scanner scanner = new Scanner(System.in); 
		//保存用户输入的
		int select = scanner.nextInt();
		//输出看看是否已经保存
		System.out.println("客官您刚刚选择的是:"+select);
		
		//练习switch语句
		switch(select){
		case 1:
			System.out.println("大爷您要存款多少亿呀~~😄");
			break;
		case 2:
			System.out.println("余额已不足查询不到~~请存款再查吧!");
			break;
		case 3:
			System.out.println("大哥您要转账也得先有钱呀,请存款吧!");
			break;
		case 4:
			System.out.println("你个穷X一毛钱都没有怎么取款呀？还是继续撸代码吧~~");
			break;
		case 5:
			System.out.println("掌柜的您账户一分钱都没有,很安全的哈~~😜");
			break;
		case 6:
			System.out.println("亲,我行新推出一款新政策,只要存款2000w就可以送过期酸奶一箱~~");
			break;
		default :
			System.out.println("您是猴子🐒派来捣蛋的吗？");
		}
		
		
	}

}
