package com.syntax.HomeWork;

public class StringHW2 {
       //Create a method that will take a number and prints whether the number is even or odd.
	
	
	int numbers (int a) { 
		if(a%2!=0) {
			System.out.println("The number "+a+" is odd");
		}else {
			System.out.println("The number "+a+" is even ");
		}return a;
	}
	
	
	public static void main(String[] args) {
	StringHW2 shw=new StringHW2();
	shw.numbers(2);
	}

}
