package com.successful.chap03.sec08;

//indexOf 方法使用示例
public class Demo6 {

	public static void main(String[] args) {
		
		String str = "abcdefgsdlnwelkijgrbt";
		//指定字符所出现第一次的位置
		int index = str.indexOf('d');
			
		System.out.println("字符d第一次在第"+index+"个索引位置。");
		System.out.println("索引从4开始，字符d第一次在第"+str.indexOf('d', 4)+"个索引位置。");
		System.out.println("从后面往回查找，字符g第一次在第"+str.lastIndexOf('g')+"个索引位置。");
		
	}
}
