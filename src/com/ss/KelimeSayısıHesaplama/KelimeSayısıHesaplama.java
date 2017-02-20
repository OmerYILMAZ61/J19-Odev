package com.ss.KelimeSayısıHesaplama;

import java.util.Scanner;

public class KelimeSayısıHesaplama {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String haberMetni;
		System.out.println("metni giriniz");
		haberMetni = sc.nextLine();
		Kelimeler kel = new Kelimeler(haberMetni);
		int sonuc = kel.hesapla();
		System.out.println("girilen kelime sayısı " + sonuc);
		
	}
}
