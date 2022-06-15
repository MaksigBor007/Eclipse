package com.syntax.class08;

public class BreakKeywords {

	public static void main(String[] args) {
		
		for (int i=1; i<=5; i++) {
			System.out.println("Hello");
			if(i==5) {
				System.out.println();
			}
		}
		
		
		boolean summer=true;
		int temp=95;
		while(summer) {
			
			System.out.println("It is hot");
			if(temp>70) {
				System.out.println("it is not hot anymore");
				break;
			
			}temp-=10;
		}

		
		System.out.println("-------------------");

		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    break;
			  }
			System.out.print(i);
			} 
		
		
		
		
		
		
	}

}
