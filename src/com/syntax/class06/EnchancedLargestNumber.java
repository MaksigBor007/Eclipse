package com.syntax.class06;

import java.util.Scanner;

public class EnchancedLargestNumber {

	public static void main(String[] args) {
		Scanner loan=new Scanner(System.in);
     int num1=200;
     int num2=2000;
     int num3=20;
     /*
      * compiler can initialize variables to its default values
      * int-->0
      * double->0.0
      * boolean->false
      * String->null
      */
     int largest=0;
     
     if (num1>num2 && num1>num3) {
    	 largest=num1;
     }else if(num3>num1 && num3>num2) {
    	 largest=num3;
     }else if(num2>num1 && num2>num3) {
    	 largest=num2;
     }else {
     System.out.println("All number are equal");
     } if(largest !=0)
     System.out.println("The largest number is "+largest);
     //The variable largest may not have been initialized
     
     
     
     
     System.out.println("Enter your birth month");
		String month=loan.next();
		
		String season;
		if (month.equalsIgnoreCase("December")||month.equalsIgnoreCase("January")||month.equalsIgnoreCase("February")) {
		season="Winter";	
		}else if (month.equalsIgnoreCase("March")||month.equalsIgnoreCase("April")||month.equalsIgnoreCase("May")) {
		season="Spring";
		}else if (month.equalsIgnoreCase("June")||month.equalsIgnoreCase("July")||month.equalsIgnoreCase("August")) {
		season="Summer";
		}else if (month.equalsIgnoreCase("September")||month.equalsIgnoreCase("October")||month.equalsIgnoreCase("November")) {
		season="Fall";
		}else {
			season="InvaLid";
		}if (!season.equals("InvaLid")) //do not print out anything if incorrect answer
		{
		System.out.println("You were born on season "+season);
	}
	}

}
