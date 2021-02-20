package com.rj.bd;

import cn.hutool.core.clone.CloneRuntimeException;
import cn.hutool.core.clone.CloneSupport;

public class Test01 {
	/**
	 * 猫猫类，使用实现Cloneable方式
	 * 原始写法实现cloneable接口
	 */
	private static class Cat implements Cloneable{
	    private String name = "miaomiao";
	    private int age = 2;
	    
	    @Override
	    public Cat clone() {
	        try {
	            return (Cat) super.clone();
	        } catch (CloneNotSupportedException e) {
	            throw new CloneRuntimeException(e);
	        }
	    }
	}
	/**
	 * @desc   泛型克隆类
	 * @author fayake
	 *不需要继承父类的
	 *
	 */
	private static class Dog extends CloneSupport<Dog>{
	    private String name = "wangwang";
	    private int age = 3;
	}
}
