package com.syntax.class04;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1, num2;
		System.out.println("Enter number");
		num1=input.nextInt();
		System.out.println("Entert number again");
		num2=input.nextInt();
		if (num1>num2) {
			System.out.println(num1+" larger than "+num2);
		} else  {
			System.out.println(num2+" larger than "+num1);
		}

		

		 
          int age;
		  System.out.println("Enter your age");
		  age=input.nextInt();
		  int result=age+10;
		  System.out.println("Your age after 10 years is "+result);
			  
		  
		   
		  
		  
		  }
		  

		
		
	}


