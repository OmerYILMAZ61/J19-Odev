package com.ss.omer.siniflar;

public class Islem {

	public static void main(String[] args) {
		Daire daire = new Daire();
		daire.setPI(3.14);
		daire.daire(10);
		System.out.println("dairenin alan� " + daire.alanHesapla());
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		
		Dikdortgen dikdortgen = new Dikdortgen();
		dikdortgen.dikdortgen(10, 20);
		System.out.println("dikd�rtgen alan� " + dikdortgen.alanHesapla());
	
	
	
	}
}
