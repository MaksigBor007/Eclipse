package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		boolean vaccine=false;
		int dose=1;
		
		if(vaccine) {
			System.out.println("Let me check how many doses you got");
			
			if(dose==1) {
				System.out.println("You need 1 more shot");
			}else {
				System.out.println("You are fully vaccinated");
			}
		}
		
		String month="June";
		int day=19;
		
		if(month.equals("May"))// if outter  condition is true it allows us to execute block of codes bellow with nested if 
		{       System.out.println("Let me check what is todays date");
			
		if (day==8) //nested block of code always depends on outter condition
		{
				System.out.println("Today is a Mothers day");
			
		}
		}else if(month.equals("June"))//otter condition
		{
				System.out.println("Let me check day in June");
			
		 if (day==19) //nested inner condition 
		 {
				System.out.println("Today is a Fathers Day");
			}
			}
			
		
		
		
		
		

	}
}
