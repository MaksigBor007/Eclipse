package com.syntax.HomeWork;

import java.util.Scanner;

public class ArrayTask {

	public static void main(String[] args) {
		/*Write a program that creates a String array with size 7.
         *Ask the user to input Days of a week beginning with Sunday using Scanner class.
         *Add these inputs to your array and then print all values from that array
       */
		
		Scanner input=new Scanner(System.in);

		 String[]weeks=new String[7];

		   for(int i=0;i<7;i++){
		   System.out.println("Please enter day "+(i+1)+" of the week");
		    weeks[i]=input.next();
		     }
		   for(int i=0; i<weeks.length; i++){
		     System.out.println(weeks[i]);
		   }
		  
	
}
}
