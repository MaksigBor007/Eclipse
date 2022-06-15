package com.syntax.HomeWork;

import java.util.Scanner;

public class StringHW3 {
//Create a method that will print whether given String is palindrome or not.
	
	boolean palindrom (String str) {
      StringBuilder in=new StringBuilder(str); 
		in.reverse();
        if(in.reverse().equals(in))  {
	return true;	
	}else {
		return false;
	}
	}
	public static void main(String[] args) {
	StringHW3 shw3=new StringHW3 ();
	System.out.println(shw3.palindrom("kayak"));
	
	//another way to write palindrome
	 Scanner inp = new Scanner(System.in);
	    System.out.print("The word:");
	    String givenString = inp.nextLine();
	    StringBuilder in=new StringBuilder(givenString); 
     String b=in.reverse().toString();
     boolean boo=true;
     if(b.equals(givenString)) {
     boo=true;	
     }else {
     boo=false;
     }
     System.out.println(boo);    
	
	
	
	
	
	
	
	}

}
