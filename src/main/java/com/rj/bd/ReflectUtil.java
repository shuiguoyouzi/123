package com.rj.bd;

import org.junit.runners.model.TestClass;
import org.w3c.dom.Document;

import java.lang.reflect.Method;

/**
 * @desc  反射工具类 
 * @author fayake
 *
 */
public class ReflectUtil {
	public void testReflectUtil(){
        //获取某个类的所有方法
        Method[] methods = ReflectUtil.getMethods(TestClass.class);
        //获取某个类的指定方法
        Method method = ReflectUtil.getMethod(TestClass.class, "getA");
        //构造对象
        ReflectUtil.newInstance(TestClass.class);
        //执行方法
        TestClass testClass = new TestClass(null);
        ReflectUtil.invoke(testClass, "setA", 10);
    }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static void invoke(TestClass testClass, String string, int i) {
		// TODO Auto-generated method stub
		
	}

	private static void newInstance(Class<TestClass> class1) {
		// TODO Auto-generated method stub
		
	}

	private static Method getMethod(Class<TestClass> class1, String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Method[] getMethods(Class<TestClass> class1) {
		// TODO Auto-generated method stub
		return null;
	}
}
