package com.syntax.class05;

import java.util.Scanner;

public class TaskLogicalOp {

	public static void main(String[] args) {
		
		Scanner user=new Scanner(System.in);
		
		System.out.println("Plese Enter Your Heights");
		 int h=user.nextInt();
		
		if(h<60) {
			
			System.out.println("Short clasification");
		}else if (h>=60 && h<=72) 
		{
			System.out.println("Medium clasification");
		}else if (h>72) {
			System.out.println("Tall clasification");
		}
		
		System.out.println("------------------------------");
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("What day is today? ");
		int day = input.nextInt();
		
		if (day <=5 ) {
			System.out.println("Its a weekday");
		}
		else if (day>5 && day <=7) {
			System.out.println("Its a weekend");
		}
		
		else {System.out.println("Invalid day");}
		

		
		
		System.out.println("=====================");
	
		System.out.println("Please enter a number");
		int num=user.nextInt();
		
		if (num>=1 && num<=10) {
			
			System.out.println("small");
		}else if (num>=11 && num<=100) {
			
			System.out.println("medium");
		}else if(num>=101 && num<=1000) {
			
			System.out.println("large");
		}
	
	}
	

}
