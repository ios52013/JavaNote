package com.successful.chap02.sec05;

public class Demo6去掉数组中的某些元素 {

	public static void main(String[] args) {
		//声明一个数组
		int[]  array = new int[] {1,0,3,0,5,0,7,0,9,0,11,0,13}; 
		//声明一个变量作为新数组的下标
		int account = 0;
		int[] array2 = new int[7];
		
		//
		System.out.println("原来的数组");
		for (int i : array) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//遍历数组
		for(int i = 0; i<array.length; i++){
			
		    //判断元素是否为0	,如果是0就跳过，如果不是0就添加进新的数组
			if(0 == array[i]){
				continue;
			}
			
			//把不是0的元素添加进新的数组
			array2[account] = array[i];
			account++;
		}
		
		System.out.println("=======修改后的数组=======");
		
		for (int i : array2) {
			System.out.print(i + " ");
		}
		
		
		
		
	}
	
	
	
}
