package com.syntax.HomeWork;

public class HwString {

	public static void main(String[] args) {
		/*Create a String that will hold a sentence. 
		 * Write a program to get a new String without any spaces.
		 */

		String sent=" Hello Buddy How is the weather outside?";
		
		System.out.println(sent.replace(" ", "") );
		
		/*Create a String that should be combination of letters, 
		 * numbers and special characters. 
		 * Find out how many Alphanumeric characters are there in the String.
		 */
		
		String sent1="AaaaBbbb1111222@#$%";
		System.out.println(sent.replaceAll("[^A-Za=z0-9]","").length());
		
		/*You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?” 
		 * How would you find out how many sentences are in that String?
		 */
		String a="Is it saturday? Is it raining? Do we have a Java Class today?";
		int count=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='?') {
				count++;
				System.out.print(count+" ");
			}
		}System.out.println();
		String b="Is it saturday? Is it raining? Do we have a Java Class today?";
		System.out.println(b.replaceAll("[^?]","").length() );
		
		
	
}
}
