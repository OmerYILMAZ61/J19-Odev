package com.ss.�devler;

import java.util.Scanner;

public class maxVeminDegerler {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int rakam;
		int maxDe�er;
		int girdi = 0;
		int minDe�er;
		
		System.out.println("Minimum ve Maximumun bulunaca�� ka� rakam de�eri istiyorsunuz ?");
		rakam = sc.nextInt();
		System.out.println(rakam + " tane say� giriniz");
		int[] girdiler = new int[rakam];
		
		for(int i=0;i < rakam;i++)
		{
			System.out.println((i+1) + ". de�eri giriniz ");
			girdi = sc.nextInt();
			
			girdiler[i]=girdi;		
		
		}
		maxDe�er=girdiler[0];
		minDe�er=girdiler[0];
		 for(int i=0; i<girdiler.length; i++)
	        {
	            if(maxDe�er < girdiler[i])
	            {
	                maxDe�er = girdiler[i];
	            }
	             
	            if(minDe�er > girdiler[i])
	            {
	                minDe�er = girdiler[i];
	            }
	        }
		System.out.println("girilen en b�y�k de�er"+ maxDe�er);
		System.out.println("girilen en k���k de�er"+ minDe�er);		
			
	}

}
