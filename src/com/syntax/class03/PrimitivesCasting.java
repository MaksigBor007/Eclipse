package com.syntax.class03;

public class PrimitivesCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i=100;
		double d=100;//widening
		
		System.out.println(i);
		System.out.println(d);
		
		int x=(int)99.99; // Type dismatch explicit casting we narrowed it
		                 // can not convert from double to in
		System.out.println(x);
		
		/*byte b=130; can not convert from int to byte
		 * int i=10.99 can not convert from double to int
		 */
		
		byte b=(byte)130;
		
		System.out.println(b);
		
		
		/*float f=10.99f can not convert from double to float
		 */
		
		
	}

}
