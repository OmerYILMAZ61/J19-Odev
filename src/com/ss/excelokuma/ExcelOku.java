package com.ss.excelokuma;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOku {

	XSSFWorkbook wB;
	FileInputStream fis;
	List<String> veri;
	int i ;
	public void oku(File file) {
		if (file.exists())
			System.out.println("dosyaya baðlandý");

		try {
			fis = new FileInputStream(file);
			wB = new XSSFWorkbook(fis);
			veri = new ArrayList<>();
		} catch (Exception e) {
			e.printStackTrace();
		}
		XSSFSheet sheet = wB.getSheetAt(0);
		Iterator<Row> iteratorRow = sheet.iterator();
		while(iteratorRow.hasNext()){
			Row row = iteratorRow.next();
			Iterator<Cell> iteratorCell = row.iterator();
			while(iteratorCell.hasNext()){
				i++;
				System.out.print((i)+".satýr " + iteratorCell.next() + " ");
			}
			System.out.println();
			i =0;
		}
		try {
			wB.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
