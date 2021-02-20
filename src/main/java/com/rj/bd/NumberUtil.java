package com.rj.bd;

import java.math.BigDecimal;
/**
 * @desc  数字处理类 用于数字的加减乘除
 * @author fayake
 *
 */
public class NumberUtil {
	public static void main(String[] args) {
		
	
	double n1 = 1.234;
	double n2 = 1.234;
	double result;
	
	result = NumberUtil.add(n1, n2);
	result = NumberUtil.sub(n1, n2);
	result = NumberUtil.mul(n1, n2);
	result = NumberUtil.div(n1, n2);
	
	BigDecimal roundNum = NumberUtil.round(n1, 2);
	String n3 = "1.234";
	
	NumberUtil.isNumber(n3);
	NumberUtil.isInteger(n3);
	NumberUtil.isDouble(n3);
	
	//NumberUtil.range   方法根据范围和步进，生成一个有序整数列表
	//NumberUtil.appendRange 将给定范围内的整数添加到已有集合中
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static void isDouble(String n3) {
		// TODO Auto-generated method stub
		
	}

	private static void isInteger(String n3) {
		// TODO Auto-generated method stub
		
	}

	private static void isNumber(String n3) {
		// TODO Auto-generated method stub
		
	}

	private static double div(double n1, double n2) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static double mul(double n1, double n2) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static double sub(double n1, double n2) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static double add(double n1, double n2) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static BigDecimal round(double n1, int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
