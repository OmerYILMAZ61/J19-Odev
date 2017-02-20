package com.ss.dosyaodevi;

import java.io.File;

public class Islem {

	public static void main(String[] args) {
		String[] dizi;
		
		File file = new File("c:/veritabani.txt");
		File file2 = new File("c:/okunan.txt");
		
		Okuma okuma = new Okuma();
		Yazma yazma = new Yazma();
		//veritaban�n� okuma
		okuma.dosyaAc(file);
		okuma.dosyaIcindenOku();
		okuma.dosyaKapa();
		
		//yazma dosyas� a��l�yor
		yazma.dosyaAc(file2);
		//kapay�p a�madan okuma yap�nca,yaz�lan de�erler null oluyor
		okuma.dosyaAc(file);
		//veritaban�ndaki sat�rlar bir diziye g�nderiliyor
		dizi = okuma.dosyaOkuVeDon();
		//dosyaya yaz�l�yor
		for (int i = 0; i < dizi.length; i++) {
			yazma.dosyayaYaz(dizi[i]);
		}
		//yazma kapan�yor
		yazma.dosyaKapa();
		
		okuma.dosyaKapa();
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		
		//di�er dosya okunuyor
		okuma.dosyaAc(file2);
		
		okuma.dosyaIcindenOku();
		
		okuma.dosyaKapa();
		
	
		
		
		
	}
}
