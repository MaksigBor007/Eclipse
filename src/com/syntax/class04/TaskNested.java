package com.syntax.class04;

public class TaskNested {

	public static void main(String[] args) {
		
		boolean diploma=true;
		double gpaScore=5; 
		
		if (diploma) {
			System.out.println("Congratulations");
		}else {
			System.out.println("Get a degree");
		} if (gpaScore>=3.5) {
			System.out.println("You are elegible for scholarship");
		}else {
			System.out.println("You shoud have studied harder");
		}
	

		
		
		int mortgageRate=10;
		int mortgagePrice=10000;
		
		if(mortgageRate>4.5) {
			System.out.println("A user wont buy a house");
		}else {
			System.out.println("A user will consider buying a house");
		
		}if (mortgagePrice>50000){
			System.out.println("A User will take a loan");
		}else {
			System.out.println("A user will pay cash");
		}
		

	}

}
