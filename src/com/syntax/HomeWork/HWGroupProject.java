package com.syntax.HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class HWGroupProject {

	public static void main(String[] args) {
		
		/*Using Scanner create an array of integer values. 
		 * After the array is created, calculate the sum of all stored elements in that array.
		 */
	
	Scanner scan=new Scanner (System.in);
     
	System.out.println("Please Enter the size of the array that you want to create");
	int arraySize=scan.nextInt();
	
	System.out.println("the size of the arrays is "+ arraySize);
	int [] integerArray=new int[arraySize];
	//we can't use enhanced for loop for inserting or updating the values of an array
	System.out.println("Please enter "+arraySize+" elements");
	for(int i=0;i<integerArray.length;i++) {
		integerArray[i]=scan.nextInt();
	}
	
	System.out.println(Arrays.toString(integerArray));
	
	int sum=0;
	for(int element:integerArray) {
		sum=sum+element;
	}
	
	System.out.println("The sum of all the elemnts is "+sum);
	  
	  }
	  
		System.out.println("-------------------------------------------------------");

		/*Using Scanner create an array of countries. 
		 * When an array is created, retrieve all values from it and 
		 * while retrieving those values print capital for each country. 
		 * (use 2 different loops).
		 */
		Scanner scan=new Scanner (System.in);
	     
		String capital=null;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter the size of the array that you want to create");
		int arraySize=scanner.nextInt();
		String [] countryArray=new String[arraySize]; //creating an array of size that will be entered by user
		for(int i=0;i<countryArray.length;i++) {
			countryArray[i]=scanner.next(); //taking the input from the user and storing it inside the array
		}
		
		for(String element:countryArray) {
			if(element.equalsIgnoreCase("usa")) {
				capital="Washington DC";
			}else if(element.equalsIgnoreCase("turkey")) {
				capital="Anakara";
			} else if(element.equalsIgnoreCase("Thailand")) {
			     capital="Bangkok";
			}else {
				System.out.println("Contry not supported by My Great java program version 1.0");
			}
		System.out.println("The capital of "+element+" is "+capital);
		
		
		System.out.println("-----------------------------------------------------------------------");
		
		// do while loop
        String capital=null;
		
		String[]countries=new String[4];
		countries[0]="USA";
		countries[1]="Ukraine";
		countries[2]="Mongolia";
	    countries[3]="Canada";
	    int i=0;
		do{System.out.println(countries[i]);
		i++;
		} 
		while( i<countries.length); {

		System.out.println("Enter country's name");
		String country=scan.next();
		if(country.equalsIgnoreCase("USA")) {
			capital="Washongton DC";
		}else if(country.equalsIgnoreCase("Ukraine")) {
			capital=("Kyiv");
		}else if(country.equalsIgnoreCase("Mongolia")) {
			capital=("Ulaanbaatar");
		}else if(country.contentEquals("Canada")) {
			capital="Ottawa";
		}
		
	System.out.println("The capital of "+country+" is "+capital);
		
		}		
		
		System.out.println("--------------------------------------------------------------");
		
		
		//Create a 2D array of integer values. Print the sum of all numbers.

			int [][] arr= { {10,15,10},
			                {20,50,20},
			                {30,30,30}
			                };

	//System.out.println(arr[0][0]);
	//System.out.println(arr[0][1]);
	//System.out.println(arr[0][2]);
	//System.out.println(arr[1][0]);
	//System.out.println(arr[1][1]);
	//System.out.println(arr[1][2]);
	//System.out.println(arr[2][0]);
	//System.out.println(arr[2][1]);
	//System.out.println(arr[2][2]);

	int sum=0;
	for(int j=0; j<arr.length;j++) {
		
		for(int i=0;i<arr[j].length; i++) {
			sum=sum+arr[j][i];
		}
		
	}
	System.out.println(sum);
		
		System.out.println("------------------------------");
		
		
		/*Create a 2D array or integer type where you will store odd and even numbers. 
		 * Develop a program which will identify/print the even numbers only.
		 */
	
		int [][] arr= { {10,15,10},
		                {20,50,20},
		                {30,30,30}
		                };
		
			for(int j=0; j<arr.length;j++) {
			
			for(int i=0;i<arr[j].length; i++) {
				if(arr[j][i]%2==0) {
					System.out.println(arr[j][i]);
				}
			}
			}
		}
        

		/*Write a Java Program to print the first 10 numbers of Fibonacci series.
		 */
		
		/
		int previousNumber=0;
		int currentNumber=1;
		int nextNumber=0;
		int numbersToPrint=10;
		
		System.out.print(0+" ");
		System.out.print(1+" ");
		
		for (int i=0;i<=numbersToPrint-2;i++) {
			nextNumber=previousNumber+currentNumber;
			System.out.print(nextNumber+" ");
			previousNumber=currentNumber;
			currentNumber=nextNumber;
		
		}	
		
	
		/*Write a java program to find the second largest number in the array?.
		 */
		
		
	
  
		int [] numbers= { 10,20,50,5,8};
		int lrg1=0; 
		int lrg2=0;
		for(int l=0;l<numbers.length;l++) {
			if(numbers[l]>lrg1) {
			lrg2=lrg1;
			lrg1=numbers[l];
		}
			else if(numbers[l]>lrg2) { 
		lrg2=numbers[l];}
			
		}
		System.out.println(lrg2);
		
		
		System.out.println("----------------------");

		
		int [] numbers= { 10,20,5,8,200};
		int maxNumber=numbers[0]; 
		int secondLargest=numbers[0];
		
		for(int num:numbers) {
			if(num>maxNumber) {
			secondLargest=maxNumber;
				maxNumber=num;
			
		}
			if(num>secondLargest && secondLargest<maxNumber&&num<maxNumber) { 
		secondLargest=num;
			}
			
		}
		System.out.println(maxNumber);
		System.out.println(secondLargest);
		
		
		System.out.println("------------------------------------------");
		
		/*Create a 2D array of integers. 
		 * Develop a program which will calculate the sum of  even and odd numbers for that array.
		 */
			
		int array[][]= {
				{1,2,5,7,9,10},
				{2,5,9,10,11,12},
		};
		int oddNum=0; 
		int evenNum=0;
		for (int i=0;i<array.length;i++){
			for (int y=0; y<array[i].length;y++) {
				if (array[i][y]%2==0) {	
				evenNum+=array[i][y];
				} 
				else{
			oddNum+=array[i][y];
		}
			
		}
		}
		System.out.println(evenNum);
		System.out.println(oddNum);

		
		
		//Write a program to swap 2 numbers without a temporary variable?
		
		
		double first=20.99;
		double second=12.89;
		
		System.out.println("Before swap "+first+" "+second);
		first=first+second;//1=1+2
		second=first-second;//2=1-2
	    first=first-second;//2=1-2
	    System.out.println("After swap "+first+" "+second);
			    
			    
			  //Maximum and minimum number in the array?
				
				int [] numbers= {5,12,450,2200,2,99,6,1200,8,0};
				int max=numbers[0];
				int min=numbers[0];
				
				for(int i=0;i<numbers.length;i++) {
					if(max<numbers[i]) {
					   max=numbers[i];
					}
					if(min>numbers[i]) {
					   min=numbers[i];
					}
				}
				System.out.println("Max numbers is:"+max);
				System.out.println("Min numbers is:"+min);
	
				//Write a java program to check whether a given number is prime or not?
				
				int x=33;
				boolean isPrime=true;
				if(x>1) {
				 for(int i=2;i<x;i++) {
					if(x%i==0) {
					  isPrime=false;
					  break;
							}
					        }
					}else {
					isPrime=false;
				}
				if(isPrime) {
				System.out.println(x+" is Prime ");
				}else {
					System.out.println(x+" is not Prime");
				}
	
			  //Write a program to print out duplicate elements from an Array of Strings?

				  
				String [] array= {"Maks","Aleksandr","Maks","Oleg","Ramiar","Ramiar"};
				
				for(int i=0;i<array.length;i++) {
					for(int j=i+1;j<array.length;j++) {
						
						if(array[i]==array[j]) {
							System.out.println(array[j]);
						}
					}
				}
	
				System.out.println("----------------------------")	

				String[] arr= {"AA","B","C","A","B"};
				
				for(int i=0; i<arr.length;i++) {
					
					for(int j=i+1; j<arr.length;j++) {
						
						if(arr[i].equals(arr[j])&& i!=j){
							System.out.println(arr[i]);
						}
					}
				}
}
}