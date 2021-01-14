package com.alinatkachuk;

import java.util.ArrayList;

public class Task5 {

	public static void main(String[] args) {
			   
		ArrayList<String> theFirstList = new ArrayList<String>();
		theFirstList.add("meow");  //cat
		theFirstList.add("woof");  //dog
		theFirstList.add("neigh"); //horse
		theFirstList.add("bea");   //sheep
		theFirstList.add("oink");  //pig
		
		ArrayList<String> theSecondList = new ArrayList<String>();
		theSecondList.add("meow");  //cat
		theSecondList.add("cluck"); //chicken
		theSecondList.add("buzz");  //mosquito
		theSecondList.add("bea");   //sheep
		theSecondList.add("roar");  //lion
		theSecondList.add("moo");    //cow
		
		for (int i=0; i<theFirstList.size(); i++) {
			for (int j=0; j<theSecondList.size(); j++) {
				if (theFirstList.get(i)==theSecondList.get(j)) {
					theSecondList.remove(j);
				}
			}
		}
		System.out.println(theSecondList.toString());
	}

}
