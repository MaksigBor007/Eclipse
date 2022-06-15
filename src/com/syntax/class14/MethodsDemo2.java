package com.syntax.class14;

public class MethodsDemo2 {

	
	
	
	//write a method when called it should print 5 times Batch 13 is Great
	
	void print() {
		for(int i=0;i<6;i++) {
			System.out.println("Tara is great");
		}
	}
	
	
	void printManyTimes(int times) {
		for(int i=0;i<times;i++) {
			System.out.println("Tara is Great");
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
	
		MethodsDemo2 md=new MethodsDemo2();
		md.print();
		System.out.println("");
		md.printManyTimes(3);
		
		
		

	}

}
