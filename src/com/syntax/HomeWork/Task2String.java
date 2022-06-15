package com.syntax.HomeWork;

import java.util.Scanner;

public class Task2String {

	public static void main(String[] args) {
		/*
		 *Write a program that reads two people's first
	     *names and if they expecting boy or girl? 
         *Based on the input suggests a name for a baby:
             
             *Example Output:
             *Mom's first name? Mary
             *Dad's first name? Daniel
             *Boy or Girl? boy
             *Suggested baby name: DANRY

             *Example Output:
             *Mom's first name? Mary                 
             **Dad's first name? Daniel
             *Boy or Girl? girl
             *Suggested baby name: MAIEL
		 */
		
		
		
		
		Scanner scan=new Scanner (System.in);
		String nameMoms="";
		String nameDads="";
		String girlOrBoy="";
		System.out.println("Moms first name?");
		 nameMoms=scan.next();
		 System.out.println("Dads first name?");
		 nameDads=scan.next();
		 if(nameMoms.equalsIgnoreCase("Mary") || nameDads.equalsIgnoreCase("Daniel")) {
			 System.out.println("Boy or Girl?");
			 girlOrBoy=scan.next();
		 }if (girlOrBoy.equalsIgnoreCase("Boy")) {
			    System.out.println("Suggested baby name Danry");	 
		 }else if(girlOrBoy.equalsIgnoreCase("Girl")) {
				 System.out.println("Suggeested baby name Maiel");
			 }else {
				 System.out.println("Wrong name");
			 }
			 
		
		 scan.close();
		 
		 }		
	
	

}
	

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


