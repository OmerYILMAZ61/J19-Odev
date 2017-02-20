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
		//dizinin uzunluðu için scanner tanýmlama
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
		//dizinin uzunluðunu bulmak için.
		while (this.scc.hasNextLine()) {
			scc.nextLine();
			sayac++;
		}
		
		//dizinin uzunluðunu tanýmlama		
		dizi = new String[sayac];
		//diziye deðer atama
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
