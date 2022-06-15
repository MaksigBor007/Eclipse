package com.syntax.class09;

public class AlValuesFromArrey {

	public static void main(String[] args) {
		
		
		char[] grade= {'A','B','C','D','E','F'};
		/*
		 * 
		 * 
		 * 
		 */

		
		for(int i=0;i<grade.length;i++) {
			
			
			System.out.print(grade[i]+" ");
		}
		
		System.out.println("");
		
		
		
		
		String[] words= {"Java","Satarday","day","coding","is"};
		// I want to retrieve all elements
		for (int i=0;i<words.length;i++) {
			System.out.print(words[i]+" ");
		}

		
		System.out.println();
		
		
		/*
		 * Enhanced for loop /advanced for loop/for each loop
		 * CAN BE USED ONLY WHEN WE WORK WITH ARRAY
		 *                or
		 *                COLLECTIONS                
		 */
		
		String[] colors= {"pink", "blue","white","black"};
		
		for(String color:colors) {
			System.out.print(color+" ");
		}

	System.out.println();
	
	int[] numbers = {10,20,30,40};
	for (int num:numbers) {
		System.out.print(num+"  ");
	}
	
	
	
	
	}
}
