package com.ss.dosyaodevi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Okuma {

	Scanner sc;
	Scanner scc;
	String a;
	String dizi[];
	int i = 0;
	int sayac=0;
	public void dosyaAc(File file) {
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//dizinin uzunlu�u i�in scanner tan�mlama
		try {
			scc = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//sadece okuma
	public void dosyaIcindenOku() {
		while (this.sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		
	}

	public String[] dosyaOkuVeDon() {
		//dizinin uzunlu�unu bulmak i�in.
		while (this.scc.hasNextLine()) {
			scc.nextLine();
			sayac++;
		}
		
		//dizinin uzunlu�unu tan�mlama		
		dizi = new String[sayac];
		//diziye de�er atama
		while (this.sc.hasNextLine()) {
			dizi[i]= sc.nextLine();
			i++;
		}
		return dizi;
	}
	
	public void dosyaKapa() {
		this.sc.close();

	}

}
