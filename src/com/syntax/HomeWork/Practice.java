package com.syntax.HomeWork;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Is there sale today: yes or no?");
		String value=scan.next();
		
		double price=0;
		double discount=0.0;
		double discountedPrice=0.0;
		String item=null;
	     
		if(value.equalsIgnoreCase("Yes")) {
			System.out.println("Which item would you like to buy?");
			item=scan.next();
		}else{
			System.out.println("You are not going for shopping");
			}
		
        switch (item.toLowerCase()) {
	    case "chargercable":
	       price=15.99;
	    break;
	    case "laptop":
	       price=149.99;
	   	break;
	   	case"pixelbuds":
	       price=104.99;
	   	break;
	    case "flattv":
	       price=1299.99;
	    break;
	     }
	
            System.out.println("The price for the "+item+" is "+price+"CAD.");
         
         
        if(price<20) {
		    discount=10;
		    
		}else if(price>=20 && price<=100) {
		    discount=20;
		    
	    }else if(price>101 && price<=500) {
		    discount=30;
		    
		}else {   
			discount=50;
			
		}
      
            discountedPrice=((100-discount)*price)/100;
	        
	        System.out.println("After the discount of "+discount+"%"+" the price of the item is reduced from "+price+"CAD to "+discountedPrice+"CAD.");
        }

		
		
}
		