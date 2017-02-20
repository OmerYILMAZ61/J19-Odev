package com.ss.bakkal;


public class Islem {
	
	
	public static void main(String[] args) {
		Islem islem = new Islem();
		islem.bakkalVeMusterileriYazdýr();
		
		
		
		
		
	}
	public void bakkalVeMusterileriYazdýr(){
		Bakkal bakkal = new Bakkal();
		Depo depo = new Depo();
		System.out.println("müþteriler" );
		bakkal.musOku();
		System.out.println("bakkallar");
		depo.bakOku();
	}
}
