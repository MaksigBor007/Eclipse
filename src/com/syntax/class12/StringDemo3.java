package com.syntax.class12;

public class StringDemo3 {

	public static void main(String[] args) {
	     String str="Batch 13 is Great";
	     System.out.println(str.startsWith("Frozen"));// search start of String
	     System.out.println(str.endsWith("t"));//search of end of String
	     System.out.println(str.endsWith("Greatr"));
	     System.out.println(str.toLowerCase().endsWith("great"));

	     String name="Maks";
	     System.out.println(name.toLowerCase());
	     System.out.println(name);
		
	     System.out.println(str.contains("13"));// search in between String
	     System.out.println(str.toLowerCase().contains("Batch"));
		
		
		
		
		
		
}
}
