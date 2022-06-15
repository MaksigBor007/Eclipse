package com.syntax.class12;

public class StringDemo1 {

	public static void main(String[] args) {
		
		String name=new String("Oleg");//proper way of creating an object
		
		String name2="Oleg";//its same as String name=new String ("Oleg");
		
		//All the class in java can be treated as datatypes
		//If a class is present inside the same package or if a class belongs to java.lan package
		
		
		System.out.println(name.length());
		name2="Maksym";
		System.out.println(name2.length());
		
		String name3="Kirill";
		System.out.println(name3.length());
		
		String captain="NAVEED";
		System.out.println(captain.toLowerCase());
		captain="I love Java";
		System.out.println(captain.toUpperCase());
		
		
		
		

	}

}
