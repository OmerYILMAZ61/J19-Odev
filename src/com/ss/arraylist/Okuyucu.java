package com.ss.arraylist;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Okuyucu {
	Scanner sc;
	List<String> arList;
	
	public List<String> oku(File file) {
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		arList = new ArrayList<>();
		while(sc.hasNextLine()){
			arList.add(sc.nextLine());
		}
		return arList;
		
		
		
	}

}
