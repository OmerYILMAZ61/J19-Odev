package com.ss.arraylist;

import java.io.File;
import java.util.List;

public class Islem {

	
	public static void main(String[] args) {
		List<String> arList;
		
		File file = new File("D:/ödevDosyasý/arrayList/oku.txt");
		
		Okuyucu okuyucu = new Okuyucu();
		
		Yazici yazici = new Yazici();
		
		arList = okuyucu.oku(file);
		
		System.out.println(arList);
		
		arList.sort(null);
		
		yazici.yaz(file,arList);
		
		
		
	}
}
