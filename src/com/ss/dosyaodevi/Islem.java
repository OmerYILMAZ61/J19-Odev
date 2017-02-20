package com.ss.dosyaodevi;

import java.io.File;

public class Islem {

	public static void main(String[] args) {
		String[] dizi;
		
		File file = new File("c:/veritabani.txt");
		File file2 = new File("c:/okunan.txt");
		
		Okuma okuma = new Okuma();
		Yazma yazma = new Yazma();
		//veritabanýný okuma
		okuma.dosyaAc(file);
		okuma.dosyaIcindenOku();
		okuma.dosyaKapa();
		
		//yazma dosyasý açýlýyor
		yazma.dosyaAc(file2);
		//kapayýp açmadan okuma yapýnca,yazýlan deðerler null oluyor
		okuma.dosyaAc(file);
		//veritabanýndaki satýrlar bir diziye gönderiliyor
		dizi = okuma.dosyaOkuVeDon();
		//dosyaya yazýlýyor
		for (int i = 0; i < dizi.length; i++) {
			yazma.dosyayaYaz(dizi[i]);
		}
		//yazma kapanýyor
		yazma.dosyaKapa();
		
		okuma.dosyaKapa();
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		
		//diðer dosya okunuyor
		okuma.dosyaAc(file2);
		
		okuma.dosyaIcindenOku();
		
		okuma.dosyaKapa();
		
	
		
		
		
	}
}
