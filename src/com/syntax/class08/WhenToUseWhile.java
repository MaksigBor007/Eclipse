package com.syntax.class08;

import java.util.Scanner;

public class WhenToUseWhile {

	public static void main(String[] args) {
		/*declare a secret number
		 * 
		 * you want to ask user to guess your secret number
		 * 
		 * your code should keep asking to guess until user gets your secret number
		 * once user gets the secret number-->you got it!
		 */
			
			
			int secNum=25;
			int guessedNum;
			Scanner scan=new Scanner(System.in);
			do {System.out.println("Guess the number");
			guessedNum=scan.nextInt();}
			while(guessedNum!=secNum);
			System.out.println("You got it");
			
			System.out.println("--------------------------------");
			
			String job;
		    do{System.out.println("Did you get a job?");
			job=scan.next();}
			while(!job.equalsIgnoreCase("Yes"));                // if condit is false it loops the statement
		    System.out.println("Congratulations!");
			
	
	
	
	
	
	
	
	}

}
