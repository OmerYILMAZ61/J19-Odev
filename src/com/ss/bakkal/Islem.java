package com.ss.bakkal;


public class Islem {
	
	
	public static void main(String[] args) {
		Islem islem = new Islem();
		islem.bakkalVeMusterileriYazd�r();
		
		
		
		
		
	}
	public void bakkalVeMusterileriYazd�r(){
		Bakkal bakkal = new Bakkal();
		Depo depo = new Depo();
		System.out.println("m��teriler" );
		bakkal.musOku();
		System.out.println("bakkallar");
		depo.bakOku();
	}
}
