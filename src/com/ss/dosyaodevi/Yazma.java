package com.ss.dosyaodevi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Yazma {

	PrintWriter pw;
	
	public void dosyaAc(File file){
		try {
			this.pw = new PrintWriter(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void dosyayaYaz(String string){
		pw.println(string);
	}
	
	public void dosyaKapa(){
		pw.close();
	}
	
}
