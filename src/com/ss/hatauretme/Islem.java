package com.ss.hatauretme;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Islem {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();
		set.add("ömer");
		set.add("mahmut");
		set.add("salih");
		set.add("ahmet");
		set.add("murat");
		set.add("exit");
		set.add("kamil");
		
		Iterator<String> ite = set.iterator();
		try {
			while(ite.hasNext()){
				String s = ite.next();
				if(s.equals("exit")){
					throw new hataClass();
				}
				System.out.println(s);
			}
		} catch (hataClass e) {
			e.hata();
		}
	}
	
}
