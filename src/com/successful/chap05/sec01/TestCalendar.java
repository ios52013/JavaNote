package com.successful.chap05.sec01;

import java.util.Calendar;

/**
 * Calendar 日历类
 * @author tarena
 *
 */
public class TestCalendar {

	//主函数
	public static void main(String[] args) {
		//不能直接new一个日历对象 因为它的构造方法是protect类型的 只能子类调用
		//Calendar calendar = new Calendar();

		//只能通过这个方法获取一个日历对象
		Calendar calendar = Calendar.getInstance();
		//获取年份
		int year =  calendar.get(Calendar.YEAR);
		//获取月份
		int month = calendar.get(Calendar.MONTH) +1;
		//日
		int day = calendar.get(Calendar.DAY_OF_MONTH);

		//时分秒
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int min = calendar.get(Calendar.MINUTE);
		int sec = calendar.get(Calendar.SECOND);

		//输出
		System.out.println("今天是："+year+"年"
				+ month +"月" + day+ "日" +
				hour + "时"+ min +"分"+ sec +"秒");

		//星期几 
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		String wk;
		
	/*
	 *  
     * @see #SUNDAY 星期日
     * @see #MONDAY
     * @see #TUESDAY
     * @see #WEDNESDAY
     * @see #THURSDAY
     * @see #FRIDAY
     * @see #SATURDAY
     */
		 
		switch (week) {
		case 1:
			wk = "日";
			break;
		case 2:
			wk = "一";
			break;
		case 3:
			wk = "二";
			break;
		case 4:
			wk = "三";
			break;
		case 5:
			wk = "四";
			break;
		case 6:
			wk = "五";
			break;
		case 7:
			wk = "六";
			break;

		default:
			wk = "Error";
			break;
		}

		
		int weekForMonth = calendar.get(Calendar.WEEK_OF_MONTH);
		System.out.println("今天是"+month+"月份第"
		+weekForMonth+"周的星期"+wk);


	}

}
