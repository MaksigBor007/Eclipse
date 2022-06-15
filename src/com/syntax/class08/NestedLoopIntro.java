package com.syntax.class08;

public class NestedLoopIntro {

	public static void main(String[] args) {
	
		
		for (int i=1; i<=3; i++) {
		System.out.println("Hello");
		for(int y=1; y<=2; y++) {
		System.out.println("Bye");
		}
		}
		
		System.out.println("-------------------------");
		
		
		    for(int x=1; x<=3; x++) {
			System.out.print(x);
			for(int z=1; z<=2;z++) {
			System.out.print(z);
			
			}
		}

		System.out.println();
		
		    for(int p=1; p<=3; p++) {
			for (int c=1; c<=2; c++) {
			System.out.println(p+" "+c);	
			
			
		}
		}
		
		
	    System.out.println("---------------------");
	
	    for (int v=1; v<=3; v++) {
		System.out.println("hello");
		for(int m=1; m>=2; m++) {
			System.out.println("Bye");
		}
	}
		System.out.println("-------------------");
		
		
		for(int h=3; h>1; h--) {
			System.out.println("Hello");
			for( int l=1; l>=2; l++) {
				System.out.println("Bye");
			}
		}
		
		
		
		
	}
		
}
