package com.syntax.class10;

public class TaskArray {

	public static void main(String[] args) {
		
		//Create an array to store char value and then prints it in reverse order
		char[] symbol= {'A','B','C','D','E','F'};

        for(int i=symbol.length-1;i>=0;i--) {
			
			System.out.println(symbol[i]+" ");
		}
System.out.println("-----------------------------------");


//find the largest number of array
		int[] num= {10,20,30,50,60};
		int max=num[0];

		 for(int i=1; i<num.length;i++) {
			 
			 if (num[i]>max) {
			 max=num[i];
			 }
			 
			 
			 
		 }System.out.println("The largest number is "+max);
			System.out.println("----------------------------------");
			
			// enhanced way
		 
			max=num[0];
			
			for (int array:num) {
				
				if(array>max) {
					max=array;
				}
			}System.out.println("The largest element is "+max);
			
			
			
			
	}

}
