package KelimeSayısıHesaplama;

public class Kelimeler {

	String kelime;
	
	public Kelimeler(String kelime) {
		this.kelime = kelime;
		
	}
	


public int hesapla(){
	
	String[] kelimeSayısı=kelime.split(" ");
	return kelimeSayısı.length;
}
}