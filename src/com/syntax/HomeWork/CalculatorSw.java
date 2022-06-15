package com.syntax.HomeWork;

import java.util.Scanner;

public class CalculatorSw {

	public static void main(String[] args) {
	
		Scanner calc=new Scanner(System.in);
		
		System.out.println("calculator");
		
		System.out.println("Please enter your number");
		double num1=calc.nextInt();
		System.out.println("Please enter number again");
		double num2=calc.nextInt();
		
		System.out.println("Enter the operator");
		char arith=calc.next().charAt(0);
		double result=0;
		

		
		if(arith=='/') {
			result=(num1/num2);}
		else if(arith=='*') {
			result=(num1*num2);}
		else if(arith=='+') {
			result=(num1+num2);}
		else if(arith=='-') {
			result=(num1-num2);}
		System.out.println("The result is "+result);
		
		System.out.println("--------------------------------------");
		
        switch(arith) {
		
		case '/':
			result=num1/num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;	
			default:
				System.out.println("Invalid Operator");
				break;
	}
        System.out.println("The result is "+result);
		
        
        
        
        
     
		
	}

	}


