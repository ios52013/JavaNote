package com.successful.chap02.sec04;

public class Demo6While99 {

	public static void main(String[] args) {
		// while循环 实现 99乘法表   
		
		//思路：9行9列  每一行的列数 跟行数相等
		
		int row = 1;
		int list = 1;
		
		//外层循环控制行  有多少行
		while(row <= 9){
			
			//每一行的列数 都是从第1列开始
			list = 1;
			
			//内层循环  控制有多少列
			while(list <= row){// 列数不能超过行数，最多和行数相等
				System.out.print(list+ "*" +row+ "=" +row*list +"\t");
				//输出完一列之后 列数自增
				list++;
			}
			//换行
			System.out.println();
			//输下一行
			row++;
		}
		
		
		
	}

}
