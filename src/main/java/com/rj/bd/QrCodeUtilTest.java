package com.rj.bd;

import org.junit.Test;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;

public class QrCodeUtilTest {

	public static void main(String[] args) {
		// 生成指定url对应的二维码到文件，宽和高都是300像素
		QrCodeUtil.generate("http://www.change.tm/index/index", 300, 300, FileUtil.file("F:/69.jpg"));
	}

	@Test
	public void test01(){
		String decode = QrCodeUtil.decode(FileUtil.file("F:/69.jpg"));
		System.out.println(decode);//http://www.change.tm/index/index
	}
}
