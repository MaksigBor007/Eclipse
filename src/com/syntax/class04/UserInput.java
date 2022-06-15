package com.syntax.class04;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		//creating a Scaner
		Scanner input=new Scanner(System.in);
		
		//send instraction to the console
		System.out.println("Please enter your name");
		
		//we need to grab the values from console
		String name=input.next();//after you type a value hit enter
	
		
		//lets send instruction
		System.out.println(name+" please enter your age");
		
		//need to capture and store age
		
		int age=input.nextInt();
		int result=age+10;
        System.out.println(name+" is "+result+" years old");
	}

	
	

    
	
}
