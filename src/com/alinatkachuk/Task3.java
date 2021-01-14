package com.alinatkachuk;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		ArrayList<String> wordsA = new ArrayList<String>();
		
		Scanner scanner;
		try {
			scanner = new Scanner(new File("D:\\words.txt"));
	        while(scanner.hasNextLine()){
	        	String allwords = scanner.nextLine();
	            String words[] = allwords.split(" ");
	            
	            for (int i = 0; i<words.length; i++) {
	            
	            if (words[i].startsWith("a")) {
	            	wordsA.add(words[i]);
	            	System.out.println(words[i]);
	            }
	            }
	        }
	        scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

}
