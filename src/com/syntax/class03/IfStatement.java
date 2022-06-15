package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {
		
		
		/*
		 * declare a veriable rate.
		 * if rate is more than 5--> I am not buying a house
		 */
		
		double mortgageRate=4.2;
		if (mortgageRate>5)	{
			System.out.println("I am not buying a house");
		}
	
	/*
	 * declare 2 veriables and check if num1 is bigger than num2
	 */
       int num1=99;
       int num2=10;
       
       if(num1>num2) {
       System.out.println(num1+" is a bigger than "+num2);
	}
       
       /*
        * declear temperature,
        * if temp is higer than 75 -> I will go a walk
        */
       
       int temp=68;
       if(temp>75) {
    	   
    	   System.out.println("I will go for a walk");
       }else //otherwise. Code comes to else 
    	   //when condition is fulse
    	   {
    	   System.out.println("I am going to study Java");
       }

       System.out.println("______________________________________________");
       
       char gender='n';
       if (gender!='f') {
    	   System.out.println("You like shopping");
       }else {System.out.println("You like watching sport");}
       
       
       System.out.println("---------------------------------------");
       
       String browser="chrome";
       
       if (browser.equals("chrome")) {
    	   System.out.println("All test cases will be executed via chrome");
    	   
       }else { System.out.println("I am not executing eny cases");
}
	
}
}