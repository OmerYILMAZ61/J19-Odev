package com.ss.bakkal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Depo {

	int idDepo;
	String isimDepo;
	Map<Integer, Bakkal> map = new LinkedHashMap<>();
	Scanner sc;
	public Map<Integer, Bakkal> bakkalariDosyadanOku(){
		File file = new File("D:/ödevDosyasý/Bakkal-depo/Bakkal.txt");
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		while(sc.hasNextLine()){
			Bakkal bakkal = new Bakkal(sc.nextInt(), sc.next());
			map.put(bakkal.getIdBakkal(), bakkal);
//			int id = sc.nextInt();
//			String s = sc.nextLine();
//			map.put(id, s);
		}
		return map;
	}
	public void bakOku(){
		bakkalariDosyadanOku();
		for (Entry<Integer, Bakkal> en : map.entrySet()) {
			System.out.print(en.getKey() + " ");
			System.out.println(en.getValue().getIsimBakkal());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
