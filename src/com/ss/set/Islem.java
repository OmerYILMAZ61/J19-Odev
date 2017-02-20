package com.ss.set;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class Islem {

	public static void main(String[] args) {
		
		File file = new File("D:/ödevDosyasý/set/setOku.txt");
		
		VeriOku veriOku = new VeriOku();
		
		Set<String> mySet = veriOku.oku(file);
		
		VeriYaz veriYaz = new VeriYaz();
		
		File file2 = new File("D:/ödevDosyasý/set/setYaz.txt");
		
		if (!file2.exists()) {
			try {
				file2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		veriYaz.yaz(file2,mySet);

	}
}
