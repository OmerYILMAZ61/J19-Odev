package com.ss.set;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class VeriOku {
	Scanner sc;
	Set<String> mySet;

	public Set<String> oku(File file) {
		mySet = new TreeSet<>();
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while(sc.hasNextLine()){
			mySet.add(sc.nextLine());
		}
		sc.close();
		return mySet;
	}

}
