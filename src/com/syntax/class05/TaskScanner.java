package com.syntax.class05;

import java.util.Scanner;

public class TaskScanner {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);// creat a canner
	
		System.out.println("Do you have a credit card? yes or no");//instraction to console
		String answer=input.next();// capture class
		//another option is boolean boo=true; 
		
		if (answer.equalsIgnoreCase("yes")) {
			System.out.println("What is the balance on your card?");
			int balance=input.nextInt();
			if(balance>1000) {
				System.out.println("Please pay off immediatly");
				}else {
					System.out.println("You may spend more");
				}
		}else {
			System.out.println("Would you like to have one?");
	}

}
}