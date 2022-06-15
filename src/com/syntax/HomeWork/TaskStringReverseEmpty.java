package com.syntax.HomeWork;

public class TaskStringReverseEmpty {

	public static void main(String[] args) {
		/*Create a String and if the String is not empty perform the following: 
		*if the String has an odd number of characters and has 3 or more characters, 
		*print the character in the middle of the String.
        */

	String str="Hello Whats Up?";
	if(!str.isEmpty()) {
		if(str.length()>3 || str.length()%2==1) {
			System.out.println(str.substring(6, 10));
		}
	}
	else {
		System.out.println(" String is empty");
	}
	
	
	//Create a String and print it in reverse order (Sunday → yadnuS).
	
	String str1="Sunday";
	String reversedString="";
	for (int i=str1.length()-1;i>=0;i--) {
		reversedString+=str1.charAt(i);	
	}
	System.out.println(reversedString);
	
	
	
	
	
	
	
	
	
	
	
	
}
}