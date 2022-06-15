package com.syntax.class07;

import java.util.Scanner;

public class LoopWithScanner {

	public static void main(String[] args) {
		/*
		 * we are going to ask you if you got a job
		 * we will continuously asking if you get a job until you say yes!
		 * 
		 * once you say yes -->Congratulations!
		 */
		
		Scanner scan=new Scanner(System.in);
		
        String job;
		do {
		System.out.println("Did you get a job?");// if condit is false it loops the statement
		job=scan.nextLine();
		}while(!job.equalsIgnoreCase("yes"));
	    System.out.println("Congratulations!");	

	System.out.println("-----------------------------");
	//another
	 String offer;
	System.out.println("Did you get a job");
	offer = scan.nextLine();
	while (!offer.equalsIgnoreCase("yes")) {
	System.out.println("Did you get a job");
	offer = scan.nextLine();
	}
	System.out.println("Congratulations");
	}
	
	
	
	}


