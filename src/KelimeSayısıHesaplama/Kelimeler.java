package KelimeSay�s�Hesaplama;

public class Kelimeler {

	String kelime;
	
	public Kelimeler(String kelime) {
		this.kelime = kelime;
		
	}
	


public int hesapla(){
	
	String[] kelimeSay�s�=kelime.split(" ");
	return kelimeSay�s�.length;
}
}