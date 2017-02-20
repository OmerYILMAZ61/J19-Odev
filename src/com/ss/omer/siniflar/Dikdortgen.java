package com.ss.omer.siniflar;

public class Dikdortgen extends Sekil {

	public double en;
	public double boy;
	
	public void dikdortgen (double enim,double boyum){
		this.en=enim;
		this.boy=boyum;
		
		System.out.println("dikdörtgenin eni " + en);
		System.out.println("dikdörtgenin boyu " + boy);
	}
	
	
	
	@Override
	public double alanHesapla() {
		return en*boy;
		
	}

}
