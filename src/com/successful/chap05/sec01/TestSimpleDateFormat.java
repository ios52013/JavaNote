package com.successful.chap05.sec01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormat {

	/**
	 * 将日期对象 格式化成 指定格式的日期文本字符串
	 * @param date   传入的要格式化的日期对象
	 * @param format 格式 
	 * @return
	 */
	public static String formatDate(Date date, String format){
		//字符串变量 存储结果
		String result = "";
		//创建格式化对象
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		//如果日期对象存在
		if(date != null){
			result = sdf.format(date);
		}

		return result;
	}

	/**
	 * 将日期文本字符串 转化成 日期对象
	 * @param dateStr 要 转换的日期字符串
	 * @param format  格式
	 * @return
	 * @throws ParseException 抛出的异常
	 */
	public static  Date formatDate(String dateStr, String format) throws ParseException{
		//创建格式化对象
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		//这里可能会存在异常 所以抛出
		return sdf.parse(dateStr);
	}


	/**
	 * 主函数
	 * @param args
	 * @throws ParseException  抛出异常
	 */
	public static void main(String[] args) throws ParseException {
		//创建日期对象
		Date date = new Date();
		//创建SimpleDateFormat 日期格式化对象
		//SimpleDateFormat sdf = new SimpleDateFormat();

		//大写的HH表示的是24小时制  小写的hh表示12小时制 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		//把日期对象 格式化 成文本
		String today = sdf.format(date);
		System.out.println("现在是"+today);

		//调用封装好的方法
		System.out.println("调用自己封装的方法"+formatDate(date, "yyyy-MM-dd hh时mm分ss秒"));


		//
		String dateStr = "1989-12-12 01:20:30";
		//可能会存在异常  所以往外抛出
		Date date2 = formatDate(dateStr, "yyyy-MM-dd HH:mm:ss");
		//输出
		System.out.println("我的生日是："+
                  formatDate(date2,"yyyy-MM-dd HH:mm:ss"));
	}


}
