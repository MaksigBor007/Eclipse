package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		//continue keyword skip current execution/iteration
		//when java executes continue->
		//go back to the beginning of the loop
		//so rest of the code inside loop body
		//will be skipped/ignored
		
		for (int i=1; i<=5; i++) {
			if(i==2) {
				continue;
				}
			System.out.print(i+" ");
			System.out.println("We are going to break");
			System.out.println("Heloo");
		        }

	//print numbers from 1 to 10 except number 5 and 7
	
		for(int i=1; i<=10; i++) {
			
			if (i==5 || i==7) {
				continue;
		}
				System.out.print(i+" ");
		}
	
System.out.println("--------------------------");

        for (int i = 0; i < 10; i++) {
	          if (i == 4) {
	            continue;
	  }
	            System.out.println(i);
	} 
			
}
}


