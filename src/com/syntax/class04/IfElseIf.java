package com.syntax.class04;

public class IfElseIf {

	public static void main(String[] args) {
		
		/*
		 * declare 2 numbers and verify which one is the largest,
		 * 
		 */
		
		int num1=10;
		int num2=10;
		
		if(num1>num2) //if - needs to have boolean expression always 
		{
			
			System.out.println(num1+" is larger than "+num2);
		}else if (num2>num1){
			System.out.println(num2+" is larger than "+num1);
		}else {System.out.println(num1+" is equal to "+num2);

	}
System.out.println("-------------------------------------");

int month=5;
    month=10;
if (month==1) {
System.out.println("January");
}else if(month==2){
System.out.println("Febreary");
}else if(month==3){
System.out.println("March");
}else if(month==4){
System.out.println("April");
}else if(month==5){
System.out.println("May");
}else if(month==6){
System.out.println("June");
}else if(month==7){
System.out.println("July");
}else if(month==8){
System.out.println("August");
}else if(month==9){
System.out.println("September");
}else if(month==10){
System.out.println("October");
}else if(month==11){
System.out.println("November");
}else if(month==12){
System.out.println("December");
}

System.out.println("---------------------------");

boolean mothersDay=true;

if(mothersDay) {
	System.out.println("Happy Mothers Day to all Moms");
}else { System.out.println("Hello");
}

System.out.println("---------------------");

boolean rain=false;

if(rain) {
	System.out.println("I will take an umbrella");
}else {
	System.out.println("No need for umbrella");
}
}
}