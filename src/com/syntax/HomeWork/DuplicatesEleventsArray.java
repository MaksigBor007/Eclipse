package com.syntax.HomeWork;

import java.util.Scanner;

public class DuplicatesEleventsArray {

	public static void main(String[] args) {
		
		//Write a program to print out duplicate elements from an Array of Strings?

	  
	String [] array= {"Maks","Aleksandr","Maks","Oleg","Ramiar","Ramiar"};
	
	for(int i=0;i<array.length;i++) {
		for(int j=i+1;j<array.length;j++) {
			
			if(array[i]==array[j]) {
				System.out.println(array[j]);
			}
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}


