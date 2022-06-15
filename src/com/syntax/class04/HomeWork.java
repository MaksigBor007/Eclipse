package com.syntax.class04;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your 1 number");
		int a = input.nextInt();
		System.out.println("Enter your 2 number");
		int b = input.nextInt();
		System.out.println("Enter your 3 number");
		int c = input.nextInt();
		if (a > b) {
			if (c > a) {
				System.out.println(c + "is largest then " + b + " and "+a);
			} else {
				System.out.println(a + " is largest then " + b + " and " + c);
			}
		} else if (b > a) {
			if (c > b) {
				System.out.println(c + " largest then " + a + " and " + b);
			} else {
				System.out.println(b + " largest then " + a + " and " + c);
			}
		} else if (c > a) {
			if (b > c) {
				System.out.println(b + " lagest then " + a + " and " + c);
			} else {
				System.out.println(c + " largest then " + a + " and " + b);
			}
		}		
		
				

	}
}

