package com.ss.excelokuma;

import java.io.File;

public class Islem {

	public static void main(String[] args) {
		
		File file = new File("D:/ödevDosyasý/okunan.xlsx");
		ExcelOku  exceloku = new ExcelOku();
		exceloku.oku(file);
		
		System.out.println("okundu");
	}
}
