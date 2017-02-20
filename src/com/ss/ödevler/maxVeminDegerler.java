package com.ss.ödevler;

import java.util.Scanner;

public class maxVeminDegerler {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int rakam;
		int maxDeðer;
		int girdi = 0;
		int minDeðer;
		
		System.out.println("Minimum ve Maximumun bulunacaðý kaç rakam deðeri istiyorsunuz ?");
		rakam = sc.nextInt();
		System.out.println(rakam + " tane sayý giriniz");
		int[] girdiler = new int[rakam];
		
		for(int i=0;i < rakam;i++)
		{
			System.out.println((i+1) + ". deðeri giriniz ");
			girdi = sc.nextInt();
			
			girdiler[i]=girdi;		
		
		}
		maxDeðer=girdiler[0];
		minDeðer=girdiler[0];
		 for(int i=0; i<girdiler.length; i++)
	        {
	            if(maxDeðer < girdiler[i])
	            {
	                maxDeðer = girdiler[i];
	            }
	             
	            if(minDeðer > girdiler[i])
	            {
	                minDeðer = girdiler[i];
	            }
	        }
		System.out.println("girilen en büyük deðer"+ maxDeðer);
		System.out.println("girilen en küçük deðer"+ minDeðer);		
			
	}

}
