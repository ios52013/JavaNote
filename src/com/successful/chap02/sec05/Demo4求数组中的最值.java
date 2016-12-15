package com.successful.chap02.sec05;

public class Demo4求数组中的最值 {

	public static void main(String[] args) {
		//声明一个数组
		int[] array = new int[] {9,31,-27,18,0,-3,52,98,23,99};
	
		//声明2个变量保存最值
		int max = 0;
		int min = 0;
		//
		for(int i = 0; i<array.length; i++){
			//比较最大值
			if(array[i]>max){
				max = array[i];
			}
            //比较最小值
			if(array[i]<min){
				min = array[i];
			}
			
		}
		
		
		System.out.println("最大值是:"+max);
		System.out.println("最小值是:"+min);
		
		
	}
	
	
	
}
