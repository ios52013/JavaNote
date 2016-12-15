package com.successful.chap02.sec05;

public class Demo3冒泡排序 {

	public static void main(String[] args) {
		//定义一个整型数组 并静态初始化
		int[] array = new int[]{13,8,2,9,35,27,63};
		
		//总共有多少个数  循环多少次 -1 
		for(int i = 0; i<array.length-1; i++){
			//一个数要比较多少次,自身不用和自己比较 ，另外已经比较过的也不用比
			for(int k = 0; k<array.length -1 -i; k++){

				//两两相比较，如果前面的比后面的大，那就交换位置
				if(array[k] > array[k+1]){
					int temp = array[k];
					array[k] = array[k+1];
					array[k+1] = temp;
				}				
				
			}
			
		}
		
		
		//遍历
		for (int i : array) {
			System.out.print(i + " ");
		}
		
		
		
	}
	
	
	
}
