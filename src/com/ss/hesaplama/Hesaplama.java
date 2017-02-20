package com.ss.hesaplama;

public class Hesaplama {

	public int sabit;
	public int ozelSabit;

	public void ekranaBas() {
		System.out.println("hesaplama");

	}

	public static void main(String[] args) {

		Hesaplama hesaplama = new Hesaplama();
		hesaplama.ekranaBas();

		Toplama topla = new Toplama();
		Hesaplama.Cikarma cikarma = hesaplama.new Cikarma();
		
		
		
		System.out.println("toplama sonucu " + topla.toplamaYap(10, 20));
		System.out.println("çýkarma sonucu " + cikarma.cikarmaYap(20, 10));
		

	}

	public static class Toplama {
		static int toplam;

		int sonuc;

		public int toplamaYap(int i, int j) {
			sonuc = i + j;
			return sonuc;

		}

	}

	public class Cikarma {
		int sonuc;

		public int cikarmaYap(int i, int j) {
			sonuc = i - j;
			return sonuc;
		}

	}
}
