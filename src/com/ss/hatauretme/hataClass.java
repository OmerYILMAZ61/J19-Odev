package com.ss.hatauretme;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class hataClass extends Exception {

	public void hata() {
		String yaz = "gelen de�er exit";
		System.out.println("��k�� yap�ld� !");
		File file = new File("D:/�devDosyas�/hata/log.txt");
		try {
			FileOutputStream fos = new FileOutputStream(file);
			if (file.exists()) {
				fos.write(yaz.getBytes());
			} else {
				try {
					file.createNewFile();
					fos.write(yaz.getBytes());
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

}
