package com.ss.omer.siniflar;

public class Daire extends Sekil {

	public double yaricap;
	private double PI ;
	
	public void daire(double yariCapim){
		this.yaricap=yariCapim;
		System.out.println("yaricapim " + yaricap);
	}
	
	
	@Override
	public double alanHesapla() {
		return PI*yaricap*yaricap;
		
	}


	public double getPI() {
		return PI;
	}


	public void setPI(double pI) {
		PI = pI;
	}

}
