package com.syntax.class03;

public class IdditionOrConcatination {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		String c="Hi";
		String d="Hello";
		
		System.out.println(a+b+c+d);//30HiHello
		System.out.println(a+c+b+d);//10Hi20Hello
		System.out.println(c+d+a+b);// HiHello1020
		System.out.println(c+d+(a+b));//HiHello30
		
		boolean boo=true;
		System.out.println(c+boo);//hitrue
		
		
		int num=100;
		num=num+100;
		
		System.out.println(num);//200
		num=num+50;
		
		System.out.println(num);//250
		
		num+=100;//num=num+100
		num-=10;
		
		System.out.println(num);//340
		
		num/=10;
		num*=2;
		
		System.out.println(num);//68
		
		num%=2;
		System.out.println(num);//0
		
		
		

	}

}
