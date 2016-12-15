package com.successful.chap02.sec05;

import java.util.Scanner;

public class Demo2二维数组 {

	public static void main(String[] args) {
		//定义一个二维数组
		int [][]arr1;
		//
		int arr2[][];

		//定义一个二维数组，并静态初始化
		int [][]arr3 = new int[][]{{1,2,3,4},{2,2,3,4},{3,2,3,4}};

		//遍历二维数组，先获取总行数
		for(int i = 0; i<arr3.length; i++){

			//arr3[0].length 第一行的长度 也就是 所有的列
			for(int k = 0; k<arr3[0].length; k++){ 
				//输出  第i行 第k列
				System.out.print(arr3[i][k] + " ");
			}

			//输完一行的所有列之后  换行
			System.out.println();
		}

		System.out.println("==========二维数组动态初始化========");

		//二维数组的动态初始化 3行4列
		int [][]arr4 = new int[3][4];
		//用快速遍历
		for (int[] is : arr4) {

			//遍历一行当中的所有列
			for (int i : is) {
				System.out.print(i + " ");
			}

			//换行
			System.out.println();
		}
		System.out.println("==========二维数组动态初始化========");


		Scanner scan = new Scanner(System.in);
		for(int i = 0; i<arr4.length; i++){

			for(int k = 0; k<arr4[0].length; k++){
				System.out.println("请输入第"+i+"行，第"+k+"列");
				arr4[i][k] = scan.nextInt();
			}

		}

		//遍历输出
		for(int i = 0; i<arr4.length; i++){

			for(int k = 0; k<arr4[0].length; k++){
				System.out.print(arr4[i][k] + " ");
				
			}

			//换行
			System.out.println();
		}

	}


}
