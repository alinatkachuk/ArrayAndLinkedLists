package com.alinatkachuk;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task1 {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>(); 
		long startOfArrayList = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			arrayList.add(5);
	    }
		long endOfArrayList = System.currentTimeMillis();
		System.out.println("Time to fill the ArrayList (in seconds): " + (endOfArrayList-startOfArrayList));

	    LinkedList<Integer> linkedList = new LinkedList<Integer>(); 
	    long startOfLinkedList = System.currentTimeMillis();
	    for (int j = 0; j < 10000; j++) {
	    	linkedList.add(5);
	    }
	    long endOfLinkedList = System.currentTimeMillis();
	    System.out.println("Time to fill the LinkedList (in seconds): " + (endOfLinkedList-startOfLinkedList) + "\n");
	    
	    if ((endOfArrayList-startOfArrayList)>(endOfLinkedList-startOfLinkedList)) {
	    	System.out.println("LinkedList fills up faster");
	    }
	    else if ((endOfArrayList-startOfArrayList)<(endOfLinkedList-startOfLinkedList)) {
	    	System.out.println("ArrayList fills up faster");
	    	}
            else {
            	System.out.println("The filling rate is the same"); 
            }
	    
	}
}
