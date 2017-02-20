package com.omer.siniflar;

public abstract class Sekil {

	private String isim;

	public void sekil() {

	}

	
	public String isimNe(){
		return isim;
	}

	public static void nedir(){
		
	}

	public void isimBelirle(String yeniIsim){
		this.isim=yeniIsim;
		
	}
	
	public void isimYazdir(){
		System.out.println("benim þeklim " + isim);
	}
	
	abstract public double alanHesapla();
	


}
	
	
	
	
	
	
	
	