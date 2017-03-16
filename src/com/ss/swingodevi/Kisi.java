package com.ss.swingodevi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Kisi {

	private String adi;
	private String sifre ;
	File file;
	
	public Kisi(String path) {
		file = new File(path);
		
	}

	public Boolean kisiKayitlimi(String kullaniciAdi, String sifre) {
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()){
				if(sc.next().equals(kullaniciAdi)&&sc.next().equals(sifre)){
					return true;
					
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
			
			return false;
	}
	
	
	
	
}
