package com.ss.omer.siniflar;

public class Dikdortgen extends Sekil {

	public double en;
	public double boy;
	
	public void dikdortgen (double enim,double boyum){
		this.en=enim;
		this.boy=boyum;
		
		System.out.println("dikd�rtgenin eni " + en);
		System.out.println("dikd�rtgenin boyu " + boy);
	}
	
	
	
	@Override
	public double alanHesapla() {
		return en*boy;
		
	}

}
