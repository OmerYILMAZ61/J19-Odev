package com.ss.bakkal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Bakkal {

	int idBakkal;
	String isimBakkal;
	Map<Integer, Kisi> map = new LinkedHashMap<>();
	Depo depo;
	Scanner sc;

	public Bakkal(){
		
	}
	public Bakkal(int idBakkal, String isimBakkal) {
		this.idBakkal = idBakkal;
		this.isimBakkal = isimBakkal;
	}
	public Map<Integer, Kisi> musterileriDosyadanOku() {
		File file = new File("D:/ödevDosyasý/Bakkal-depo/Musteri.txt");
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		while (sc.hasNextLine()) {
			Kisi kisi = new Kisi(sc.nextInt(), sc.next(), sc.next());
			map.put(kisi.getId(), kisi);
//			Integer id = sc.nextInt();
//			String s = sc.nextLine();
//			map.put(id, s);
		}
		return map;

	}
	public void musOku(){
		musterileriDosyadanOku();
		for (Entry<Integer, Kisi> en : map.entrySet()) {
			System.out.print(en.getKey() + " ");
			System.out.println(en.getValue().getIsim()+" " +en.getValue().getSoyisim());
		}
	}
	public int getIdBakkal() {
		return idBakkal;
	}
	public void setIdBakkal(int idBakkal) {
		this.idBakkal = idBakkal;
	}
	public String getIsimBakkal() {
		return isimBakkal;
	}
	public void setIsimBakkal(String isimBakkal) {
		this.isimBakkal = isimBakkal;
	}

}
