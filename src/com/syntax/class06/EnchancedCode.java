package com.syntax.class06;

import java.util.Scanner;

public class EnchancedCode {
public static void main(String[] args) {
		
	    Scanner loan=new Scanner(System.in);
		System.out.println("Please enter score");
		int quiz = loan.nextInt();
		System.out.println("Please enter the mid term score");
		int midTerm=loan.nextInt();
		System.out.println("Please enter the final scores");
		int fin=loan.nextInt();
		int averScore =(quiz+midTerm+fin)/3;
		char grade=0;
		//making our code cleanliness and more organized
		if (averScore>=90) {
			grade='A';
		}else if(averScore>=70 && averScore<=90) {
			grade='B';
		}else if(averScore>=70 && averScore<70) {
			grade='C';
		}else if (averScore<50) {
			grade='F';
		}System.out.println("You are a "+grade+" student");

		System.out.println("------------------------------");
		
		
		if (grade=='A'|| grade=='B') {
			
			System.out.println("You are a good student");
		}else {
			System.out.println("Your need to learn harder");
		}
		
		
		
		
		
	}

}
