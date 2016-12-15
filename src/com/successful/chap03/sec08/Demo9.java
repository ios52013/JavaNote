package com.successful.chap03.sec08;

public class Demo9 {

	public static void main(String[] args) {
		String str = "  aBc d2 31e %$ # *( fghijk45  ";
		System.out.print(str);
		System.out.println("原来的字符串");
		
		//去掉前后空白 
		String str1 = str.trim();
		System.out.println(str1+"这是去掉前后空白后的");
		
		int yingWenCount = 0;
		int shuZi = 0;
		int kongGe = 0;
		int QiTa = 0;
		//遍历统计
		for(int i=0; i<str1.length(); i++){
			//拿出每一个字符
			char ch = str1.charAt(i);
			//判断英文字符
			if((ch>='a' && ch <= 'z') || (ch>='A' && ch<='Z')){
				yingWenCount++;
				System.out.println("英文字符:"+ch);
				
			}else if(ch>='0' && ch<='9'){//判断数字
				shuZi++;
				System.out.println("数字:"+ch);
				
			}else if(ch == ' '){//判断空格
			    kongGe++;
			    System.out.println("空格:"+ch);
			}else{
				QiTa++;
				System.out.println("其他字符:"+ch);
			}
			
		}
		
		
		//
		System.out.println("\n\n总数：");
		System.out.println("英文字符:"+yingWenCount);
		System.out.println("数字:"+shuZi);
		System.out.println("空格:"+kongGe);
		System.out.println("其他字符:"+QiTa);
	}
}
