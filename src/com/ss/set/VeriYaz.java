package com.ss.set;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

public class VeriYaz {
	PrintWriter pw;
	FileOutputStream fos;
	public void yaz(File file, Set<String> mySet) {
		try {
			fos = new FileOutputStream(file);
		} catch (IOException e) {
			e.printStackTrace();
		} 
		String[] a = mySet.toArray(new String[mySet.size()]);
		try {
			for (int i = 0; i < a.length; i++) {
				fos.write(a[i].getBytes());
			}
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
//		Iterator<String> iterator = mySet.iterator();

//		try {
//			while (iterator.hasNext()){
//				fos.write(iterator.next().getBytes());
//			}
//			fos.close();
//			System.out.println("yazdým");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
	}
}
