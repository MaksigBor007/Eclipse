package com.syntax.class09;

public class ArrayAnotherWay {

	public static void main(String[] args) {
		
		String[] fruits= {"mango","apple","kiwi","pear"};
		
		System.out.println(fruits[2]);
            //fruits[4]="peach"; RE: ArrayIndexOutOfBoundException:4
		
		System.out.println("My favorite fruite is "+fruits[0]);  //mango
		
		//I want to find a size of an array/how many elements
		
		
		int size=fruits.length;
		
System.out.println(size);
	
	
	
	
	
	
}
}
