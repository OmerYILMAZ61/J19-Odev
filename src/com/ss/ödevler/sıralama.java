package com.ss.ödevler;

public class sýralama {

	public static void main(String[] args) {

		int[] dizi = new int[10];
		dizi[0] = 20;
		dizi[1] = 15;
		dizi[2] = 11;
		dizi[3] = 17;
		dizi[4] = 31;
		dizi[5] = 88;
		dizi[6] = 66;
		dizi[7] = 51;
		dizi[8] = 22;
		dizi[9] = 30;

		int deger;

		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi.length; j++) {
				if (dizi[j] < dizi[i]) {
					deger = dizi[j];
					dizi[j] = dizi[i];
					dizi[i] = deger;

				}
			}
		}

		System.out.println("büyükten küçüðe sýralama");

		for (int p = 0; p < dizi.length; p++) {
			System.out.print(dizi[p] + " ");
		}

		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi.length; j++) {
				if (dizi[j] > dizi[i]) {
					deger = dizi[j];
					dizi[j] = dizi[i];
					dizi[i] = deger;

				}
			}
		}
		System.out.println("\nküçükten büyüðe sýralama");

		for (int p = 0; p < dizi.length; p++) {
			System.out.print(dizi[p] + " ");
		}

	}

}
