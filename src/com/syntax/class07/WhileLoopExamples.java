package com.syntax.class07;

public class WhileLoopExamples {

	public static void main(String[] args) {
		
		//print numbers from 1 to 10;
		
		int num=1;
		
		
		while(num<=10) {
		
			System.out.println(num);
			num++;//on the buttom we use increment after syso
			
		}		
			int num1=0;
			while(num1<10) {
				num1++;
				System.out.print(num1+" ");
			}
			//print from 10 to 100
			int a=10;
			while(a<=100) {
				System.out.println(a+" ");
				a++;
			}
			
			
			
			//print numbers from 10 to 1
			
			
		int b=10;
			
			while(b>=1) {
				System.out.println(b+" ");
				b--;
			}
			
			
			
			System.out.println("-------------------------------");
			
			
			//print from 100 to 50
			
			int c=100;
			while(c>=50) {
				System.out.println(c+" ");
				c--;
			}
		 
	System.out.println("-----------------------------------");
		
	          
	//print from -1 to -10
	short d=-1;
	while (d>=-10) {
		System.out.println(d+" ");
		d--;
	}
	System.out.println("--------------------------------");
	
	
	//print numbers from 1 to 20 but only even numbers
	
	// 1 way 
	int m=2;
	while(m<=20) {
			System.out.println(m+" ");
			m+=2;//m=m+2
		}  
		System.out.println();
			
		// 2 way
				int f=1;
				while (f<=20) {
					if(f%2==0)//   using to spacify even numbers only 
					{
					System.out.print(f+" ");
					}
				f++;
				}
		
				 int aa=20;
				   while(aa<=100) {
					   
					   System.out.print(a+" ");
					   aa+=2;                      // 20 22 24 26 28 30 32 34 36 38 40 ...... 100
				   }
				   System.out.println();
				   
				   int bb=99;
				   
				   while(bb>=1) {
					   System.out.println(b);   // 99 97 95 93 91 89 87 85 83 81 .......... 1
				   bb-=2;
				   }
				   // another way to create odd number from 100 to 1
                   int cc=100;
				   while(c>=1) {
					   if(cc%2!=0) {
					   System.out.println(b);   // 99 97 95 93 91 89 87 85 83 81 .......... 1
				   cc--;
					   }
	
				   }
		
		
		
		
		
		
		

	}

	}
