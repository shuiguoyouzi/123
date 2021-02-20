package com.rj.bd;

import java.io.File;
import java.util.List;
/**
 * @desc   文件工具类
 * @author fayake
 *
 */
public class FileUtil {
	public void testFileUtil(){
        //ls  touch  mkdir del(递归删除)  copy
        List<String> fileNames = FileUtil.listFileNames("jsonFile");
        File touch = FileUtil.touch(new File(""));
        File mkdir = FileUtil.mkdir("");
        boolean del = FileUtil.del("");
        FileUtil.copy("","",true);

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

	private static void copy(String string, String string2, boolean b) {
		// TODO Auto-generated method stub
		
	}

	private static boolean del(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	private static File touch(File file) {
		// TODO Auto-generated method stub
		return null;
	}

	private static File mkdir(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private static List<String> listFileNames(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
