package com.successful.chap02.sec05;

public class Demo5求奇偶数个数 {

	public static void main(String[] args) {
		//声明一个数组
		int[] array = new int[] {1,2,3,4,5,6,7,8,9}; 
		
		//声明2个变量作为计数器
		int jishu = 0;
		int oushu = 0;
		
		//
		for(int i = 0; i<array.length; i++){
			//判断偶数
			if(array[i] % 2 == 0){
				oushu++;
			}else{
				jishu++;
			}
			
		}
		
		System.out.print("这个数组中:");
		for (int i : array) {
			System.out.print(i+" ");
		}
		System.out.println("分别有："+jishu+"个奇数，和"+oushu+"个偶数!");
		
		
	}
	
	
	
}
