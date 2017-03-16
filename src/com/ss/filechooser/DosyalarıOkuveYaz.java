package com.ss.filechooser;

import java.io.File;

import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class DosyalarýOkuveYaz {

	File file;
	JTextArea jTextArea;
	JComboBox<String> jComboBox;

	public DosyalarýOkuveYaz(File file, JTextArea jTextArea) {

		this.file = file;
		this.jTextArea = jTextArea;

	}

	public void dosyaIsle() {
		
		jComboBox = new JComboBox<>();
		int uz=file.list().length;
		for (int i = 0; i < uz; i++) {
			jComboBox.addItem(file.list()[i]);
		}
		String str = null;
		for (int i = 0; i < uz; i++) {
			str+= jComboBox.getItemAt(i)+"\n";
			
		}
		jTextArea.setText(str);

	}

}
