package com.ss.filechooser;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MyFrame  extends JFrame{

	JPanel jPanel;
	JButton jButton;
	JTextArea jTextArea;
	JFileChooser jFileChooser;
	File file;
	
	public MyFrame() {

		setSize(400, 400);
		setLocationRelativeTo(null);
		anaEkran();
		buttonKontrol();
		
	}
	
	public void buttonKontrol() {

		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jFileChooser = new JFileChooser();
				jFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				jFileChooser.setCurrentDirectory(new java.io.File("."));
				if(jFileChooser.showOpenDialog(null)==jFileChooser.APPROVE_OPTION){
					file = jFileChooser.getSelectedFile();
					DosyalarýOkuveYaz dosyalarýOkuveYaz = new DosyalarýOkuveYaz(file, jTextArea);
					dosyalarýOkuveYaz.dosyaIsle();
				}
			}
		});
	}

	public void anaEkran(){
		jPanel = new JPanel(new BorderLayout());
		
		JPanel jPanelButton = new JPanel(new FlowLayout());
		JPanel jPanelText = new JPanel(new FlowLayout());
		
		jButton = new JButton("Seç");
		jPanelButton.add(jButton);
		
		jTextArea = new JTextArea(20,20);
		jPanelText.add(jTextArea);
		
		jPanel.add(jPanelButton,BorderLayout.NORTH);
		jPanel.add(jPanelText,BorderLayout.CENTER);
		
		add(jPanel);
	}
	
	
}
