package com.rj.bd;

/**
 * @desc    字符串工具类 
 * @author fayake
 *
 */
public class StrUtil {
	public void testStrUtil(){
		
		String str = "test";
		StrUtil.isEmpty(str);
		StrUtil.isEmpty(str);
		
		StrUtil.removeSuffix("a.jpg", ".jpg");
		StrUtil.removePrefix("a.jpg", "a.");
		
		String template = "这只是个占位符:{}";
		String str2 = StrUtil.format(template, "我是占位符");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	private static String format(String template, String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void removePrefix(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	private static void removeSuffix(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	private static void isEmpty(String str) {
		// TODO Auto-generated method stub
		
	}
}
