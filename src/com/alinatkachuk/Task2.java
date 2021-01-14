package com.alinatkachuk;

import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class Task2 {

	public static void main(String[] args) {

		File fileTxt = new File ("ArrayList.txt");
		File fileDoc = new File ("ArrayList.doc");
		File filePdf = new File ("ArrayList.pdf");
		
		ArrayList<File> listForAllFiles = new ArrayList<File>();
		listForAllFiles.add(fileTxt);
		listForAllFiles.add(fileDoc);
		listForAllFiles.add(filePdf);
		
		ArrayList<File> listForTxtFiles = new ArrayList<File>();
		ArrayList<File> listForOtherFiles = new ArrayList<File>();
		
		String format = null;
		
		for (int i = 0; i<=listForAllFiles.size(); i++) {
			while (!listForAllFiles.get(i).exists()) { 
				try {
					listForAllFiles.get(i).createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
			
			String fileName = listForAllFiles.get(i).getName();
			if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0) {
			format=fileName.substring(fileName.lastIndexOf(".")+1);
			}
			    if (format=="txt") {
				listForTxtFiles.add(listForAllFiles.get(i));
				} 
				else {
				listForOtherFiles.add(listForAllFiles.get(i));
			}
		}
	}
}
