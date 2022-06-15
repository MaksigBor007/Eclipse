package com.syntax.class13;

public class StringBuilderDemo1 {

	public static void main(String[] args) {
	
		//String and StringBuilder both are classes that we can use to store and manipulate characters
		//But String is immutable(unchangeable) and StringBuilder is mutable(changeable)
		//when we make a lot of changes to a String it creates multiple copies inside your memory and
		//because of this reason because for every change a new variable is created
		
		StringBuilder str=new StringBuilder("Helo");
		str.reverse();
		System.out.println(str);
		
		//When to use a String and when to use a StringBuilder
		//I want the fastest declaration and I dont care about memory being wasted --> Go with StringBuilder
		//I want to save as much memory as possible and its fine my program is a little slow -->Go with String
		//why string are mutable what is multithreading and synchronization
		
		
		
		
		
		
		
		
		
		

	}

}
