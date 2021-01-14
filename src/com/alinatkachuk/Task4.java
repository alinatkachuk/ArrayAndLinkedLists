package com.alinatkachuk;

import java.util.ArrayList;

public class Task4 {

	public static void main(String[] args) {

		ArrayList<String> allStrings = new ArrayList<String>();
		allStrings.add("kitty");
		allStrings.add("dog !");
		allStrings.add(" :) :( ");
		allStrings.add("flower");
		allStrings.add("hello world!");
		
		ArrayList<String> stringsUpTo5 = new ArrayList<String>();
		
		for (int i=0; i<allStrings.size(); i++) {
			String s=allStrings.get(i);
			int max=s.length();
			if (max<=5) {
				stringsUpTo5.add(allStrings.get(i));
				System.out.println(stringsUpTo5.get(i));
			}
		}

	}

}
