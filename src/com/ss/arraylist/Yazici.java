package com.ss.arraylist;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class Yazici {

	FileOutputStream fos;
	
	public void yaz(File file, List<String> arList) {
		try {
			fos = new FileOutputStream(file);
			for (int i = 0; i < arList.size(); i++) {
				fos.write(arList.get(i).getBytes());
			}
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
