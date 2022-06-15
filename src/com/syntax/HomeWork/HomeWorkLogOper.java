package com.syntax.HomeWork;

import java.util.Scanner;

public class HomeWorkLogOper {

	public static void main(String[] args) {
		
		
		Scanner loan=new Scanner(System.in);
		System.out.println("What amount of loan do you need?");
		int l=loan.nextInt();
		if (l<=200000) {
		System.out.println("We would give you a loan");
		}else {
		System.out.println("We reject with a loan");
		}


		
		System.out.println("----------------------------------");

        System.out.println("What city are you in?");
        String city=loan.next();
        System.out.println("What is the temperature outside?");
        float temp=loan.nextFloat();
        System.out.println("The temperature in the city "+city+" is "+(temp-32)*0.555);

		
		System.out.println("----------------------------------");
		
		System.out.println("Enter of worked years");
		double y=loan.nextDouble();
		if(y>=5) {
		System.out.println("You are eligible for the bonus");
		System.out.println("Enter your annual salary");
		int s=loan.nextInt();
		if (s>50000) {
		System.out.println("Your bonus is 5000");
		}else if(s<50000) {
		System.out.println("Your bonus is 3000");
		}else {
		System.out.println("You are not eligible for the bonus");
		}
		
		System.out.println("----------------------------------");
		
		
		System.out.println("Input current time (use 24 hour format)");
		float time=loan.nextFloat();
		if (time<=11) {
		System.out.println("Morning");
		}else if (time>=12 && time<=15) {
		System.out.println("Afternoon");
		}else if (time>=16 && time<=20) {
		System.out.println("Evening");
		}else if(time>=21 && time<=24) {
		System.out.println("Night");
		}else {
		System.out.println("Invalid time entered");
		}
		
		System.out.println("-----------------------------------");
		
		System.out.println("Enter your birth month");
		String month=loan.next();
		if (month.equalsIgnoreCase("December")||month.equalsIgnoreCase("January")||month.equalsIgnoreCase("February")) {
		System.out.println("You were born on season Winter");	
		}else if (month.equalsIgnoreCase("March")||month.equalsIgnoreCase("April")||month.equalsIgnoreCase("May")) {
		System.out.println("You were born on season Spring");
		}else if (month.equalsIgnoreCase("June")||month.equalsIgnoreCase("July")||month.equalsIgnoreCase("August")) {
		System.out.println("You were born on season Summer");
		}else if (month.equalsIgnoreCase("September")||month.equalsIgnoreCase("October")||month.equalsIgnoreCase("November")) {
		System.out.println("You were born on season Fall");
		}
		
		
		System.out.println("----------------------------------");
		
		
		System.out.println("Please enter score");
		int quiz = loan.nextInt();
		System.out.println("Please enter the mid term score");
		int midTerm=loan.nextInt();
		System.out.println("Please enter the final scores");
		int fin=loan.nextInt();
		int averScore =(quiz+midTerm+fin)/3;
		if(averScore>=90) {
		System.out.println("Grade A");
		}else if(averScore>=70 &&averScore<90) {
		System.out.println("Grade B");
		}else if (averScore>=70&&averScore<70) {
		System.out.println("Grade C");
		}else if(averScore<50) {
		System.out.println("Grade F");
		}
		
		
		
		
	
		
		
	}
	}

	}
