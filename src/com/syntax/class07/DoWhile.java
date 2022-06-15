package com.syntax.class07;

public class DoWhile {

	public static void main(String[] args) {
	
		int num=1;
		
		/*while loop first check the condition
		 * and only than executes the block of code
		 */
		while(num<=3) {
			
			System.out.print(num+" ");
			num++;
		}

		System.out.println();
		
		/*
		 * do while first executes the code
		 * and only then checks the condition
		 * 
		 */
		int num1=1;
		do {
			
			System.out.print(num+" ");
		num1++;
		} while(num1<=3);
		
		System.out.println();
		//print numbers 1 to 30 using do while
		int num2=1;
		do {
			System.out.print(num2+" ");
		num2++;
		} while (num2<=30);
		 
		System.out.println();
		
		 //print even number from 70 to 30
		 int num3=70;  
		 do {
			System.out.print(num3+" ");
			num3-=2;
		}while(num3>=30);
		
		 System.out.println();
		 
		 // another way
		  int num4=70;  
		  do {
			 if(num4%2==0)
			System.out.print(num4+" ");
			num4--;
		}while(num4>=30);
	}
}
