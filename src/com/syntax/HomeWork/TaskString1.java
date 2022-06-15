package com.syntax.HomeWork;

import java.util.Scanner;

public class TaskString1 {

	public static void main(String[] args) {
		 //How would you reverse a String word by word? for example
			// input=>This is sentence i want to reverse
			// output=>sihT si ecnetnes i tnaw ot esrever
		
		String rev=new String("This is sentanse i want to reverse");
		String[] arr=rev.split(" ");
		for(String s:arr) {
			System.out.print(new StringBuilder(s).reverse()+" ");
		}
		
		/*How would you check if String is palindrome or not? 
		 * aba=> true Abbc =>false
		 */
		
	StringBuilder in=new StringBuilder("aba");
	boolean palindrome=true;
	in.reverse();
	if(in.reverse().equals(in)) {
	palindrome=true;
	}else {
		palindrome=false;
	} System.out.println(palindrome);
	
	//another way of writing palindrome
	
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
		
		//How would you swap  2 strings without a temporary variable?
		String me="I am the best tester ever";
		String me1="I am the best QA engineer";
		String swap="";
		me+=me1;
		me1=me.substring(0, me.length()-me1.length());
		me=me.substring(me1.length());
		System.out.println("Before swap "+me+" after swap "+me1);
		
		
		
		
		

	}

}
