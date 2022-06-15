package com.syntax.HomeWork;

import java.util.Scanner;

public class EvenAndOddNumberCreate {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    int num;
	    System.out.println("Please enter any number");
	    num=scan.nextInt();

	    if(num%2==0){ 
	      System.out.println("Value is even");
	      if(num>1000){
	        System.out.println("Even number is large");
	      }else {
	        System.out.println("Even value is just right");
	      }
} if(num%2==1) {
	System.out.println("Value is odd");
 if(num>1000) {
	 System.out.println("odd value is large");
 }else {
	 System.out.println("odd value is just right");
 }
}

	}

}
