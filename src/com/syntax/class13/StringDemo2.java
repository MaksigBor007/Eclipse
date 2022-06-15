package com.syntax.class13;

public class StringDemo2 {

	public static void main(String[] args) {
		
		
String str="sfkafdb18247t8725KSNDKASD!@#$((%^^";
    
    System.out.println(str.replaceAll("[0-9]", "#"));
    System.out.println(str.replaceAll("[a-z]", "#"));
	System.out.println(str.replaceAll("[A-Z]", "#"));	
	System.out.println(str.replaceAll("[A-Za-z0-9]", "#"));	
	System.out.println(str.replaceAll("[A-Za-z0-9]", "#"));
	System.out.println(str.replaceAll("[^a-z]", "_"));
		System.out.println(str.replaceAll("[^A-Za-z0-9]", "*"));
		str="abcdefghijkl";
		System.out.println(str.replaceAll("[a-f]","*"));
		str="sfkafdb18247t8725KSNDKASD!@#$((%^^";
		System.out.println(str.replaceAll("[^A-za-z0-9]",""));// remove the special characters
	}

}
