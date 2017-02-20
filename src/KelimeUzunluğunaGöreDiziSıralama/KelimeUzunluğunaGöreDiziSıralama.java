package KelimeUzunluðunaGöreDiziSýralama;

import java.util.Scanner;

public class KelimeUzunluðunaGöreDiziSýralama {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String haberMetni;
		System.out.println("metni giriniz");
		haberMetni = sc.nextLine();
		String[] metinDizisi = haberMetni.split("\\.") ;
		System.out.println("girilen kelime sayýsý " + metinDizisi.length);
		String kelime;
		for (int i =0;i<metinDizisi.length;i++){
			for ( int j =0;j<metinDizisi.length;j++){
				if(metinDizisi[i].length()<metinDizisi[j].length())
				{
					kelime=metinDizisi[i];
					metinDizisi[i]=metinDizisi[j];
					metinDizisi[j]=kelime;
				}
				
			}
		}
		System.out.println("dizinin küçükten büyüðe sýralamsý");
		for(int p=0;p<metinDizisi.length;p++){
			System.out.println(metinDizisi[p]);
		}
	
	
	
	
	
	
	
	
	
	}

}
