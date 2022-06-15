package com.syntax.class04;

public class PracticeIfNested {

	public static void main(String[] args) {
		
		
		boolean winterTires=false;
		boolean summerTires=true;
		int price=300;
		
		
		if (winterTires) {
		 if (price<=500) { 
			System.out.println("I will do seasonal tire change");
		}else if(price>=550) {
			
			System.out.println("Noway I do not do seasonal tire chahge");
		}
		} if (summerTires) {
			
			if (price<=450) {
				System.out.println("I will get them");
			} else if(price>450) {
				System.out.println("Fuck that tires its too pricy");
			}
		}
		
			

		
	    
	    
	    
	    
	    
		
		
		
		
	}
}
